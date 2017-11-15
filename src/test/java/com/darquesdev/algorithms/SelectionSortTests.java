package com.darquesdev.algorithms;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SelectionSortTests {

    @Test
    public void sort_empty_array(){

        int[] array = new int[0];
        int[] sortedArray = new SelectionSort().sort(array);

        assertArrayEquals( array, sortedArray);
    }

    @Test
    public void sort_1_element_array(){

        int[] array = new int[1];
        array[0] = 1;

        int[] sortedArray = new SelectionSort().sort(array);

        assertArrayEquals( array, sortedArray);
    }

    @Test
    public void sort_2_elements_array(){

        //given
        int[] array = new int[]{2, 1};
        int[] expectedSortedArray = new int[]{1, 2};

        //when
        int[] actualSortedArray = new SelectionSort().sort(array);

        //then
        assertArrayEquals( expectedSortedArray, actualSortedArray);
    }


    @Test(expected = IllegalArgumentException.class)
    public void nullable_array_not_permitted(){

        //when
        new SelectionSort().sort(null);
    }


    @Test
    public void sort_multiple_elements_array(){

        //given
        int[] array = new int[]{2, 1, 9, 2, 4, 1, 3, -1};
        int[] expectedSortedArray = new int[]{-1, 1, 1, 2, 2, 3, 4, 9};

        //when
        int[] actualSortedArray = new SelectionSort().sort(array);

        //then
        assertArrayEquals( expectedSortedArray, actualSortedArray);
    }

}
