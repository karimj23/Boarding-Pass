package com.company;

import java.io.*;

public class Passenger {
    String name;
    String email;
    int phoneNumber;
    String gender;
    int age;
    int date;

    public Data writeToFile = new Data();

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return this.gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }

    public void storeData() {
        String fileName = "output/Passenger.txt";
        boolean append = true;
        try {
            this.writeToFile.writeToAFile(fileName,"NAME",String.valueOf(this.getName()).toUpperCase(),!append);
            this.writeToFile.writeToAFile(fileName,"EMAIL",String.valueOf(this.getEmail()).toUpperCase(),append);
            this.writeToFile.writeToAFile(fileName,"GENDER",String.valueOf(this.getGender()),append);
            this.writeToFile.writeToAFile(fileName,"AGE",String.valueOf(this.getAge()),append);
            this.writeToFile.writeToAFile(fileName,"PHONE NUMBER",String.valueOf(this.getPhoneNumber()),append);
            this.writeToFile.writeToAFile(fileName,"Date",String.valueOf(this.getDate()),append);
        } catch (IOException e) {
            System.out.println("File written not successful");
        }
    }
}