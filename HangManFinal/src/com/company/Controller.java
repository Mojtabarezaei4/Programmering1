package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Controller {


    int guesses = 7;

    private Model _model = new Model();
    private Scanner _inputFromThePlayer = new Scanner(System.in);

    // this method just calls the start method to start the application.
    protected void run() {
        start();

    }

    // this method starts the application and calling the gameRuns() to continue the application
    protected void start() {
        View.welcomeMessage();
        gameRuns();
    }


    /**
     * this method contains the way to how the application is going to run
     * An while loop for run the application until the player doesn't want to
     * switch-cases for see which level is chosen to run its code; how the level does work
     */
    private void gameRuns() {

        View.chooseALevel();
        View.theLevels();
        int difficulty = checkingIntInput();

        _model.set_difficulty(difficulty);

        while (true) {
            switch (_model.get_difficulty()) {
                case 0:
                    View.byeSentence();
                    System.exit(0);

                case 1:
                    easyMode();
                    break;

                case 2:
                    mediumMode();
                    break;

                case 3:
                    hardMode();
                    break;
            }

            replayQuestion();
        }
    }

    /**
     * this just asking if the player wants to still play or not
     */
    private void replayQuestion() {

        View.replayQuestion();

        int replay = checkingIntInput();

        switch (replay) {
            case 1:
                gameRuns();
                break;

            case 2:
                View.byeSentence();
                System.exit(0);
        }
    }

    /**
     * easyMode which will called from gamaRuns
     * This will call randomizeTheAnswerWord and algorithmOfTheGame to run the game
     */
    private void easyMode() {

        System.out.flush();
        View.easyModeInfo();
        randomizeTheAnswerWord();
        algorithmOfTheGame();

    }

    /**
     * mediumMode which will called from gamaRuns
     * This will call randomizeTheAnswerWord and algorithmOfTheGame to run the game
     */
    private void mediumMode() {
        System.out.flush();
        View.mediumModeInfo();
        randomizeTheAnswerWord();
        algorithmOfTheGame();
    }

    /**
     * hardMode which will called from gamaRuns
     * This will call randomizeTheAnswerWord and algorithmOfTheGame to run the game
     */
    private void hardMode() {
        System.out.flush();
        View.hardModeInfo();
        randomizeTheAnswerWord();
        algorithmOfTheGame();
    }


    //Randomize an word out of a list depending to the level the player choose
    private void randomizeTheAnswerWord() {

        Random theWord = new Random();
        int index;
        if (_model.get_difficulty() == 1) {
            index = theWord.nextInt(TheWordList.easyMode.size());
            _model.set_theRightAnswer(TheWordList.easyMode.get(index).toLowerCase());
        } else if (_model.get_difficulty() == 2) {
            index = theWord.nextInt(TheWordList.mediumMode.size());
            _model.set_theRightAnswer(TheWordList.mediumMode.get(index).toLowerCase());
        } else {
            index = theWord.nextInt(TheWordList.hardMode.size());
            _model.set_theRightAnswer(TheWordList.hardMode.get(index).toLowerCase());
        }

        System.out.println(_model.get_theRightAnswer());
    }


    private void algorithmOfTheGame(){

        char[] theRightGuessedChar = new char[_model.get_theRightAnswer().length()];

        int i = 0;
        while (_model.get_theRightAnswer().length() > i) {
            theRightGuessedChar[i] = '-';
            if (_model.get_theRightAnswer().charAt(i) == ' ') {
                theRightGuessedChar[i] = ' ';
            }
            i++;
        }

        System.out.println(theRightGuessedChar);
        ArrayList<Character> alreadyExitedLetters = new ArrayList<>();
        ArrayList<Character> guessedWrong = new ArrayList<>();

        while (guesses > 0) {

            char guessingLetter = checkingCharInput();



            int indexOfTheGuessedWrongList = 0;

            if (alreadyExitedLetters.contains(guessingLetter)) {
                System.out.println("You already have entered this letter!");
                continue;
            }

            alreadyExitedLetters.add(guessingLetter);

            if (_model.get_theRightAnswer().contains(guessingLetter + "")) {

                for (int j = 0; j < _model.get_theRightAnswer().length(); j++) {

                    if (_model.get_theRightAnswer().charAt(j) == guessingLetter) {

                        theRightGuessedChar[j] = guessingLetter;

                        System.out.println(theRightGuessedChar);
                        View.lineBrake();
                        View.guessedRight();


                    }

                }
            } else {

                guessedWrong.add(indexOfTheGuessedWrongList, guessingLetter);

                View.lineBrake();
                View.guessedWrong();
                View.lineBrake();
                guesses--;
                indexOfTheGuessedWrongList++;

                if (guesses == 6) {
                    View.firstTryFailed();
                    View.lineBrake();
                    System.out.println(theRightGuessedChar);


                }
                if (guesses == 5) {
                    View.secondTryFailed();
                    View.lineBrake();
                    System.out.println(theRightGuessedChar);


                }
                if (guesses == 4) {
                    View.thirdTryFailed();
                    View.lineBrake();
                    System.out.println(theRightGuessedChar);


                }
                if (guesses == 3) {
                    View.fourthTryFailed();
                    View.lineBrake();
                    System.out.println(theRightGuessedChar);


                }
                if (guesses == 2) {
                    View.fifthTryFailed();
                    View.lineBrake();
                    System.out.println(theRightGuessedChar);


                }
                if (guesses == 1) {
                    View.sixthTryFailed();
                    View.lineBrake();
                    System.out.println(theRightGuessedChar);


                }
                System.out.println(guessedWrong);

            }

            if (_model.get_theRightAnswer().equals(String.valueOf(theRightGuessedChar))) {
                _model.get_theRightAnswer();
                View.savedManAscciArt();
                View.lineBrake();
                View.winningMessage();
                break;
            }
        }


        if (guesses == 0) {
            View.seventhTryFailed();
            View.lineBrake();
            View.loosingMessage();
        }
    }


    /**
     *
     * Try-catch method for make the game crash free
     * this will try to get an Int
     * if the player tries to write a char this will keep the player here until
     * it will write a right input data type
     * @return an int, the int which the player writes
     */
    public int checkingIntInput(){

        int inputFromThePlayer;
        try{
            inputFromThePlayer = _inputFromThePlayer.nextInt();
        }
        catch (InputMismatchException intInput){
            View.wrongDatatypeInputForInt();
            _inputFromThePlayer.nextLine();
            inputFromThePlayer = checkingIntInput();
        }

        return inputFromThePlayer;
    }


    /**
     *
     * Try-catch method for make the game crash free
     * this will try to get an Char
     * if the player tries to write an int this will keep the player here until
     * it will write a right input data type
     * @return a char, the char which the player writes
     */
    public char checkingCharInput(){

        char inputFromThePlayer;
        try{
            inputFromThePlayer = _inputFromThePlayer.next().toLowerCase().charAt(0);
        }
        catch (InputMismatchException charInput){
            View.wrongDatatypeInputForString();
            _inputFromThePlayer.nextLine();
            inputFromThePlayer = checkingCharInput();
        }

        return inputFromThePlayer;
    }
}
