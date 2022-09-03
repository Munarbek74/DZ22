package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            arrayList.add(random.nextInt(100));

        }
        System.out.println(arrayList);
        ArrayList<Integer> even = new ArrayList<>();
        for (Integer num: arrayList) {
            if (num%2==0) {
                even.add(num);
            }


        }
        System.out.println(even);
        ArrayList<Integer> odd = new ArrayList<>();
        for (Integer num: arrayList) {
            if (num%2!=0) {
                odd.add(num);
            }

        }
        System.out.println(odd);
    }
}
