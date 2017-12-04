package com.codegile.univ.mihai.week1.day2;

import java.util.ArrayList;
import java.util.Set;

public class EmployeeMain {
    public static void main(String args[]){

        EmployeeCrud bd = new EmployeeCrud();

        Employee empl = new Employee(1,"Ion","Mihai","19231111111111");
        Employee empl2 = new Employee(2,"Ion2","Mihai2","192311111112111");
        Employee empl3 = new Employee(3,"Ion3","Mihai3","19231111131111");

        Employee test = new Employee();
        test.setId(5);
        test.setFirstName("qwe");
        test.setLastName("asd");
        test.setCnp("1234567891012");

        bd.createEmployee(empl);
        bd.createEmployee(empl2);
        bd.createEmployee(empl3);
        bd.createEmployee(test);
        bd.readEmployee(5);

        bd.deleteEmployee(5);
        bd.readEmployee(5);


    }
}
