import java.util.Scanner;

public class LabbThree {

    static Scanner _input = new Scanner(System.in);


    public static void main(String[] args) {

        javaSimpleCalculator();

    }

    /**
     *
     * A calculator with only 4 operations.
     * Addition
     * Subtraction
     * Multiplication
     * Division
     * The function is simple, you choose the operation and the the two numbers.
     *
     * I made a method for the only calculator for I wanted to keep my main method clean.
     *
     */
    protected static void javaSimpleCalculator(){

        int operationSelection = 0;
        double firstNumber = 0;
        double secondNumber = 0;

        while (true) {
            textLine("Welcome to java simple calculator!");
            lineSpace();
            textLine("Choose an operation to perform below:");
            lineSpace();
            textLine("1. Addition.");
            textLine("2. Subtraction.");
            textLine("3. Multiplication.");
            textLine("4. Division.");
            lineSpace();
            textLine("0. Exit.");
            lineSpace();
            textLine("write the number of operation down below:");
            lineSpace();

            operationSelection = _input.nextInt();
            System.out.println();

            switch (operationSelection) {
                case 0:
                    System.out.println("Good Bye!");

                    break;
                case 1:
                    flusher();
                    writeFirstNum();
                    firstNumber = _input.nextDouble();
                    lineSpace();
                    writeSecondNum();
                    secondNumber = _input.nextDouble();
                    lineSpace();
                    textLine("The sum of the two numbers is:");
                    System.out.println(firstNumber + secondNumber);
                    lineSpace();
                    break;
                case 2:
                    flusher();
                    writeFirstNum();
                    firstNumber = _input.nextDouble();
                    lineSpace();
                    writeSecondNum();
                    secondNumber = _input.nextDouble();
                    lineSpace();
                    textLine("The difference of the two numbers is:");
                    System.out.println(firstNumber - secondNumber);
                    lineSpace();
                    break;
                case 3:
                    flusher();
                    writeFirstNum();
                    firstNumber = _input.nextDouble();
                    lineSpace();
                    writeSecondNum();
                    secondNumber = _input.nextDouble();
                    lineSpace();
                    textLine("The product of the two numbers is:");
                    System.out.println(firstNumber * secondNumber);
                    lineSpace();
                    break;
                case 4:
                    flusher();
                    writeFirstNum();
                    firstNumber = _input.nextDouble();
                    lineSpace();
                    writeSecondNum();
                    secondNumber = _input.nextDouble();
                    lineSpace();
                    textLine("The quota of the two numbers is:");
                    System.out.println(firstNumber / secondNumber);
                    lineSpace();
                    break;
                default:
                    break;

            }
        }
    }

    /**
     *
     * A input method for take the first number.
     *
     * I made a single method for the only this function for keep my "app" method clean and nice.
     *
     */
    protected static void writeFirstNum() {
        System.out.println("Type the first number now:");
    }

    /**
     *
     * A input method for take the second number.
     *
     * I made a single method for the only this function for keep my "app" method clean and nice.
     *
     */
    protected static void writeSecondNum() {
        System.out.println("Type the second number now:");
    }

    /**
     *
     * A method for print out some text.
     * "content" is a text variable which you can decide when you using it.
     *
     * I made a single method for the only this function for keep my "app" method clean and nice.
     *
     */
    protected static void textLine(String content) {
        System.out.println(content);
    }

    /**
     *
     * A method for just space between the lines.
     *
     * I made a single method for the only this function for keep my "app" method clean and nice.
     *
     */
    protected static void lineSpace(){
        System.out.println();
    }

    /**
     *
     * A single method for flush the stream.
     *
     * I made a single method for the only this function for keep my "app" method clean and nice.
     *
     */
    protected static void flusher(){
        System.out.flush();
    }

    /**
     *
     * I added some extra lines of text to clean it up for the customers.
     *
     * Hope you don't hate me :)
     */

}