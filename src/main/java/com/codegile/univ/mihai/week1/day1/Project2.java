package com.codegile.univ.mihai.week1.day1;
import java.io.*;


public class Project2 {

    public static void main(String args[]){
        FileInputStream fis;
        InputStreamReader isr;
        BufferedReader br;
        int count = 0;
        int c = 0;
        try{
            fis = new FileInputStream("java/com/codegile/univ/mihai/week1/day1/name.txt");
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);

            String dataline = br.readLine();
            while(dataline != null){
                System.out.println(dataline);
                if((int)dataline.charAt(0) < 91 && (int)dataline.charAt(0) > 64){
                    for(int i= 1; i<dataline.length();i++){
                        if((int)dataline.charAt(i) > 96 && (int)dataline.charAt(i) < 123){
                            c++;
                        }
                    }
                    if(dataline.length() == c+1){
                        System.out.println("Nume ideal: " + dataline);
                        count++;
                    }
                    c = 0;
                }

                dataline = br.readLine();
            }
            System.out.println("Nr de nume ideale: " + count);

            br.close();

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException f){
            System.out.println(f.getMessage());
        }
    }
}
