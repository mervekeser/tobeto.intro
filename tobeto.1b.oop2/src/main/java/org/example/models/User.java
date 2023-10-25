package org.example.models;

public class User {
    private String contactName;
    private String phone;

    public User(String contactName, String phone) {
        this.contactName = contactName;
        this.phone = phone;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
