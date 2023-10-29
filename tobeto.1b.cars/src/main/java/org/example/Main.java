package org.example;

import org.example.bussiness.CarManager;
import org.example.dataAccess.HibernateCarDao;
import org.example.dataAccess.JdbcCarDao;
import org.example.entities.Car;

public class Main {
    public static void main(String[] args) throws Exception{
        CarManager carManager = new CarManager(new HibernateCarDao());

        Car car = new Car("Volvo", "Grey", "XC60", 500000, false,1);
        car.printCars();
        carManager.add(car);


        Car car1 = new Car("BMW", "Red", "T50", 600000, true,2);
        car1.printCars();
        carManager.add(car1);


    }
}