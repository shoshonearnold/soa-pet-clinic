package com.shoshonearnold.soapetclinic.Model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;

@Entity
public class Person {
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
