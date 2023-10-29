package org.example.dataAccess;

import org.example.entities.Car;

public class HibernateCarDao implements CarDao{
    @Override
    public void add(Car car) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
