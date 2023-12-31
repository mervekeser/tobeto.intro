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
        category.printCategory();
        category1.printCategory();
        category2.printCategory();

        Product product = new Product("Chai", 18);
        Product product1 = new Product("Chang", 19);
        Product product2 = new Product("Aniseed Syrup", 28);

        System.out.println("\n\n--------  Products  ---------");
        product.printProduct();
        product1.printProduct();
        product2.printProduct();


        Order order = new Order(10248, "Vins et alcools Chevalier");
        Order order1 = new Order(10249, "Toms Spezialitäten");
        Order order2 = new Order(10250, "Hanari Carnes");

        System.out.println("\n\n-------  Orders  -------");
        order.printOrder();
        order1.printOrder();
        order2.printOrder();

        User user = new User("Maria Anders", "030-0074321");
        User user1 = new User("Ana Trujillo", "0921-12 34 65");
        User user2 = new User("Antonio Moreno", "0621-08460");

        System.out.println("\n\n--------  Users  ----------");
        user.printUser();
        user1.printUser();
        user2.printUser();

    }
}