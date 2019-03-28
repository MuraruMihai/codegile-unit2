package com.codegile.univ.mihai.week1.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Project3b {
    public static void main(String args[]) throws IOException {
        FileReader file = new FileReader("src/com/company/index.html");
        BufferedReader buff = new BufferedReader(file);
        int nrCuvinte = 0;

        boolean eof = false;
        while(!eof){
            String s = buff.readLine();
            String x = "";
            if(s == null){
                eof = true;
            }
            else{
                if(s.contains("<p>")) {
                    x = s.replace("<p>", "<span>");
                    x = x.replace("</p>", "</span>");
                    x = x.replaceAll("\\s+"," ");
                }
                System.out.println(x);
                String[] split = x.split(" " );

                for(String q : split){
                    if(q.contains("a")){
                        int count =0;
                        for(int i=0; i<q.length(); i++){
                            if(q.charAt(i) == 'b'){
                                count ++;
                            }

                        }

                        if(count != 0 && count % 2 == 0){
                            nrCuvinte ++;
                            System.out.println("Cuvant: "+ q);
                            count = 0;
                        }
                    }
                }
            }
        }
        System.out.println("Nr cuvinte formate din oricate a si nr par de b: " + nrCuvinte);
    }
}
