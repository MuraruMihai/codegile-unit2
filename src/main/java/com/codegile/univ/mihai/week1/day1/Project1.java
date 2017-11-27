package com.codegile.univ.mihai.week1.day1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Project1 {

    /*public void ReadFile(String txt){
        InputStream inputStream = this.getClass().getResourceAsStream("text.txt");
        new Scanner(inputStream);
        System.out.println(inputStream);
    }*/

    public static void main(String args[]) throws IOException {
        int nrReale = 0;
        int nrIntregi = 0;

        File file = new File("resources/day1/text.txt");
        Scanner scanner = new Scanner(file);
        String lineSeparator = System.getProperty("line.separator");



        try {
            while(scanner.hasNextLine()) {
                    if(scanner.hasNextInt()){
                        nrIntregi++;
                        System.out.println(scanner.nextInt());
                    }
                    else if(scanner.hasNextFloat()){
                        nrReale++;
                        System.out.println(scanner.nextFloat());
                    }
                    else if(scanner.nextLine() == null){
                        System.out.println("Linie Goala");
                    }
            }
        }catch (RuntimeException e){
            System.out.println(e);
        }finally {
            scanner.close();
        }
        System.out.println("Numere intregi: " + nrIntregi);
        System.out.println("Numere reale: " + nrReale);

    }



}

