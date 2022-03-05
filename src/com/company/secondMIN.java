package com.company;

public class secondMIN {
    public static void main(String[] args) {
        // 2.Write a method that displays smallest and second smallest elements of an int unsorted array .Do not sort the array. The array contains no less than two 2 elements.
        //public static void find2Min (int[] arr) {3,5,2,9,4,15}->2, 3
        int arr[] = {5,2,9,3,15};
        System.out.println(find2Min(arr));
    }

    public static int find2Min(int[] arr){
        int min = arr[0], secondMin = Integer.MAX_VALUE;
        for (int elem: arr) {
            if (min > elem) min = elem;
        }
        for (int elem: arr) {
            if (secondMin > elem && min != elem) secondMin = elem;
        }
        return secondMin;
    }
}
