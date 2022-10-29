package ru.mirea.task13.Task2;

public class Person {
    private String firstName;
    private String lastName;
    private String fatherName;

    {
        firstName = lastName = fatherName = "undefined";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getLFF(){
        return lastName + " " + firstName + " " + fatherName;
    }
}
