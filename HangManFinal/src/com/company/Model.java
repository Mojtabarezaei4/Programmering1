package com.company;

import java.util.ArrayList;

public class Model {

    private String _theRightAnswer;
    private int _difficulty;
    private char[] _theRightGuessedChar;
    private ArrayList<Character> _alreadyExitedLetters;
    private ArrayList<Character> _guessedWrong;

    public String get_theRightAnswer() {
        return _theRightAnswer;
    }

    public void set_theRightAnswer(String _theRightAnswer) {
        this._theRightAnswer = _theRightAnswer;
    }

    public int get_difficulty() {
        return _difficulty;
    }

    public void set_difficulty(int _difficulty) {
        this._difficulty = _difficulty;
    }

    public char[] get_theRightGuessedChar() {
        return _theRightGuessedChar;
    }

    public void set_theRightGuessedChar(char[] _theRightGuessedChar) {
        this._theRightGuessedChar = _theRightGuessedChar;
    }

    public ArrayList<Character> get_alreadyExitedLetters() {
        return _alreadyExitedLetters;
    }

    public void set_alreadyExitedLetters(ArrayList<Character> _alreadyExitedLetters) {
        this._alreadyExitedLetters = _alreadyExitedLetters;
    }

    public ArrayList<Character> get_guessedWrong() {
        return _guessedWrong;
    }

    public void set_guessedWrong(ArrayList<Character> _guessedWrong) {
        this._guessedWrong = _guessedWrong;
    }
}
