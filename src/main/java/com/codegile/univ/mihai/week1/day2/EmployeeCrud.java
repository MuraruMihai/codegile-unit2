package com.codegile.univ.mihai.week1.day2;

import java.util.ArrayList;

public class EmployeeCrud {
    public static ArrayList<Employee> data = null;

    public EmployeeCrud(){
        data = new ArrayList<Employee>();
    }

    public boolean CreateEmployee(Employee e){
        for(int i = 0; i < data.size();i++){
            System.out.println("next data size: " + data.size());
            System.out.println(data.get(i));
            if(data.get(i).equals(e)){
                return false;
            }
        }
        data.add(e);
        return true;
    }

    public ArrayList<Employee> ReadEmployee(String firstName, String lastName){
        ArrayList<Employee> tmp = new ArrayList<>();
        for(int i = 0; i< data.size(); i++){
            if(data.get(i).getFirstName() == firstName && data.get(i).getLastName() == lastName){
                tmp.add(data.get(i));
            }
        }
        return tmp;
    }

    public void UpdateEmployee(Employee e){
        for(int i = 0; i < data.size();i++){
            if(data.get(i).getId() == e.getId()){
                data.get(i).replaceWith(e);
                break;
            }
        }
    }

    public boolean DeleteEmployee(Employee e){
        for(int i = 0; i < data.size();i++){
            if(data.get(i).equals(e)){
                data.remove(i);
                return true;
            }
        }
        return false;
    }


}
