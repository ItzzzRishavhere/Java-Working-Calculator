package com.calculator.exe;
import java.util.*; //importing java.util.* for using scanner in order to accept input from user
public class calculator {
    public static void main(String[] args) {
        //input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();                            //accepting the first integer
        System.out.println("Enter the second Number");
        int b = sc.nextInt();                            //accepting the second integer
        if(a==0 && b == 0){
            System.out.println("Both zeroes causes Exceptions to occur so \nProgram         Closing             Shortly\n");
        }
        else{
            System.out.println("Enter the operation \nIf you need to :\nADD = 1\nSubtract = 2\nDivide = 3\nMultiply = 4\nFind the remainder = 5"); //giving the user a list of operations in form of numbers
            int c = sc.nextInt();                         //accepting the operation ,here integer


            if (c == 1) {
                int d = a + b;            //addition
                System.out.println("You wanna add right !! Here is the answer : " + d + "\nProgram         Closing             Shortly\n ");      //passes if for addition
            } else if (c == 2) {
                int e = a - b;            //subtraction
                System.out.println("You wanna subtract right !! Here is the answer : " + e + "\nProgram         Closing             Shortly\n ");     //passes for subtraction
            } else if (c == 3) {
                int f = a / b;            //division
                System.out.println("You wanna divide right !! Here is the answer : " + f + "\nProgram         Closing             Shortly\n ");       //passes for division
            } else if (c == 4) {
                int g = a * b;            //multiplication
                System.out.println("You wanna multiply right !! Here is the answer : " + g + "\nProgram         Closing             Shortly\n ");     //passes for multiplication
            } else if (c == 5) {
                int h = a % b;            //finding the remainder (modulus)
                System.out.println("You wanna find the remainder right !! Here is the answer : " + h + "\nProgram         Closing             Shortly\n ");   //passes for finding remainder
            }

        }

        System.out.println("Made By Rishav Digar\nGitHub - ItzzzRishavhere");


    }
}
