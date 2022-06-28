package com.company;

public class Main {
    public static void main(String[] args) {
        int[] mass = new int[10];
        for(int i = 0; i < mass.length ; i ++){
            mass[i] = (int)(Math.random() * 100);
        }
        BobbleSort.bobbleSort(mass);
        for (int x : mass){
            System.out.println(x);
        }
    }
}
