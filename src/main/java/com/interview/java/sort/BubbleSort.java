package com.interview.java.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 1, 6, 78, 8, 3, 2, 5, 6, 2, 66};
        for (int ele : arr) {
            System.out.print(ele + "\t");
        }
        System.out.println();
        bubbleSort(arr);
        for (int ele : arr) {
            System.out.print(ele + "\t");
        }
    }

    public static void bubbleSort(int[] arr) {
        int len = arr.length - 1;
        for (int i = len; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //arr[j] compare arr[j+1]
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
