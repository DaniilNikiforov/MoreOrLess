package com.company;

import java.lang.Math;
import java.util.ArrayList;

public class Model {
    private int inputValue;

    private int min;
    private int max;
    ArrayList<Integer> allAttempts = new ArrayList<>();

    public int rand(int min, int max){
         return (int) (Math.random() * (max - min + 1) + min );
    }

    public int comporator(int generateValue) {
        if (inputValue < generateValue){
            min = inputValue;
            return 1;
        }
        else if (inputValue > generateValue) {
            max = inputValue;
            return 2;
        }
        else
            return 3;
    }

    private void printInteger(ArrayList<Integer> arr){ System.out.print(arr); }


    public void previousInput(){
        allAttempts.add(inputValue);
        printInteger(allAttempts);
    }


    public int getIValue() {
        return inputValue;
    }
    public int getMin() {
        return min;
    }
    public int getMax() {
        return max;
    }

    public void setIValue(int inputValue) { this.inputValue = inputValue; }
    public void setMin(int min) { this.min = min; }
    public void setMax(int max) { this.max = max; }
}
