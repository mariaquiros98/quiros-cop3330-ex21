/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 Maria Quiros
 */

/*Declaring package*/
package org.example;

/*Importing scanner class*/
import java.util.Scanner;

/*Specifying class*/
public class App {
    public static void main(String[] args) {

        /*Creating a scanner object*/
        Scanner scan = new Scanner(System.in);

        /*Initializing variables*/
        int number;
        String month = null;

        /*Prompting for number of the month*/
        System.out.println("Please enter the number of the month: ");
        number = scan.nextInt();

        /*Creating a switch statement with a case for each month of the year*/
        switch (number) {
            case 1: month = "January";
                break;
            case 2: month = "February";
                break;
            case 3: month = "March";
                break;
            case 4: month = "April";
                break;
            case 5: month = "May";
                break;
            case 6: month = "June";
                break;
            case 7: month = "July";
                break;
            case 8: month = "August";
                break;
            case 9: month = "September";
                break;
            case 10: month = "October";
                break;
            case 11: month = "November";
                break;
            case 12: month = "December";
                break;
        }

        /*Displaying the name of the month*/
        System.out.println("The name of the month is " + month + ".");
    }
}

