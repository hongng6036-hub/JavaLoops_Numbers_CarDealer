package com.tts;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Numbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        //Asking the user for 5 numbers and stores the values in 5 different variabels.
        System.out.println("Pick 5 numbers: ");
        int number1 = userInput.nextInt();
        int number2 = userInput.nextInt();
        int number3 = userInput.nextInt();
        int number4 = userInput.nextInt();
        int number5 = userInput.nextInt();

        //Store the inputted numbers into an array list
        List <Integer> numberList = new ArrayList<Integer>();
        numberList.add(number1);
        numberList.add(number2);
        numberList.add(number3);
        numberList.add(number4);
        numberList.add(number5);

        //Get the sum, product, max, and min
        //Initialize the sum value
        int sum = 0;

        //for (Integer number: myArrayVariableName)
        for (int number: numberList) {
            sum += number;
        }

        //Initialize the product value.
        int product = 1;
        for (int number: numberList) {
            product = product * number;
        }

        //Getting the max and min via Collections object
        int largest = Collections.max(numberList);
        int smallest = Collections.min(numberList);

        //Optional -- you can always sort the array (numberList) and then retrieve the first position for the lowest and the last position for the greatest.

        System.out.println("List of numbers: " + numberList);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Largest number: " +largest);
        System.out.println("Smallest = " + smallest);

    }
}
