package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(fahrenheitToCelsius(50));
        System.out.println(kelvinToCelsius(500));

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

    /**
     *
     * @param kelvin - The temperature at Kelvin
     * @return It returns the temperature at Celsius
     */
    public static double kelvinToCelsius(double kelvin){

        double celsius = 0;
        celsius = kelvin - 273.15;

        return celsius;

    }


}