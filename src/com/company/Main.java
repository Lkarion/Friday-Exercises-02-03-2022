package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// найти непарные элементы
        int[] array = {4,6,5,4,4,5,6};
        getNotPair(array);
    }

    private static void getNotPair(int[] array) {
        int res = 0;
        for (int elem: array) {
            res^=elem;
        }
        System.out.println(res);
    }

}
