package com.calculator.exe;
import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter operation");
        char c = sc.next().charAt(0);

        System.out.println("Enter The First Number");
        int a = sc.nextInt();

        System.out.println("Enter The Second Number");
        int b = sc.nextInt();

        if(b == 0 && c == '/') { 
            System.out.println("Division By 0 Is Not Possible For A Java Program To Calculate");
        }
        else if(b == 0 && c == '%'){
            System.out.println("Division By 0 Is Not Possible For A Java Program To Calculate");
        }
        else {
            switch (c) {
                case '+':
                    int d= a+b;
                    System.out.println(d);
                    break;
                case '-':
                    int e= a-b;
                    System.out.println(e);
                    break;  
                case '*':
                    int f= a * b;
                    System.out.println(f); 
                    break;
                case '/':
                    int g= a / b;
                    System.out.println(g);
                    break;
                case '%':
                    int h = a % b;
                    System.out.println(h);
                    break;
                default:
                    System.out.println("Invalid Operator");
                    
            }
        }
        /*@author Rishav Digar
          Follow for more :-)                  
        */
       
        
    }
    }

