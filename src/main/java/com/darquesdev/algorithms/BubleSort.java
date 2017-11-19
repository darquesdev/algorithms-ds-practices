package com.darquesdev.algorithms;


public class BubleSort {

    public int[] sort(int[] numbers) {

        if(numbers == null){
            throw new IllegalArgumentException("Numbers mus not be null");
        }

        for(int i=0; i<numbers.length-1; i++){

            boolean keepOrding = false;

            for (int j=0; j<numbers.length-1; j++){

                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    keepOrding = true;
                }

            }

            if(!keepOrding){
                return numbers;
            }

        }

        return numbers;
    }
}
