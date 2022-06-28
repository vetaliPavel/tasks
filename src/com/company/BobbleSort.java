package com.company;

public class BobbleSort {
    public static void bobbleSort(int[] mas){
        for(int i = mas.length - 1; i > 0; i --){
            for (int j = 0; j < i; j ++){
                if(mas[j] > mas[j + 1]){
                    int tmp = mas[j];
                    mas[j] = mas[ j + 1];
                    mas[j + 1] = tmp;
                }
            }
        }
    }
}
