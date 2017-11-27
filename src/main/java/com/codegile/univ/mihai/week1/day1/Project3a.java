package com.codegile.univ.mihai.week1.day1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Project3a {
    public static void main(String args[]){
        FileInputStream fis;
        InputStreamReader isr;
        BufferedReader br;

        try{
            fis = new FileInputStream("src/com/company/word.txt");
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            ArrayList<String> obj = new ArrayList<String>();

            String dataline = br.readLine();
            while(dataline != null){

                obj.add(dataline);

                dataline = br.readLine();
            }

            System.out.println("String: " + obj);
            br.close();
            Collections.sort(obj);
            System.out.println("Sorted array list: " + obj);


            for(String word: obj){
                //System.out.println(word);
                if(     (word.charAt(0) == 'a') ||
                        (word.charAt(0) == 'e') ||
                        (word.charAt(0) == 'i') ||
                        (word.charAt(0) == 'o') ||
                        (word.charAt(0) == 'u') )
                {
                    // System.out.println(obj.indexOf(word));
                    String   nword = "" + word.length();
                    obj.set(obj.indexOf(word),nword);
                    //System.out.println("test: " + obj);
                }
            }

            System.out.println("Finally: " + obj);

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException f){
            System.out.println(f.getMessage());
        }
    }
}
