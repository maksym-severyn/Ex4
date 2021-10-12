package com.isa;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {
    private String name;
    private String streetName;
    private String numberOfBuilding;
    private String numberOfApartment;
    private int phoneNumber;
    private ArrayList<String> orderParticularParts = new ArrayList<>();

    public Client(String name, String streetName, String numberOfBuilding, String numberOfApartment, int phoneNumber) {
        this.name = name;
        this.streetName = streetName;
        this.numberOfBuilding = numberOfBuilding;
        this.numberOfApartment = numberOfApartment;

        phoneNumberValidator(phoneNumber,"(\\+48)?\\d{9}");
    }

    public Client(String name, String streetName, String numberOfBuilding, String numberOfApartment) {
        this.name = name;
        this.streetName = streetName;
        this.numberOfBuilding = numberOfBuilding;
        this.numberOfApartment = numberOfApartment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getNumberOfBuilding() {
        return numberOfBuilding;
    }

    public void setNumberOfBuilding(String numberOfBuilding) {
        this.numberOfBuilding = numberOfBuilding;
    }

    public String getNumberOfApartment() {
        return numberOfApartment;
    }

    public void setNumberOfApartment(String numberOfApartment) {
        this.numberOfApartment = numberOfApartment;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private void phoneNumberValidator(int phoneNumber, String rules) {
        Pattern ptrn = Pattern.compile(rules);
        Matcher match = ptrn.matcher(String.valueOf(phoneNumber));
        if(match.matches()) {
            this.phoneNumber = phoneNumber;
        } else System.out.println("Źle wprowadzony numer telefonu użytkownika: " + this.name);
    }

    public ArrayList<String> getOrderParticularParts() {
        return orderParticularParts;
    }

    public void addParticularOrderPart(String... parts) {
        for (String i: parts) {
            this.orderParticularParts.add(i);
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", streetName='" + streetName + '\'' +
                ", numberOfBuilding='" + numberOfBuilding + '\'' +
                ", numberOfApartment='" + numberOfApartment + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}