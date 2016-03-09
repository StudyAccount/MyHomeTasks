package com.goit.gojavaonline;

import java.util.Scanner;

/**
 * Created by User on 09.03.2016.
 */
public class TemperatureCalculation {

    public static void main(String[] args) {

        System.out.println("Choose what do you want to convert:\nCelsius press 1;\nFahrenheit press 2.");
        Scanner scanner = new Scanner(System.in);
        String selection = scanner.nextLine();

        if (selection.equals("1")){
            System.out.println("Enter the temperature in Celsius");
            float temperature = scanner.nextFloat();
            temperature = ((temperature - 32)*5)/9;
            System.out.println("Current temperature in Fahrenheit is "+ temperature);
        }else
            if(selection.equals("2")){
                System.out.println("Enter the temperature in Fahrenheit");
                float temperature = scanner.nextFloat();
                temperature = 9*temperature/5+32;
                System.out.println("Current temperature in Celsius is "+ temperature);
            } else {
                System.out.println("Entered incorrect value");
            }

    }
}
