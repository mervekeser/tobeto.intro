package org.example.business;

import org.example.core.logging.Logger;
import org.example.dataAccess.HibernateProductDao;
import org.example.dataAccess.JdbcProductDao;
import org.example.dataAccess.JdbcProductDao;
import org.example.dataAccess.ProductDao;
import org.example.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;
    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product1) throws Exception{
        //iş kuralları buraya yazılıyor
        if(product1.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
        }

        //ProductDao productDao = new JdbcProductDao(); //Buraya JdbcProductDao yazsak onuda kabul eder
        productDao.add(product1);                          //bir katman başka bir katmanın classını kullanıyorken

        for (Logger logger: loggers) { //[db, file, mail]
            logger.log(product1.getName());
        }                                                   // sadece interface'inden erişim kurmalıdır
    }
}
