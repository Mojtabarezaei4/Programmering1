package com.company;

public class Main {

    static double G = 9.82 ;

    public static void main(String[] args) {
	// write your code here

        System.out.println(fahrenheitToCelsius(50));
        System.out.println(kelvinToCelsius(500));
        System.out.println(fluidPressure(FluidTable.WATER, 10));
        System.out.println(fluidPressure(FluidTable.WATER, 10));
        System.out.println(kineticEnergy(5, 10));

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

    /**
     *
     * @param fluid - "fluid" är substanten som man vill räkna ut trycket i ett speciellt "deep".
     * @param deep - En variabel som är djupet.
     * @return - Den returnar mängden av trycket.
     */

    public static double fluidPressure(FluidTable fluid, double deep){

        double thePressure = 0;
        thePressure = fluid.density * G * deep;

        return thePressure;
    }


    /**
     *
     * @param deep - En variabel som säger hur djup i vattnet.
     * @return - Det resultatet av trycket i vattnet.
     */

    public static double pressureUnderWater(double deep){

        double d = 0.998;
        double density = d * 1E3;
        double thePressureUnderWater = 0;

        thePressureUnderWater = density * G * deep;

        return thePressureUnderWater;

    }


    /**
     *
     * @param mass - En variabel för massan hos ett föremål.
     * @param velocity - En variabel för hastighet hos föremålet
     * @return - den kinetiska energin.
     */
    public static double kineticEnergy(double mass, double velocity){

        double theKienticEnergy = 0;
        theKienticEnergy = (mass * Math.pow(velocity,2)) / 2;

        return theKienticEnergy;

    }

}