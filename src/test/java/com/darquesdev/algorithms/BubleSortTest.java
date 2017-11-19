package com.darquesdev.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubleSortTest {


    @Test(expected = IllegalArgumentException.class)
    public void not_nullable_numbers(){

        new BubleSort().sort(null);

    }

    @Test
    public void order_numbers(){

        //given
        int[] numbers = new int[]{5,3,6,2,7,1,0};
        int[] expectedSortedNumbers = new int[]{0, 1, 2, 3, 5, 6, 7};

        //when
        int[] actualSortedNumbers = new BubleSort().sort(numbers);

        //then
        assertArrayEquals(expectedSortedNumbers, actualSortedNumbers);
    }
}