package com.darquesdev.algorithms;


import java.util.Arrays;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

public class BinarySearch {

    /**
     * compare with median:
     * if size of array is 1:
     * if the numbers match:
     * return found
     * else:
     * return not found
     * if greater than median:
     * compare with the second half
     * else if less than median:
     * compare with the first half
     * else:
     * return found
     */
    public boolean find(int[] numbers, int n) {

        System.out.println("Finding " + n + " in:" + Arrays.toString(numbers));

        checkNotNull(numbers, "Numbers must not be null");
        checkArgument(numbers.length > 0, "Numbers must be not empty");

        if(numbers.length == 1){
            return numbers[0] == n;
        }

        int medianIndex = numbers.length / 2;
        System.out.println("medianIndex:" + medianIndex + "; medianValue:" + numbers[medianIndex]);

        if(numbers[medianIndex] == n){ //found
            return true;
        }else if(numbers[medianIndex] > n){//take left part
            return find(Arrays.copyOfRange(numbers, 0, medianIndex), n);
        }else {
            return find(Arrays.copyOfRange(numbers, medianIndex + 1, numbers.length), n);
        }
    }
}
