package com.company;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    private final int min = 1;
    private final int max = 99;
    private int counter = 0;
    private int generateV;


    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }


    public void processUser(){
        model.setMin(min);
        model.setMax(max);

        Scanner sc = new Scanner(System.in);

        generateV = model.rand(min, max);

        model.setIValue(inputIntValueWithScanner(sc));

        int i = 0;

        while(i !=3){
            i = model.comporator(generateV);

            switch (i){
                case 1:
                    view.printMessageWithRange(View.FEWER_NUMBER, View.RANGE, Constants.LEFT_SQUARE_BOUND, Constants.RIGHT_SQUARE_BOUND, model.getMin(), model.getMax() );
                    view.printMessage(View.PREVIOUS_INPUT);
                    model.previousInput();
                    model.setIValue(inputIntValueWithScanner(sc));
                    break;
                case 2:
                    view.printMessageWithRange(View.LARGER_NUMBER, View.RANGE, Constants.LEFT_SQUARE_BOUND, Constants.RIGHT_SQUARE_BOUND, model.getMin(), model.getMax() );
                    view.printMessage(View.PREVIOUS_INPUT);
                    model.previousInput();
                    model.setIValue(inputIntValueWithScanner(sc));
                    break;
                case 3:
                    view.printMessage(View.CONGRATULATION);
                    view.printMessageAndInt(View.RESULT, counter);
                    break;
            }
        }
    }

    public int inputIntValueWithScanner(Scanner sc) {

        view.printMessage(View.INPUT_NUMBER);

        int minThresholdValue = model.getMin();
        int maxThresholdValue = model.getMax();

        while( ! sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_DATA);
            sc.next();
        }

        int value = sc.nextInt();
        if(value <= minThresholdValue || value >= maxThresholdValue){
            view.printMessageL(View.WRONG_INPUT_DATA, View.RANGE_WARNING);
            return inputIntValueWithScanner(sc);
        }
        counter++;

        return value;
    }

}
