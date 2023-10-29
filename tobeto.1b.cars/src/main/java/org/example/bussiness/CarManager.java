package org.example.bussiness;

import org.example.dataAccess.CarDao;
import org.example.entities.Car;

public class CarManager {
    private CarDao carDao;

    public CarManager(CarDao carDao) {
        this.carDao = carDao;
    }

    public void add(Car car) throws Exception{
        if(car.isDamaged()){
            throw new Exception("Accident: true --> " + "Hasarlı araç sisteme eklenemez");
        }

        if(car.getBaggageCapacity()<1){
            throw new Exception("En az 1 çanta bagaj yeri olmalı");
        }

        car.setId(car.getBrand()+car.getColor()+car.getModel());
        System.out.println("ID: " + car.getId());
        carDao.add(car);

    }

}
