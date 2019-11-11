package com.company;

public class Main {

    static double G = 6.674 * Math.pow(10, -11) ;
    static double g_swe = 9.82;
    static double R = 8.3145;
    static double p_0 = 1000;
    static double C = 2.99792458 * Math.pow(10,8);

    public static void main(String[] args) {
	// write your code here

        System.out.println(fahrenheitToCelsius(50));
        System.out.println(kelvinToCelsius(0));
        System.out.println(fluidPressure(FluidTable.WATER, 10));
        System.out.println(fluidPressure(FluidTable.WATER, 10));
        System.out.println(kineticEnergy(2, 2));
        System.out.println(potentialEnergy(2,5));
        System.out.println(fallSpeed(2.5));
        System.out.println(delta(5, 1));

    }


    /**
     *
     * Den omvandlar fahrenheit till cilsius grader.
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
     * Den omvandlar Kelvin till Cilsius grader.
     * @param kelvin - The temperature at Kelvin
     * @return It returns the temperature at Celsius
     */
    public static double kelvinToCelsius(double kelvin){

        double celsius = 0;
        celsius = kelvin - 273.15;

        return celsius;

    }


    /**
     * Den räknar ut trycket i en vätska.
     * @param fluid - "fluid" är substanten som man vill räkna ut trycket i ett speciellt "deep".
     * @param deep - En variabel som är djupet.
     * @return - Den returnar mängden av trycket.
     */
    public static double fluidPressure(FluidTable fluid, double deep){

        double thePressure = 0;
        thePressure = fluid.density * g_swe * deep;

        return thePressure;
    }


    /**
     *
     * Den räknar ut hur mycket är trycket i vattne vid ett visst djupt.
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
     * Den räknar ut kinestiska energin
     * @param mass - En variabel för massan hos ett föremål.
     * @param velocity - En variabel för hastighet hos föremålet
     * @return - den kinetiska energin.
     */
    public static double kineticEnergy(double mass, double velocity){

        double theKienticEnergy = 0;
        theKienticEnergy = (mass * Math.pow(velocity,2)) / 2;

        return theKienticEnergy;

    }


    /**
     *
     * En metod som räknar ut lägesenergi när den får in masssan och höjden.
     * @param mass - En variabel av massan hos ett föremål.
     * @param height - En variabel av höjden hos föremålet.
     * @return - returnar lägesenergiet.
     */
    public static double potentialEnergy(double mass, double height){

        double thePotentialEnergy = 0;
        thePotentialEnergy = mass * g_swe * height;

        return thePotentialEnergy;
    }


    /**
     *
     * En metod som räknar ut den högsta hastigheten från ett visst höjd i fritt fall.
     * @param height - En variabel som står för höjden/sträckan.
     * @return - Det högsta hastigheten.
     */
    public static double fallSpeed(double height){

        double theHighestSpeed = 0;
        theHighestSpeed =  Math.sqrt ((2*height) / g_swe) * g_swe ;

        return theHighestSpeed;
    }


    /**
     *
     * Den räknar ut skillnaden mellan två tal.
     * @param first - En variabel som är första talet.
     * @param last - Andra variabel som är andra talet.
     * @return - Den returnar det talet som är skillnaden mellan variablerna "first och last".
     */
    public static double delta(double first, double last){


        double theDiffrence = 0;
        theDiffrence = last - first;

        return theDiffrence;

    }
}