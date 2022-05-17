package com.uai.app.dominio.enums;

public enum Tittles {

    NAME("name"),ADDRESS("address"),COUNTRY("country"),COST("cost");

    private String val;

    public String getVal() {
        return val;
    }

    Tittles(String val) {
        this.val = val;
    }

}
