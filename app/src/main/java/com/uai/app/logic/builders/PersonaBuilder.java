package com.uai.app.logic.builders;

import com.uai.app.dominio.Persona;

public class PersonaBuilder {

    private String name;
    private String address;
    private String country;
    private int cost;

    public PersonaBuilder() {
    }

    public PersonaBuilder witName(String name) {
        this.name = name;
        return this;
    }
    public PersonaBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public PersonaBuilder withCountry(String country) {
        this.country = country;
        return this;
    }

    public PersonaBuilder withCost(int cost) {
        this.cost = cost;
        return this;
    }
    //Return the finally consrcuted User object
    public Persona build() {
        Persona user =  new Persona();
        user.setAddress(this.address);
        user.setCost(this.cost);
        user.setCountry(this.country);
        user.setName(this.name);
        validateUserObject(user);
        return user;
    }

    private void validateUserObject(Persona user) {
        //Do some basic validations to check
        //if user object does not break any assumption of system
    }
}
