package com.codegile.univ.mihai.week1.day1;

import java.io.*;

public class Project4 {
    public static void main(String args[]){
        FileInputStream fis;
        InputStreamReader isr;
        BufferedReader br;


        try{
            fis = new FileInputStream("src/com/company/tricouri.txt");
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);

            String dataline = br.readLine();
            while(dataline != null){

                String[] word = dataline.split(",");

                for(int i = 0;i<word.length;i=i+4){
                        System.out.println("ID: " + word[i]);
                        System.out.println("Descriere: " + word[i + 1]);
                        System.out.println("Culoare: " + word[i + 2]);
                        System.out.println("Marime: " + word[i + 3]);
                }


                dataline = br.readLine();
            }
            br.close();

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException f){
            System.out.println(f.getMessage());
        }
    }
}
