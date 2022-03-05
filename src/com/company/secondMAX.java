package com.company;

public class secondMAX {
    public static void main(String[] args) {
        // 1.Write a method that displays second max element of an int array .
        // The array contains not less than two 2 elements.
        //static void find2Largest(int arr[]) {5,2,9,3,15}->9
        int arr[] = {5,2,9,3,15};
        System.out.println(find2Largest(arr));
    }
    public static int find2Largest(int[] arr){
        int max = arr[0], secondMax = Integer.MIN_VALUE;
        for (int elem: arr) {
            if (max < elem) max = elem;
        }
        for (int elem: arr) {
            if (secondMax < elem && max != elem) secondMax = elem;
        }
        return secondMax;
    }
}
