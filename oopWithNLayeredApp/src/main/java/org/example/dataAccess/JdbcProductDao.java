package org.example.dataAccess;

import org.example.entities.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product product){
        //sadece db erişim kodları buraya yazılır... SQL
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
//Dao --> Data Access Object
//Hibernate geldi ve Jdbc sistemini buna geçiriyoruz
