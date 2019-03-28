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



    public void replaceWith(Employee e){
        this.id = e.id;
        this.firstName = e.firstName;
        this.lastName = e.lastName;
        this.cnp = e.cnp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (firstName != null ? !firstName.equals(employee.firstName) : employee.firstName != null) return false;
        if (lastName != null ? !lastName.equals(employee.lastName) : employee.lastName != null) return false;
        return cnp != null ? cnp.equals(employee.cnp) : employee.cnp == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (cnp != null ? cnp.hashCode() : 0);
        return result;
    }
}
