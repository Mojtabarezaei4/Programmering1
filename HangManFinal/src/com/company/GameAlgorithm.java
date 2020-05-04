package com.company;

import java.util.Random;

public class GameAlgorithm {


    protected static void run(){
        theAnswerWord();
    }


//Randomize an word out of a list depending to the level that the player choose
    private static void theAnswerWord(){
        Random theWord = new Random();
        int index = theWord.nextInt(TheWordList.easyMode.size());

        System.out.println(TheWordList.easyMode.get(index));
    }
}
