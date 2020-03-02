public class LabbTwo {

    public static void main(String[] args) {
    }

    /**
     *
     * The method campers two numbers.
     *
     * @param firstNumber - a variable for the first number.
     * @param secondNumber - a variable for the second number.
     * @return returning the biggest number.
     */
    public static int numberComparetor(int firstNumber, int secondNumber) {
            int result = 0;

            if (firstNumber < secondNumber) {

                result = secondNumber;
                System.out.println(result);

            }

            else {
                result = firstNumber;
                System.out.println(result);
            }

            return result;
        }


    /**
     *
     * A method which can be used for when you looking for a special number.
     *
     * @param theListOfTheNumber - the list of the all numbers.
     * @param theWantedNumber - the special number that you are looking for.
     * @return
     */
    public static boolean numberChecker(int[] theListOfTheNumber, int theWantedNumber) {
            for (int i = 0; i < theListOfTheNumber.length; i++) {

                if(theListOfTheNumber[i] == theWantedNumber) {
                    return false;
                }
            }

            return true;
        }


    /**
     *
     * A method which reversing a text.
     *
     * @param theText - the text that is going to be reversed.
     * @return returning the reversed text.
     */
    public static String stringRevers(String theText) {

            String result = "";

            for (int i = theText.length() -1; i >= 0; i--) {
                result += theText.charAt(i);
            }

            return result;
        }


    /**
     *
     * A method which is subtracting the given minutes of the given hour and minutes.
     *
     * @param hours - the given hours.
     * @param minutes - the given minutes.
     * @param removedMinutes - the given minutes which is going to be subtracted of the given time.
     */
    public static void minuteSubtractor(int hours, int minutes, int removedMinutes) {
            minutes -= removedMinutes;

            if(minutes < 0) {
                hours--;
                minutes += 60;
                if(minutes < 0) {
                    minutes += 60;
                    hours--;

                }
            }

            System.out.println(hours + " : " + minutes);
        }


    /**
     *
     * A method for the FizzBuzz game.
     *
     * @param firstNumber - the number which is printing out fizz instead for.
     * @param secondNumber - the number which is printing out buzz instead for.
     * @param counter - the number which is saying how long the game shall be.
     */
    public static void fizzBuzz(int firstNumber, int secondNumber, int counter) {
            for (int i = 1; i <= counter; i++) {

                if ((i % firstNumber == 0) && (i % secondNumber == 0)){
                    System.out.println("FizzBuzz");
                }
                else if(i % firstNumber == 0) {
                    System.out.println("Fizz");
                }
                else if (i % secondNumber == 0) {
                    System.out.println("Buzz");
                }

                else {
                    System.out.println(i);
                }
            }
        }

    }

