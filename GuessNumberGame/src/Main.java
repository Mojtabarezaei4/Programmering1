import java.util.Scanner;

public class Main {

    static Scanner _inputFromThePlayer = new Scanner(System.in);

    protected static int _chooseTheLevel;       //the level which the player chooses
    protected int _theMinimumNumber;     //the minimum number in the interval
    protected int _theHighestNumber;     //the highest number in the interval
    protected int _theRightAnswer;       //the randomized number
    protected int _theGuessesLeft;       //the number of guesses which are left
    protected int _theNumberOfGuesses;   //the number of guesses which the player choose
    protected int _theGuessedNumber;     //the number which the player guessed


    public static void main(String[] args) {

        launchGuesseyGame();
    }

    /**
     *
     * This method contains the code of the game.
     * This will contain the whole game.
     */
    protected static void launchGuesseyGame(){

        System.out.println("Hello and welcome to Guessey game.");
        System.out.println();
        System.out.println("This a guess game.\n" +
                    "You will choose a level and then guess the \"unknown\" number.\n" +
                    "You win if you guess right.\n" +
                    "You lose if you don't have any guesses left.");
        System.out.println();
        System.out.println("Choose the level: \n" + "1. Easy\n" + "2. Medium\n"
            + "3. Hard\n" + "0. GoodBye");
        System.out.println();
        System.out.println("Please write the chosen number down blow");

        _chooseTheLevel = _inputFromThePlayer.nextInt();
        System.out.println();

        switch (_chooseTheLevel){
            case 0:
            System.out.println("Hope to see you soon.");

            break;

            case 1:
            easyMode();

            break;

            case 2:
            mediumMode();

            break;

            case 3:
            hardMode();

            break;

            default:
                    break;
            }





    }

    /**
     *
     * This method contains the easiest mode of this game.
     */
    protected static void easyMode(){

    }

    /**
     *
     * This method contains the medium mode of this game.
     * This will complain how this mode works.
     */
    protected static void mediumMode(){

    }

    /**
     *
     * This method contains the hardest mode of this game.
     * This says how the game plays and so on.
     */
    protected static void hardMode(){

    }
}
