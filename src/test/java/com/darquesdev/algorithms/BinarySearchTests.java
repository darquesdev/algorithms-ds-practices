package com.darquesdev.algorithms;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinarySearchTests {

    @Test(expected = NullPointerException.class)
    public void non_nullable_numbers(){

        new BinarySearch().find(null, -1);

    }

    @Test(expected = IllegalArgumentException.class)
    public void non_empty_numbers(){

        new BinarySearch().find(new int[0], -1);

    }


    @Test
    public void find_a_number(){

        assertThat(new BinarySearch()
                .find(new int[]{1, 2, 3, 5, 78, 55, 66, 87, 99}, 87))
                .isEqualTo(true);

    }

    @Test
    public void not_find_a_number(){

        assertThat(new BinarySearch()
                .find(new int[]{1, 2, 3, 5, 78, 55, 66, 87, 99}, 88))
                .isEqualTo(false);

    }

}
