package com.sparta.lm;

import java.util.Objects;

public class Spartan {
    private String firstName;
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

    public Spartan(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Spartan spartan = (Spartan) o;
//        return Objects.equals(firstName, spartan.firstName) && Objects.equals(lastName, spartan.lastName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, lastName);
//    }
    // This is the generated version

    @Override
    public boolean equals(Object object) { //this.equals(otherSpartan)
        if (this == object) {
            return true;
        }

        return (object instanceof Spartan otherSpartan) // Are these both Spartan Objects?
                && getFirstName().equals(otherSpartan.getFirstName()) // Do they have the same first name?
                && getLastName().equals((otherSpartan.getLastName())); // Last names the same?
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }


}
