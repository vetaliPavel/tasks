package com.company;

import java.util.Arrays;

public class MinMaxNumb {

    public static void main(String[] args) {
        int[] mas = {2, 5, 3, 7, 3, 8, 9, 1, 9, 0, 11};
        int minMax = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (minMax < mas[i]) {
                minMax = mas[i];
            }
        }
        System.out.println(minMax);


    }

}



