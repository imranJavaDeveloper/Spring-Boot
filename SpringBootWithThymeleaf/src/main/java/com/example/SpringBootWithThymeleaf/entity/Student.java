package com.example.SpringBootWithThymeleaf.entity;

public class Student {
    private  int id;
    private String name;
    private String email;

    private String phone_Number;

    public Student(int id, String name, String email, String phone_Number) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone_Number = phone_Number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        this.phone_Number = phone_Number;
    }
}
