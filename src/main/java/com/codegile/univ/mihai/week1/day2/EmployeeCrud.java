package com.codegile.univ.mihai.week1.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeCrud {
    public static Set<Employee> data = null; //use set

    public EmployeeCrud() {
        data = new HashSet<>();
    }

    public boolean createEmployee(Employee e) {

        data.add(e);
        System.out.println("Employee with name: " + "'" + e.getFirstName()+ "'" + " was created");
        return true;
    }

    public Employee readEmployee(int id) {
        for (Employee e : data) {
            if(id == e.getId())
                System.out.println(e.getId()+ " " + e.getFirstName() + " " + e.getLastName() + " " + e.getCnp());
                return e;
        }
        return null;
    }

    public void updateEmployee(Employee empl) {

        for (Employee e: data) {
            if(empl.getId() == e.getId()){
                e.replaceWith(empl);
            }
        }
    }

    public boolean deleteEmployee(int id) {
        Employee deleted = null;
        for (Employee e: data) {
            if(id == e.getId()){
                deleted = e;
                System.out.println("Employee deleted: " + e.getFirstName());
                break;
            }
        }
        if(deleted != null){
            data.remove(deleted);
            return true;
        }
        return false;
    }


}
