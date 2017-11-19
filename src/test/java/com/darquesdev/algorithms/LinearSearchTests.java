package com.darquesdev.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class LinearSearchTests {


    @Test(expected = IllegalArgumentException.class)
    public void array_must_be_not_null(){
        new LinearSearch().findValue(null, -1);
    }

    @Test
    public void find_value(){

        //given
        int value = 3;
        int expectedIndexValue = 4;
        int[] numbers = new int[]{1, 1, 1, 1, 3, 1, 1};

        //when
        int actualIndexValue =new LinearSearch().findValue(numbers, value);

        //then
        Assert.assertEquals(expectedIndexValue, actualIndexValue);

    }
}
