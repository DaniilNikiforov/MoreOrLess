package com.company;

public class View {

    public static final String INPUT_NUMBER = "\nEnter your number: ";
    public static final String FEWER_NUMBER = "Your number is fewer than generated. Enter a larger number. ";
    public static final String LARGER_NUMBER = "Your number is larger than generated. Enter a fewer number. ";
    public static final String RANGE_WARNING = "You out of the range! ";
    public static final String RANGE = "Enter a number in the range: ";
    public static final String PREVIOUS_INPUT = "Your previous attempts: ";
    public static final String WRONG_INPUT_DATA = "Wrong input! Enter a simple number. ";
    public static final String RESULT = "Your number of attempts: ";
    public static final String CONGRATULATION = "You are Winner!";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndInt(String message, int result){ System.out.println(message + result); }

    public void printMessageWithRange(String message1, String message2, String message3, String message4, int min, int max){
        System.out.println(message1 + message2 + message3 + min + "; " + max + message4);
    }

    public void printMessageL(String message1, String message2){
        System.out.println(message1 + message2);
    }

}
