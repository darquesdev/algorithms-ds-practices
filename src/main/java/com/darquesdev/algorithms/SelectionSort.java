package com.darquesdev.algorithms;

public class SelectionSort {

    public int[] sort(int[] array) {

        if(array == null){
            throw new IllegalArgumentException("Array must not be null");
        }

        if(array.length < 2){
            return array;
        }

        for (int i=0; i < array.length; i++) {
            int smallestNumberIndex = findMinNumber(array, i);
            if(array[smallestNumberIndex] < array[i]){
                swapPosition(array, i, smallestNumberIndex);
            }
        }

        return array;
    }

    private void swapPosition(int[] array, int a, int b) {
        int aValue = array[a];
        int bValue = array[b];
        array[a] = bValue;
        array[b] = aValue;
    }

    private int findMinNumber(int[] numbers, int fromIndex) {

        int minValue = numbers[fromIndex];
        int minIndex = fromIndex;

        for (int i = fromIndex; i < numbers.length; i++){
            if(numbers[i] < minValue){
                minValue = numbers[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}
