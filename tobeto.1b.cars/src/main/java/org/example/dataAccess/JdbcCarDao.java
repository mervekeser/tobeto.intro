package org.example.dataAccess;

import org.example.entities.Car;

public class JdbcCarDao implements CarDao{
    @Override
    public void add(Car car) {
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
