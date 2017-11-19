package com.darquesdev.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTests {

    @Test(expected = IllegalArgumentException.class)
    public void non_nullable_input_numbers(){

        new MergeSort().sort(null);

    }

    @Test
    public void order_1_number(){

        int[] sortedNumbers = new MergeSort().sort(new int[]{0});
        Assert.assertArrayEquals(new int[]{0}, sortedNumbers);
    }

    @Test
    public void order_2_numbers(){

        int[] sortedNumbers = new MergeSort().sort(new int[]{1, 0});
        Assert.assertArrayEquals(new int[]{0, 1}, sortedNumbers);
    }

    @Test
    public void order_multiple_numbers(){

        int[] sortedNumbers = new MergeSort().sort(new int[]{1, 0, 9, 4, 2, 4, 1}); //7 numbers
        Assert.assertArrayEquals(new int[]{0, 1, 1, 2, 4, 4, 9}, sortedNumbers);
    }

}
