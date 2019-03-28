package com.codegile.univ.mihai.week1.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MyDeque {

    public static void main(String args[]) throws FileNotFoundException {

        File file = new File("src\\main\\resources\\day3\\test.txt");
        Scanner scanner = new Scanner(file);

        try {
            while(scanner.hasNextLine()) {
                //System.out.println(scanner.nextLine());
                Deque<Character> myDeque = new ArrayDeque<>();
                String s = scanner.nextLine();
                boolean error = false;
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)=='('){
                        myDeque.push(s.charAt(i));
                    }
                    if(s.charAt(i) == ')'){
                        try {
                            myDeque.pop();
                        }catch (NoSuchElementException e){
                            error = true;
                            break;
                        }
                    }
                }
                if(myDeque.isEmpty() && error==false){
                    System.out.println(s + " - is O.K.");
                }
                else{
                    System.out.println(s + " - is not ok");
                }
            }

        }catch (Exception e){
            System.out.println(e);
        }finally {
            scanner.close();
        }

    }
}
