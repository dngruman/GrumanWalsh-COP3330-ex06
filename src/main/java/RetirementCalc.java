/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Deirdre Gruman-Walsh
 */
import java.util.Calendar;
import java.util.Scanner;

public class RetirementCalc {
    public static void main(String[] args) {
        int currentAge;                                              //store user current age
        int retireAge;                                              //store user retirement age
        Scanner user_input = new Scanner(System.in);

        System.out.print("What is your current age? ");
        currentAge = user_input.nextInt();                                       //taking user input
        System.out.print("At what age would you like to retire? ");
        retireAge = user_input.nextInt();                                   //taking user input

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);         // store the current year
        int yearsLeftToRetirement = retireAge - currentAge;               // store the value of total years left to retirement
        int retireYear = currentYear + yearsLeftToRetirement;
        System.out.println("You have "+yearsLeftToRetirement +" years left until you can retire.");
        System.out.println("It's "+currentYear+", so you can retire in "+retireYear+".");
        }
    }


