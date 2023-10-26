package org.example.models;

public class Category {
    private int categoryId;
    private String categoryName;

    public Category(int categoryId, String categoryName){
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void info(){
        System.out.println("Category ID: " + this.getCategoryId());
        System.out.println("Category Name: " + this.getCategoryName());
        System.out.println("--------------------------------");
    }

}
