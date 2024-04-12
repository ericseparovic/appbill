package org.ericseparovic.appbill.model;

public class Client {
    private String name;
    private String rut;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setRut(String rut){
        this.rut = rut;
    }

    public String getRut(){
        return rut;
    }
}
