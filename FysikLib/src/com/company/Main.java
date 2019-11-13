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
        System.out.println(volumeToMass(FluidTable.WATER, 1));
        System.out.println(volumeToMass(GasTable.AIR, 1));
        System.out.println(volumeToMass(SolidTable.IRON, 1));
        System.out.println(svtVelocity(10, 5));
        System.out.println(svtDistance(10, 5));
        System.out.println(svtTime(10, 2));
        System.out.println(work(50, 10));
        System.out.println(power(1000, 2));
        System.out.println(heat(SolidTable.IRON, 1, 2));
        System.out.println(heat(FluidTable.WATER, 1, 10));
        System.out.println(heat(GasTable.AIR, 1, 1));

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


    /**
     *
     * Räknar ut massan på en vätska från dens volym.
     * @param fluid - En variabel som en vätska i detta fallet.
     * @param volume - En variabel som står fär volymen.
     * @return - Den returnar tillbaka massan på vötskan.
     */
    public static double volumeToMass(FluidTable fluid, double volume){

        double theMass = 0;
        theMass = fluid.density * volume;

        return theMass;

    }


    /**
     *
     * Räknar ut massan på en gas utifrån dens volym.
     * @param gas - En variabel som är en gas i datta fallet.
     * @param volume - En variabel som står för volymen.
     * @return - returnar massan hos gasen.
     */
    public static double volumeToMass(GasTable gas, double volume){

        double theMass = 0;
        theMass = gas.density * volume;

        return theMass;
    }


    /**
     *
     * Den räknar massan hos ett material utifrån dens densitet och volym.
     * @param solid - En variabel som är ett material i detta fallet.
     * @param volume - En variabel som är volym i detta fallet.
     * @return - Den returnar tillbaka massan.
     */
    public static double volumeToMass(SolidTable solid, double volume){

        double themass = 0;
        themass = solid.density * volume;

        return themass;
    }


    /**
     *
     * En metod för att räkna ut medelhastigheten med hjälp av sträcka och tid.
     * @param distance - en variabel för sträcka.
     * @param time - en variabel för tid.
     * @return - returnar medelhastigheten.
     */
    public static double svtVelocity(double distance, double time){

        double averageSpeed = 0;
        averageSpeed = distance / time;

        return averageSpeed;
    }


    /**
     *
     * En metod för att räkna ut sträckan med hjälp av hastighet och tid.
     * @param velocity - en variabel som är för hastighet.
     * @param time - en variabel som är för tid.
     * @return - Den returnar sträckan.
     */
    public static double svtDistance(double velocity, double time){

        double theDistance = 0;
        theDistance = velocity * time;

        return theDistance;
    }


    /**
     *
     * En metod för att räkna ut tiden med hjälp av sträcka och hastighet.
     * @param distance - en variabel för sträckan.
     * @param velocity - en variabel för hastigheten.
     * @return - Den returnar tiden.
     */
    public static double svtTime(double distance, double velocity){

        double theTime = 0;
        theTime = distance / velocity;

        return theTime;
    }


    /**
     *
     * En metod för att räkna arbetet med hjälp av kraft och strckan.
     * @param force - en variabel för kraft.
     * @param distance - en variabel för sträckan.
     * @return - Den returnar arbetet.
     */
    public static double work(double force, double distance){

        double theWork = 0;
        theWork = force * distance;

        return theWork;
    }


    /**
     *
     * En metod för att räkna ut effektet med hjälp av arbete och tid.
     * @param work - en variabel för arbetet.
     * @param time - en variabel för tiden.
     * @return - Den returnar effektet.
     */
    public static double power(double work, double time){

        double thePower = 0;
        thePower = work / time;

        return thePower;
    }


    /**
     *
     * En metod för att räkna fram hur mycket energi behövs för att värma ett visst material till angivet antal grader.
     * @param solid- en variabel i detta fallet ett visst material.
     * @param mass - massan hos materialet.
     * @param deltaT - skillnaden mella start- och slut-temperaturen.
     * @return - Den returnar den mängden av energin som behövs.
     */
    public static double heat(SolidTable solid, double mass, double deltaT){

        double theEnergi = 0;
        theEnergi = solid.heatCapacity * mass * deltaT;

        return theEnergi;
    }

    /**
     *
     * Den metoden räknar fram hur mycket energi behövs för att värma en viss vätska till angivet antal grader.
     * @param fluid - en variabel i detta fallet en viss vätska.
     * @param mass - en variabel i detta fallet massan hos vätskan.
     * @param deltaT - skillnaden mellan start- och slut-temperaturen.
     * @return - Den returnar den mängden av energin som behövs.
     */
    public static double heat(FluidTable fluid, double mass, double deltaT){

        double theEnergi = 0;
        theEnergi = fluid.heatCapacity * mass * deltaT;

        return theEnergi;
    }


    /**
     *
     * Den metoden räknar fram hur mycket energi behövs för att värma en viss gas till angivet antal grader.
     * @param gas - en variabel i detta fallet en viss gas.
     * @param mass - en variabel i detta fallet massan hos gasen.
     * @param deltaT - skillnaden mellan start- och slut-temperaturen.
     * @return - Den returnar den mängden av energin som behövs.
     */
    public static double heat(GasTable gas, double mass, double deltaT){

        double theEnergi = 0;
        theEnergi = gas.heatCapacity * mass * deltaT;

        return theEnergi;
    }
}