package com.company.DataDomain;

import java.util.List;
import java.util.logging.ConsoleHandler;

public class Person {
    private String name;
    private List<Clothes> clothes;
    private PersonType personType;
    private String stayNear;

    public Person(String name, PersonType personType) {
        this.name = name;
        this.personType = personType;
    }
    public void stayNear(Object object) {
        this.stayNear = object.getClass().getName();
        System.out.println("Standing by " + this.stayNear);
    }

    public String pushIt(Object it) {
        String itName = it.getClass().getName();
        System.out.println("Pushed " + itName);

        return itName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Clothes> getClothes() {
        return clothes;
    }

    public void setClothes(List<Clothes> clothes) {
        this.clothes = clothes;
    }

    public String getName() { return name; }

    public PersonType getPersonType() {
        return personType;
    }

    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }

    public String getStayNear() {
        return stayNear;
    }
}
