package org.example;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image.jpg");

                       //set value
       /* product1.name = "Delonghi Kahve Makinesi";
        product1.unitPrice = 7500;
        product1.discount = 7;
        product1.unitsInStock = 3;
        product1.imageUrl = "gorsel.jpg"; */

                          //get
        //System.out.println(product1.name);

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(8);
        product2.setUnitPrice(6500);
        product2.setUnitsInStock(4);
        product2.setImageUrl("image2.jpg");

        /*product2.name = "Smeg Kahve Makinesi";
        product2.unitPrice = 6500;
        product2.discount = 8;
        product2.unitsInStock = 4;
        product2.imageUrl = "image2.jpg"; */

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(9);
        product3.setUnitPrice(4500);
        product3.setUnitsInStock(2);
        product3.setImageUrl("image3.jpg");

        /* product3.name = "Kitchen Aid Kahve Makinesi";
        product3.unitPrice = 4500;
        product3.discount = 9;
        product3.unitsInStock = 2;
        product3.imageUrl = "image3.jpg"; */

        Product[] products = {product1, product2, product3};

        System.out.println("<ul>");
        for (Product product : products){
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("0533333333");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Merve");
        individualCustomer.setLastName("Keser");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("0522222222");
        corporateCustomer.setTaxNumber("1111111111");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = {individualCustomer, corporateCustomer};


    }
}