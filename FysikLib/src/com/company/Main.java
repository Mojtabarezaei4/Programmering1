package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(fahrenheitToCelsius(50));


    }

    /**
     *
     * @param fahrenheit - The temperature at Fahrenheit
     * @return It returns the temperature at Celsius
     */

    public static double fahrenheitToCelsius(double fahrenheit){

        double celsius = 0;
        celsius = ((fahrenheit-32)*5)/9;

        return celsius;

    }



}