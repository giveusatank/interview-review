package com.interview.java.sort;

public class QuickSort {

    static String name = "123";

    public static void main(String[] args) {

        int[] arr = new int[]{5,3,8,5,3,2,4,7,9,2,21};
        quickSort(arr,0,arr.length-1);
        for(int ele:arr){
            System.out.print(ele+"\t");
        }
    }

    public static void quickSort(int[] arr,int start,int end){

        if(start < end){
            int target = arr[start];
            int i = start;
            int j = end;

            while (i < j){
                while (i < j && target <= arr[j]){
                    j--;
                }
                arr[i] = arr[j];
                while (i < j && target >= arr[i]){
                    i++;
                }
                arr[j] = arr[i];
            }
            arr[i] = target;
            quickSort(arr,start,i-1);
            quickSort(arr,i+1,end);
        }
    }
}
