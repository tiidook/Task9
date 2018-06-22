package by.rentalCars.controller;

import by.rentalCars.exceptions.AddingCarException;
import by.rentalCars.exceptions.AutoparkIsNorExistException;
import by.rentalCars.exceptions.RemovingCarExceprion;
import by.rentalCars.model.entity.Car;
import by.rentalCars.model.entity.Container.Autopark;
import by.rentalCars.model.entity.passengerCar.Sedan;
import by.rentalCars.model.entity.passengerCar.Van;
import by.rentalCars.model.entity.truck.PickUp;
import by.rentalCars.model.entity.truck.SUV;
import by.rentalCars.model.manager.generateLogic.passengerCar.RandomablePassengerCar;
import by.rentalCars.model.manager.generateLogic.passengerCar.generationSedan.GenerationPersonalSedanData;
import by.rentalCars.model.manager.generateLogic.passengerCar.generationSedan.GenerationSedanData;
import by.rentalCars.model.manager.generateLogic.passengerCar.generationVan.GenerationPersonalVanData;
import by.rentalCars.model.manager.generateLogic.passengerCar.generationVan.GenerationVanData;
import by.rentalCars.model.manager.generateLogic.truck.RandomableTruck;
import by.rentalCars.model.manager.generateLogic.truck.generationPuckUp.GenerationPersonaLPickUpData;
import by.rentalCars.model.manager.generateLogic.truck.generationPuckUp.GenerationPickUpData;
import by.rentalCars.model.manager.generateLogic.truck.generationSUV.GenerationPersonalSUVData;
import by.rentalCars.model.manager.generateLogic.truck.generationSUV.GenerationSUVData;
import by.rentalCars.model.manager.logic.pickUpLogic.PickUpLogic;
import by.rentalCars.model.manager.logic.sedanLogic.SedanLogic;
import by.rentalCars.model.manager.logic.suvLogic.SuvLogic;
import by.rentalCars.model.manager.logic.vanLogic.VanLogic;
import by.rentalCars.model.manager.util.instance.InstanceVan;
import by.rentalCars.model.manager.util.Util;
import by.rentalCars.view.Printer;
import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) throws AutoparkIsNorExistException {

        RandomableTruck randomableSUV = new GenerationSUVData();
        RandomableTruck randomablePickUp = new GenerationPickUpData();
        RandomablePassengerCar randomableSedan = new GenerationSedanData();
        RandomablePassengerCar randomableVan = new GenerationVanData();

        Autopark autopark = new Autopark();

        int countCars = 20;
        int defaultCountCars = 1;
        Util.createAutopark(autopark,countCars);


        try {
            System.out.println(Util.getAutoparkSize(autopark));
        } catch (AutoparkIsNorExistException ex){
            ex.printStackTrace();
        }

        for (int i = 0; i < 5; i++){
            SUV suv = new SUV();

            suv.setName(randomableSUV.generateName());
            suv.setPower(GenerationPersonalSUVData.generatePower());
            suv.setWheelDiameter(GenerationPersonalSUVData.generateWheelDiametre());
            suv.setCarryingCapacity(randomableSUV.generateCarryingCapacity());
            suv.setId(randomableSUV.generateId(autopark));
            suv.setCountOfWheels(randomableSUV.generateCountWheels());
            suv.setPriceForCar(randomableSUV.generatePriceForCar());
            suv.setTankCapacity(randomableSUV.generateTankCapaCity());
            suv.setPriceForHour(randomableSUV.generatePriceForHour());

            try {
                Util.addCar(autopark, suv);
            } catch (AutoparkIsNorExistException ex){
                ex.printStackTrace();
            }finally {
                Util.createAutopark(autopark,defaultCountCars);
            }
        }

        for (int i = 0; i < 5; i++){
            PickUp pickUp = new PickUp();

            pickUp.setName(randomablePickUp.generateName());
            pickUp.setRemovableRoof(GenerationPersonaLPickUpData.generateRemovableRoof());
            pickUp.setBodyVolume(GenerationPersonaLPickUpData.generareBodVolume());
            pickUp.setTorque(GenerationPersonaLPickUpData.generareBodVolume());
            pickUp.setCarryingCapacity(randomablePickUp.generateCarryingCapacity());
            pickUp.setId(randomablePickUp.generateId(autopark));
            pickUp.setCountOfWheels(randomablePickUp.generateCountWheels());
            pickUp.setPriceForCar(randomablePickUp.generatePriceForCar());
            pickUp.setTankCapacity(randomablePickUp.generateTankCapaCity());
            pickUp.setPriceForHour(randomablePickUp.generatePriceForHour());

            try {
                Util.addCar(autopark, pickUp);
            } catch (AutoparkIsNorExistException ex){
                ex.printStackTrace();
            } finally {
                Util.createAutopark(autopark,defaultCountCars);
            }
        }

        for (int i = 0; i < 5; i++){
            Van van = new Van();

            van.setCountSeats(GenerationPersonalVanData.generateCountSeats());
            van.setDistanceReserve(GenerationPersonalVanData.generateDistanceReserve());
            van.setTrunk(GenerationPersonalVanData.generateTrunkExist());
            van.setId(randomableVan.generateId(autopark));
            van.setName(randomableVan.generateName());
            van.setPriceForCar(randomableVan.generatePriceForCar());
            van.setPriceForKilometre(randomableVan.generatePriceForKilometreI());

            try {
                Util.addCar(autopark, van);
            } catch (AutoparkIsNorExistException ex){
                ex.printStackTrace();
            }finally {
                Util.createAutopark(autopark,defaultCountCars);
            }
        }

        for (int i = 0; i < 5; i++){
            Sedan sedan = new Sedan();

            sedan.setDriveUnit(GenerationPersonalSedanData.generateDriveUnit());
            sedan.setPetFriendly(GenerationPersonalSedanData.generateIsPetFriendly());
            sedan.setPower(GenerationPersonalSedanData.generatePower());
            sedan.setId(randomableSedan.generateId(autopark));
            sedan.setName(randomableSedan.generateName());
            sedan.setPriceForCar(randomableSedan.generatePriceForCar());
            sedan.setPriceForKilometre(randomableSedan.generatePriceForKilometreI());

            try {
                Util.addCar(autopark, sedan);
            } catch (AutoparkIsNorExistException ex){
                ex.printStackTrace();
            }finally {
                Util.createAutopark(autopark,defaultCountCars);
            }
        }


        Car[] auto = autopark.getAutopark();

        Printer.print("All autopark : ");

        System.out.println(" lenght " + auto.length);

        if (auto != null) {

            for (Car car : auto) {

                if (car != null) {
                    Printer.print(car.toString());
                }
            }
        } else {
            Printer.print("There are no one car");
        }

        Van[] vans = InstanceVan.getVans(autopark);
        Printer.print("All the vans : ");

        if (vans != null) {

            for (Van van : vans) {

                if (van != null) {
                    Printer.print(van.toString());
                }
            }
        }else {
            Printer.print("There are no one van");
        }


        Printer.print("Max Body Volume : " + PickUpLogic.getMaxBodyVolume(autopark).toString());
        Printer.print("Max Price For Hour" + PickUpLogic.getMaxPriceForHourPickUp(autopark).toString());
        Printer.print("Max SUV's tank capacity" + SuvLogic.getMaxTankCapacitySUV(autopark).toString());
        Printer.print("Max SUV's wheel diametre" + SuvLogic.getMaxWheelDiametre(autopark).toString());
        Printer.print("Most expensive sedan for customer" + SedanLogic.getMaxPriceForKmSedan(autopark).toString());
        Printer.print("Most powerful sedan" + SedanLogic.getMostPowerfulSedan(autopark).toString());
        Printer.print("Max Distanse Reserve" + VanLogic.getMaxBodyDistanceReserve(autopark));
        Printer.print("Most expensive van for customer" + VanLogic.getMaxPriceForKmVan(autopark));
    }
}
