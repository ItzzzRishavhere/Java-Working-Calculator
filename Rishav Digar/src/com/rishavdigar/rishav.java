package com.rishavdigar;

import java.sql.SQLOutput;
import java.util.*;

public class rishav {
    public static void main(String[] args) {

        //input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second Number");
        int b = sc.nextInt();
        System.out.println("Enter the operation \nIf you need to :\nADD = 1\nSubtract = 2\nDivide = 3\nMultiply = 4\nFind the remainder = 5");
        int c = sc.nextInt();
        int d = a+b;
        int e = a-b;
        int f = a/b;
        int g = a*b;
        int h = a%b;

        if(a == 0 && b ==0){
            System.out.println("Kya gunda banega re tu??");
        }
        else if(c == 1){
            System.out.println("You wanna add right !! Here is the answer : "+d);
        }
        else if(c == 2){
            System.out.println("You wanna subtract right !! Here is the answer : "+e);
        }
        else if(c == 3){
            System.out.println("You wanna divide right !! Here is the answer : "+f);
        }
        else if(c == 4){
            System.out.println("You wanna multiply right !! Here is the answer : "+g);
        }
        else if(c == 5){
            System.out.println("You wanna find the remainder right !! Here is the answer : "+h);
        }



    }
}
