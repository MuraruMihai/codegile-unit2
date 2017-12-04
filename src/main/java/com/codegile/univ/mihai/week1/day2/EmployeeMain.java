package com.codegile.univ.mihai.week1.day2;

import java.util.ArrayList;

public class EmployeeMain {
    public static void main(String args[]){

        EmployeeCrud bd = new EmployeeCrud();

        Employee empl = new Employee(1,"Ion","Mihai","19231111111111");
        Employee empl2 = new Employee(1,"Ion2","Mihai2","192311111112111");
        Employee empl3 = new Employee(1,"Ion3","Mihai3","19231111131111");

        Employee test = new Employee();
        test.setId(5);
        test.setFirstName("qwe");
        test.setLastName("asd");
        test.setCnp("1234567891012");



        bd.CreateEmployee(test);
        ArrayList<Employee> cacamaca =  bd.ReadEmployee("qwe","asd");
        for (Employee e: cacamaca
             ) {
            System.out.println(e.getFirstName());
             }


    }
}
