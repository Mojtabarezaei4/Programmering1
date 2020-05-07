package com.company;

public class View {

    public static void welcomeMessage(){
        System.out.println("Welcome to hanging a man.");
    }

    public static void chooseALevel(){
        System.out.println("Write the number of the level to choose the level or leave.");
    }
    public static void theLevels(){
        System.out.println("1. Easy\n" + "2. Medium\n"
                + "3. Hard\n" + "0. GoodBye");
    }
    public static void easyModeInfo(){
        System.out.println("It's an english word which has 2-4 characters. You have 7 chances to guess the word to save the man.");
    }

    public static void mediumModeInfo(){
        System.out.println("It's an english word which has 5-6 characters. You have 7 chances to guess the word to save the man.");
    }

    public static void hardModeInfo(){
        System.out.println("It's an english word which has 7 characters. You have 7 chances to guess the word to save the man.");
    }

    public static void guessedRight(){
        System.out.println("You guessed right!");
    }

    public static void winningMessage(){
        System.out.println("You just saved a man! You are a hero bruh.");
    }

    public static void guessedWrong(){
        System.out.println("You are hanging a man, be careful. Chances left: ");
    }

    public static void loosingMessage(){
        System.out.println("Oh noooo! He died ;(");
    }

    public static void byeSentence(){
        System.out.println("Be always a hero! Bye!");
    }

    public static void firstTryFailed(){
        System.out.println(" +----+\n" +
                "  |    |\n" +
                "       |\n" +
                "       |\n" +
                "       |\n" +
                "       |");
    }

    public static void secondTryFailed(){
        System.out.println("  +----+\n" +
                "  |    |\n" +
                "  O    |\n" +
                "       |\n" +
                "       |\n" +
                "       |");
    }

    public static void thirdTryFailed(){
        System.out.println(" +----+\n" +
                "  |    |\n" +
                "  O    |\n" +
                "  |    |\n" +
                "       |\n" +
                "       |");
    }

    public static void fourthTryFailed(){
        System.out.println("  +----+\n" +
                "  |    |\n" +
                "  O    |\n" +
                " /|    |\n" +
                "       |\n" +
                "       |");
    }

    public static void fifthTryFailed(){
        System.out.println("  +----+\n" +
                "  |    |\n" +
                "  O    |\n" +
                " /|\\  |\n" +
                "       |\n" +
                "       |");
    }

    public static void sixthTryFailed(){
        System.out.println("  +----+\n" +
                "  |    |\n" +
                "  O    |\n" +
                " /|\\  |\n" +
                " /     |\n" +
                "       |");
    }

    public static void seventhTryFailed(){
        System.out.println("  +----+\n" +
                "  |    |\n" +
                "  O    |\n" +
                " /|\\  |\n" +
                " / \\  |\n" +
                "       |");
    }

    public static void wrongDatatypeInputForString(){
        System.out.println("You need to write character/characters. Try again.");
    }

    public static void wrongDatatypeInputForInt(){
        System.out.println("You need to write a number. Try again.");
    }

    public static void replayQuestion(){
        System.out.println("Do you want to play again? \n \n" + "1. yes \n" + "2.No" );
    }

    public static void lineBreake(){
        System.out.println();
    }
}
