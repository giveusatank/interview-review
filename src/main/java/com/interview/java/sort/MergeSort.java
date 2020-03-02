package com.interview.java.sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,3,4,6,8};
        int[] arr2 = new int[]{2,5,7,8,10,55};
        int[] ints = mergeSort(arr1, arr2);
        for(int ele:ints){
            System.out.print(ele+"\t");
        }
    }

    public static int[] mergeSort(int[] arr1, int[] arr2) {
        int len1 = arr1.length - 1;
        int len2 = arr2.length - 1;
        int[] res = new int[len1 + len2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < len1 && j < len2) {
            if (arr1[i] <= arr2[j]) {
                res[k++] = arr1[i++];
            } else {
                res[k++] = arr2[j++];
            }
        }
        if (i >= len1) {
            while (j <= len2-1){
                res[k++] = arr2[j++];
            }
        } else {
            while (i <= len1-1){
                res[k++] = arr2[i++];
            }
        }
        return res;
    }
}
