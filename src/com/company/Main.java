package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Boolean ask = true;
        Scanner sc = new Scanner(System.in);

        //while(ask){


        System.out.println("Input First Number:");
        String firstNumber = sc.nextLine();

        System.out.println("Input one of the following valid operators: +, -, *, / :");
        String operator = sc.nextLine();

        System.out.println("Input Second Number:");
        String secondNumber = sc.nextLine();

        int intFirst = Integer.parseInt(firstNumber);
        int intSecond = Integer.parseInt(secondNumber);
        int intResult = 0;
        //Double allows for decimal
        //Double intFirst = Double.parseDouble (firstNumber);
        //Double intSecond = Double.parseDouble (secondNumber);
        //Double intResult = 0.0

        if (operator.equals("+") || operator.equals("add")) {
            intResult = intFirst + intSecond;
        } else if (operator.equals("-") || operator.equals("subtract")) {
            intResult = intFirst - intSecond;
        } else if (operator.equals("*") || operator.equals("multiply")) {
            intResult = Multiplying(intFirst, intSecond);
        } else if (operator.equals("/") || operator.equals("divide")) {
            intResult = intFirst / intSecond;


        }

        System.out.println("Your number is: " + intResult);
        System.out.println("Would you like to try again?");
        //String userResponse = sc.nextLine();

//            if(userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("y")){
//                ask = true;
//
//            } else {
//                ask = false;
//            }
        //}System.out.println("Have a nice day!");

    }
    public static int Multiplying(int intFirst, int intSecond){
        int intResult = intFirst * intSecond;
        return intResult;

    }

}


