package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> minMax = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            minMax.add((int) (Math.random() * 100));
        }

        Collections.sort(minMax);

       System.out.println(minMax);
       Collections.reverse(minMax);
       System.out.println(minMax);

    }


}




