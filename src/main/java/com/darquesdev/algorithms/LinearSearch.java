package com.darquesdev.algorithms;

public class LinearSearch {

    public int findValue(int[] numbers, int value){

        if(numbers == null) {
            throw new IllegalArgumentException("number must not be null");
        }

        for (int i=0; i<numbers.length; i++){
            if(numbers[i] == value){
                return i;
            }
        }

        return -1;
    }
}
