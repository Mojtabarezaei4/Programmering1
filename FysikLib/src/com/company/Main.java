package com.company;

public class Main {

    static double G = 6.674 * Math.pow(10, -11) ;
    static double g_swe = 9.82;
    static double R = 8.3145;
    static double p_0 = 1000;
    static double C = 2.99792458 * Math.pow(10,8);

    public static void main(String[] args) {
	// write your code here

        /**
         * Hur mycket väger 60 dm^3 järn?
         */
        System.out.println(volumeToMass(SolidTable.IRON, 60));
        /**
         * Hur långt hinner Tomas om han löper med medelhastigheten 2.7 m/s i 50 minuter?
         */
        System.out.println(svtDistance(2.7, 50));
        /**
         * Hur mycket energi krävs för att värma upp 4 liter vatten från rumstemperatur (22 grader) till kokpunkten?
         */
        System.out.println(heat(FluidTable.WATER, 4, 22));
        /**
         * Hur stort är det totala trycket 75 meter under havsytan?
         */
        System.out.println(pressureUnderWater(75));
        /**
         * Tomas som är 180cm lång kastar upp en boll med massan 250 gram i luften så den får starthastigheten 60 km/h. Hur högt kommer bollen?
         */
        System.out.println(velocityToHeight(16.7));
        /**
         * En bil med massan 735kg accelererar med konstant acceleration från 0-100 på 4.8 sekunder. Hur stor effekt har bilens motor uppnått?
         */
        System.out.println(power(work(force(735, g_swe), svtDistance(100/3.6, 4.8)),4.8 ));
        /**
         * En studsboll släpps från 12 meters höjd och varje gång den nuddar marken tappar den 1% av sin energi. Hur många gånger kommer bollen studsa i marken innan den inte studsar hörge än 0.5 meter?
         */
        System.out.println(touchCounting(0.5, 1, 12));
        /**
         * Man drar i en fjäder i 0,05 meter som har en fjäderkonstant 5. Vad är fjädernskraft?
         */
        System.out.println(hookeslag(5, 0.05));
        /**
         * Räkna ut rörelsemängden när en bil åker med 10 m/s och har en massa för 120Kg.
         */
        System.out.println(rorelsemangd(120, 10));
        /**
         * Räkna ut impulsen hos en kropp som har 50 konstant kraft som gör sig under 10s.
         */
        System.out.println(impulsKraft(50, 10));

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
     *
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

        double thePressure = FluidTable.WATER.density * g_swe * deep;

        return thePressure;

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

        double theMass = 0;
        theMass = solid.density * volume;

        return theMass;
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


    /**
     *
     * Den mtoden räknar fram hur högt kan ett föremål komma med en viss hastighet.
     * @param velocity - En variabel som står för hastighet hos det föremål.
     * @return - den returnar höjden.
     */
    public static double velocityToHeight(double velocity){

        double theHeight = 0;
        theHeight= Math.pow(velocity, 2) / (2 * g_swe);

        return theHeight;
    }


    /**
     *
     * En metod som räknar ut medel accelerationen.
     * @param deltaV - Förädringen i hastigheten.
     * @param time - förädringen i tiden.
     * @return Den returnar medelaccelerationen.
     */
    public static double medianAcceleration(double deltaV, double time) {


        double medianAcceleration = 0;
        medianAcceleration = deltaV / time;

        return medianAcceleration;

    }


    /**
     *
     * Metoden röknar ut hur mycket kraft har ett föremål.
     * @param mass - Massa  hos föremålet.
     * @param acceleration - Accelerationen hos föremålet.
     * @return Den returnar kraften.
     */
    public static double force(double mass, double acceleration){

        double theForce = 0;
        theForce = mass * acceleration;

        return theForce;
    }


    /**
     *
     * En metod som räknar ut sträckan utifrån accelaration och tid.
     * @param acceleration - En variabel som är föremålets accelaration.
     * @param time - En variabel säger under hur långt tid ett föremål flyttar på sig.
     * @return Sträckan.
     */
    public static double accelerationToDistance(double acceleration, double time){

        double distance = 0;
        distance = acceleration * Math.pow(time, 2) / 2;

        return distance;
    }


    /**
     *
     * MATEMATISK FORMEL!!!
     * En metod som räknar ut antal studs för en boll.
     * @param startHeight - en variabel för vilken höjd bollen har från början.
     * @param minHeight - minsta höjden som bollen ska nå.
     * @param lostEnergy - hur mycket energi tappar bollen vid varje studs i antal procentform.
     * @return antal studs.
     */
    public static int totalTouchdown(double startHeight, double minHeight, double lostEnergy){

        int totalTouches = 0;
        lostEnergy = (100 - lostEnergy) / 100;
        totalTouches = (int) (Math.log(minHeight/startHeight) / Math.log(lostEnergy));

        return totalTouches;
    }


    /**
     *
     * EN metod som räknar fram antal studsar på ett föremål när när man har massa och höjden.
     * @param minHeight - lägsta höjden som föremålet ska studsa.
     * @param mass - massan på föremålet.
     * @param height - höjden som föremålet har från början.
     * @return Det returnar antal studsar.
     */
    public static int touchCounting(double minHeight, double mass, double height) {

        double startEnergy = potentialEnergy(mass, height);
        double newHeight = height;
        int totalTouches = 0;

        while(newHeight > minHeight){
            startEnergy *= 0.99;
            newHeight = startEnergy / (mass * g_swe);

            totalTouches++;
        }

        return totalTouches;
    }


    /**
     *
     * En metod som räknar fram hur mycket energi samlas i en utdragen fjäder, hookeslag.
     * @param fjaderkonstanten - En konstand som beroende på fjädern.
     * @param deltaLangd - Skillnaden i längd.
     * @return Det returnar energin.
     */
    public static double hookeslag(double fjaderkonstanten, double deltaLangd){

        double theDistansForce = 0;
        theDistansForce = fjaderkonstanten * deltaLangd;

        return theDistansForce;
    }


    /**
     *
     * En metod för att räkna fram rörelsemängden hos ett föremål.
     * @param mass - Massan hos föremålet.
     * @param velocity - Hastigheten hos föremålet
     * @return Det returnar rörelsemängden.
     */
    public static double rorelsemangd(double mass, double velocity){

        double denRorelsemangden = 0;
        denRorelsemangden = mass * velocity;

        return denRorelsemangden;
    }


    /**
     *
     * En metod för att räkna fram impulsen.
     * @param kraft - En variabel som är kraft nu.
     * @param deltaTid - En variabel som är skillnaden i tid i detta fall.
     * @return Det returnar impulsen.
     */
    public static double impulsKraft(double kraft, double deltaTid){

        double impulsen = 0;
        impulsen = kraft * deltaTid;

        return impulsen;
    }


    /**
     *
     * En metod för att omvandla kilometer per timmar till meter per sekund.
     * @param velocity - Hastigheten i kilometer per timmar.
     * @return Det returnar hastigheten meter per sekund.
     */
    public static double kmToMs(double velocity){
        double velocityToMs = 0;
        velocityToMs = velocity / 3.6;

        return velocityToMs;

    }


    /**
     *
     * En metod för att omvandla kilogram till gram.
     * @param mass - Massan i kilogram.
     * @return Det returnar massan i gram.
     */
    public static double kgToGram(double mass){

        double massToGram = 0;
        massToGram = mass * 1000;

        return massToGram;
    }


    /**
     *
     * En metod för att omvandla ton till kilogram.
     * @param mass - Massan i ton.
     * @return Det returnar massan i kilogram.
     */
    public static double tonToKg(double mass){

        double massToKilogram = 0;
        massToKilogram = mass * 1000;

        return massToKilogram;
    }


    /**
     *
     * En metod för att omvandla kilogram till ton.
     * @param mass - Massa i kilogram.
     * @return Det returnar massan i ton.
     */
    public static double kgToTon(double mass){

        double massToTon = 0;
        massToTon = mass / 1000;

        return massToTon;
    }


    /**
     *
     * En metod för att omvandla gram till kilogram.
     * @param mass - Massan i gram.
     * @return Det returnar massan i kilogram.
     */
    public static double gramToKg(double mass){

        double massToKilogram = 0;
        massToKilogram = mass / 1000;

        return massToKilogram;
    }

}