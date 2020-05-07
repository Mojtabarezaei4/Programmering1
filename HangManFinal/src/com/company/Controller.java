package com.company;

import java.util.ArrayList;
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
        int difficulty = _inputFromThePlayer.nextInt();
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
        int replay = _inputFromThePlayer.nextInt();
        switch (replay) {
            case 1:
                gameRuns();
                break;

            case 2:
                View.byeSentence();
                System.exit(0);
        }
    }


    private void easyMode() {

        View.easyModeInfo();
        randomizeTheAnswerWord();
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


        while (guesses > 0) {

            char guessingLetter = _inputFromThePlayer.next().charAt(0);

            ArrayList<Character> alreadyExitedLetters = new ArrayList<>();
            ArrayList<Character> guessedWrong = new ArrayList<>();


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
                        View.lineBreake();
                        View.guessedRight();


                    }

                }
            } else {
                guessedWrong.add(guessingLetter);
                System.out.println(guessedWrong);
                View.lineBreake();
                View.guessedWrong();
                View.lineBreake();
                guesses--;
                if (guesses == 6){
                    View.firstTryFailed();
                }
                if (guesses == 5){
                    View.secondTryFailed();
                }
                if (guesses == 4){
                    View.thirdTryFailed();
                }
                if (guesses == 3){
                    View.fourthTryFailed();
                }
                if (guesses == 2){
                    View.fifthTryFailed();
                }
                if (guesses == 1){
                    View.sixthTryFailed();
                }

            }

            if (_model.get_theRightAnswer().equals(String.valueOf(theRightGuessedChar))) {
                _model.get_theRightAnswer();
                System.out.println("You won");
                break;
            }
        }


        if (guesses == 0) {
            View.seventhTryFailed();
            View.lineBreake();
            View.byeSentence();
        }
    }


    private void mediumMode() {
        randomizeTheAnswerWord();
    }


    private void hardMode() {
        randomizeTheAnswerWord();
    }


    //Randomize an word out of a list depending to the level the player choose
    private void randomizeTheAnswerWord() {
        Random theWord = new Random();
        int index;
        if (_model.get_difficulty() == 1) {
            index = theWord.nextInt(TheWordList.easyMode.size());
            _model.set_theRightAnswer(TheWordList.easyMode.get(index));
        } else if (_model.get_difficulty() == 2) {
            index = theWord.nextInt(TheWordList.mediumMode.size());
            _model.set_theRightAnswer(TheWordList.mediumMode.get(index));
        } else {
            index = theWord.nextInt(TheWordList.hardMode.size());
            _model.set_theRightAnswer(TheWordList.hardMode.get(index));
        }

        System.out.println(_model.get_theRightAnswer());
    }


}
