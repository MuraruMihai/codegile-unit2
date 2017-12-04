package com.codegile.univ.mihai.week1.day2;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String cnp;


    public String getCnp() {
        return cnp;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Employee(int id, String firstName, String lastName, String cnp){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cnp = cnp;
    }
    public Employee(){}


    public boolean equals(Employee e){
        if(e.id == this.id && e.firstName == this.firstName && e.lastName == this.lastName && e.cnp == this.cnp){
            return true;
        }
        return false;
    }

    public void replaceWith(Employee e){
        this.id = e.id;
        this.firstName = e.firstName;
        this.lastName = e.lastName;
        this.cnp = e.cnp;
    }
}
