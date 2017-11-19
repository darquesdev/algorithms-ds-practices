package com.darquesdev.algorithms;

import java.util.Arrays;

public class MergeSort {


    /**
     * if the size of array < 2: // already sorted
     * return array
     * else
     * sort left subarray
     * sort right subarray
     * combine them
     */
    public int[] sort(int[] numbers) {

        if(numbers == null){
            throw new IllegalArgumentException("Number must not be null");
        }

        if(numbers.length < 2){ //already sorted
            return numbers;
        }

        int[] leftArray = sort(Arrays.copyOfRange(numbers, 0, numbers.length / 2));
        int[] rightArray = sort(Arrays.copyOfRange(numbers, numbers.length / 2, numbers.length));

        return combine(leftArray, rightArray);
    }

    private int[] combine(int[] leftArray, int[] rightArray) {

        System.out.println("Combining leftArray:" + Arrays.toString(leftArray) + " and rightArray: " + Arrays.toString(rightArray));

        int[] combinedNumbers = new int[leftArray.length + rightArray.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int maxLeftIndex = leftArray.length;
        int maxRightIndex = rightArray.length;

        for(int i=0; i<combinedNumbers.length; i++){

            if(leftIndex == maxLeftIndex){
                combinedNumbers[i] = rightArray[rightIndex];
                rightIndex++;
            }
            else if(rightIndex == maxRightIndex){
                combinedNumbers[i] = leftArray[leftIndex];
                leftIndex++;
            }
            else{

                if(leftArray[leftIndex] <= rightArray[rightIndex]){
                    combinedNumbers[i] = leftArray[leftIndex];
                    leftIndex++;
                }else {
                    combinedNumbers[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
        }
        System.out.println("Combined: " + Arrays.toString(combinedNumbers));
        return combinedNumbers;
    }

    public static void main(String[] args) {
        int r = 7/2;
        System.out.println(r);
    }
}
