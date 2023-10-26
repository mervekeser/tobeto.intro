package org.example;

import org.example.models.Category;
import org.example.models.Order;
import org.example.models.Product;
import org.example.models.User;

public class Main {
    public static void main(String[] args) {

        Category category = new Category(1, "Beverages");
        Category category1 = new Category(2, "Condiments");
        Category category2 = new Category(3, "Confections");

        System.out.println("\n--------  Categories  --------");
        category.info();
        category1.info();
        category2.info();

        Product product = new Product("Chai", 18);
        Product product1 = new Product("Chang", 19);
        Product product2 = new Product("Aniseed Syrup", 28);

        System.out.println("\n\n--------  Products  ---------");
        product.info();
        product1.info();
        product2.info();


        Order order = new Order(10248, "Vins et alcools Chevalier");
        Order order1 = new Order(10249, "Toms Spezialitäten");
        Order order2 = new Order(10250, "Hanari Carnes");

        System.out.println("\n\n-------  Orders  -------");
        order.info();
        order1.info();
        order2.info();

        User user = new User("Maria Anders", "030-0074321");
        User user1 = new User("Ana Trujillo", "0921-12 34 65");
        User user2 = new User("Antonio Moreno", "0621-08460");

        System.out.println("\n\n--------  Users  ----------");
        user.info();
        user1.info();
        user2.info();

    }
}