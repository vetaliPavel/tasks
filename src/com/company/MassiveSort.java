package com.company;

public class MassiveSort {
    public static void main(String[] args) {
        int[] mas = new int[5];
        for (int i = 0; i < mas.length; i++){
            mas[i] = (int) (Math.random() * 100);
        }
        for (int i = mas.length -1 ; i > 0; i --){
            for (int j = 0; j < i; j ++){
                if(mas[j] > mas[j + 1]){
                    int temp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = temp;
                }
            }
        }
        for (int x : mas){
            System.out.println(x);
        }
    }
}
