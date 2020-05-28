package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class View {


    public static void welcomeMessage() {
        System.out.println("Welcome to hanging a man.");
    }

    public static void chooseALevel() {
        System.out.println("Write the number of the level to choose the level or leave.");
    }

    public static void theLevels() {
        System.out.println("\t 1. Easy\n" + "\t 2. Medium\n"
                + "\t 3. Hard\n" + "\t 0. GoodBye");
    }

    public static void easyModeInfo() {
        System.out.println("It's an english word which has 2-4 characters. You have 7 chances to guess the word to save the man. \n"
                + "You save a chance if you guess right but You will loose a chance if you guess wrong");
    }

    public static void mediumModeInfo() {
        System.out.println("It's an english word which has 5-6 characters. You have 7 chances to guess the word to save the man \n"
                + "You save a chance if you guess right but You will loose a chance if you guess wrong");
    }

    public static void hardModeInfo() {
        System.out.println("It's an english word which has 7 characters. You have 7 chances to guess the word to save the man \n"
                + "You save a chance if you guess right but You will loose a chance if you guess wrong");
    }

    public static void guessedRight() {
        System.out.println("You guessed right!");
    }

    public static void winningMessage() {
        System.out.println("You just saved a man! You are a hero bruh.");
    }

    public static void guessedWrong() {
        System.out.println("You are hanging a man, be careful. Chances left: ");
    }

    public static void loosingMessage() {
        System.out.println("Oh noooo! He died ;(");
    }

    public static void byeSentence() {
        System.out.println("Be always a hero! Bye!");
    }

    public static void seventhTryFailed() {
        System.out.println("  +----+\n" +
                "  |    |\n" +
                "  O    |\n" +
                " /|\\   |\n" +
                " / \\   |\n" +
                "       |");
    }

    public static void wrongDatatypeInputForChar() {
        System.out.println("You need to write character/characters. Try again.");
    }

    public static void wrongDatatypeInputForInt() {
        System.out.println("You need to write a number. Try again.");
    }

    public static void replayQuestion() {
        System.out.println("Do you want to play again? \n \n" + "\t 1. yes \n" + "\t 2.No");
    }

    public static void lineBrake() {
        System.out.println();
    }

    public static void savedManAscciArt() {
        System.out.println("                       ,\n" +
                "          .---.      _//\n" +
                "         //\\_/\\\\     \\_\\\n" +
                "        |/ 0_0 \\|    /\n" +
                "        | ,___, |   /\n" +
                "         \\\\___//   /\n" +
                "          `\"|\"`  .'\n" +
                "        .--'/'--'\n" +
                "       /   |\n" +
                "      |    |\n" +
                "      |    |\n" +
                "    .-'\\   |\n" +
                "    `\"\"\"`  \\\n" +
                "       ,---.\\\n" +
                "       \\     \\\n" +
                "        \\     \\\n" +
                "         \\     \\\n" +
                "        .-\\     \\\n" +
                "       /_.'      |\n" +
                "                 /\\\n" +
                "            yey  \\ \\\n" +
                "                  `\"");
    }

    public static void alreadyEnteredGuess() {

        System.out.println("You already have entered this letter!");
    }

    public static ArrayList<String> hangManASCII = new ArrayList<String>(
            Arrays.asList(" +----+\n" +
                    "  |    |\n" +
                    "       |\n" +
                    "       |\n" +
                    "       |\n" +
                    "       |", "  +----+\n" +
                    "  |    |\n" +
                    "  O    |\n" +
                    "       |\n" +
                    "       |\n" +
                    "       |", " +----+\n" +
                    "  |    |\n" +
                    "  O    |\n" +
                    "  |    |\n" +
                    "       |\n" +
                    "       |", "  +----+\n" +
                    "  |    |\n" +
                    "  O    |\n" +
                    " /|    |\n" +
                    "       |\n" +
                    "       |", "  +----+\n" +
                    "  |    |\n" +
                    "  O    |\n" +
                    " /|\\   |\n" +
                    "       |\n" +
                    "       |", "  +----+\n" +
                    "  |    |\n" +
                    "  O    |\n" +
                    " /|\\   |\n" +
                    " /     |\n" +
                    "       |", "  +----+\n" +
                    "  |    |\n" +
                    "  O    |\n" +
                    " /|\\   |\n" +
                    " / \\   |\n" +
                    "       |"));

}
