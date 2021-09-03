/*
 *  UCF COP3330 Fall 2021 Assignment1 Solution for Pb5
 *  Copyright 2021: Praween Pongpat
 */

import java.util.Scanner;

public class Solution05 {
    /*
        print (prompt user) "What is the first number?"
            'number1String' = read string from user
        print (prompt user) "What is the second number?"
            'number2String' = read string from user
        convert string into int
            'integer1' = convert string 'number1' into int
            'integer2' = convert string 'number2' into int
        process data
            'add' = integer1 + integer2
            'sub' = integer1 - integer2
            'mult' = integer1 * integer2
            'div' = integer1 / integer2
        print (output) in the format "'integer1' + 'integer2' = 'add'" for all processed data
     */

    public static void main(String[] args) {        //beginning of main method
        Scanner input = new Scanner(System.in);             //allocate input from Scanner class

        System.out.print("What is the first number? ");     //prompt user for first number
        String number1String = input.nextLine();            //read string from user

        System.out.print("What is the second number? ");    //prompt user for second number
        String number2String = input.nextLine();            //read string from user

        int integer1 = Integer.parseInt(number1String);     //convert number1String into int data type
        int integer2 = Integer.parseInt(number2String);     //convert number2String into int data type

        int add = integer1 + integer2;                      //compute addition
        int sub = integer1 - integer2;                      //compute subtraction
        int mult = integer1 * integer2;                     //compute multiplication
        int div = integer1 / integer2;                      //compute integer division

        System.out.println(integer1 + " + " + integer2 + " = " + add + "\n" +
                           integer1 + " - " + integer2 + " = " + sub + "\n" +
                           integer1 + " * " + integer2 + " = " + mult + "\n" +
                           integer1 + " / " + integer2 + " = " + div);       //output the result

    }                                               //end of main method
}
