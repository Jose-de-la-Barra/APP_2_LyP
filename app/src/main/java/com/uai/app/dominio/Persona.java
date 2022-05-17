package com.uai.app.dominio;

import com.opencsv.bean.CsvBindByName;

public class Persona implements Comparable<Persona>{

    public Persona() {
    }

    @CsvBindByName(column = "name")
    private String name;

    @CsvBindByName(column = "address")
    private String address;

    @CsvBindByName(column = "country")
    private String country;

    @CsvBindByName(column = "cost")
    private int cost;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCountry() {
        return country;
    }

    public int getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String[] getDataToCsv(){
        // el string.valueOf me convierte el int a string
        return new String[]{ getName().trim(), getAddress().trim(), getCountry().trim(), String.valueOf(getCost()).trim()};
    }
    @Override
    public int compareTo(Persona o) {
        return this.name.compareTo(o.getName())*-1;
    }
}
