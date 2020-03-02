package com.interview.sort;


public class Sorts {

    /*@Test
    public void testQuickSort() {
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        int len = arr.length - 1;
        quickSort(arr, 0, len);
        for (int x : arr) {
            System.out.print(x + "\t");
        }
    }

    @Test
    public void testDumpSort() {
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        dumpSort(arr);
        for (int x : arr) {
            System.out.print(x + "\t");
        }
    }

    @Test
    public void testMergeSort() {
        int[] arr1 = new int[]{2, 4, 6, 8, 10, 12};
        int[] arr2 = new int[]{1, 3, 5, 7, 9, 11};
        int[] ints = mergeSort(arr1, arr2);
        for (int x : ints) {
            System.out.print(x + "\t");
        }
    }

    @Test
    public void testChooseSort() {
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        chooseSort(arr);
        for (int x : arr) {
            System.out.print(x + "\t");
        }
    }

    @Test
    public void testBubbleSort() {
        //int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        long start = System.currentTimeMillis();
        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9};
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        bubbleSortBestCondition(arr1);
        for (int x : arr1) {
            System.out.print(x + "\t");
        }
    }

    @Test
    public void testInsertSort() {
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        insertSort(arr);
        for (int x : arr) {
            System.out.print(x + "\t");
        }
    }*/

    //【1、快速排序】
    //O(nlog2n) O(1)
    //不稳定算法
    public static void quickSort(int[] arr, int start, int end) {
        int i = start;
        int j = end;
        if (i < j) {
            int target = arr[i];
            while (i < j) {
                while (arr[j] >= target && i < j) {
                    j--;
                }
                arr[i] = arr[j];
                while (arr[i] <= target && i < j) {
                    i++;
                }
                arr[j] = arr[i];
            }
            arr[i] = target;
            quickSort(arr, start, i - 1);
            quickSort(arr, i + 1, end);
        }
    }

    //【2、堆排序】
    //O(nlog2n) O(1)
    //不稳定算法
    public static void dumpSort(int[] arr) {
        int len = arr.length;
        int lastNonReaf = len / 2 - 1;
        for (int i = lastNonReaf; i >= 0; i--) {
            adjustDumpConstruct(arr, i, len);
        }
        for (int j = len - 1; j > 0; j--) {
            swapElement(arr, 0, j);
            adjustDumpConstruct(arr, 0, j);
        }
    }
    public static void adjustDumpConstruct(int[] arr, int startIndex, int length) {
        int left = startIndex * 2 + 1;
        int right = startIndex * 2 + 2;
        int max = startIndex;
        if (left <= length - 1 && arr[left] >= arr[max]) {
            max = left;
        }
        if (right <= length - 1 && arr[right] >= arr[max]) {
            max = right;
        }
        if (max != startIndex) {
            swapElement(arr, startIndex, max);
            adjustDumpConstruct(arr, max, length);
        }
    }
    public static void swapElement(int[] arr, int source, int target) {
        int temp = arr[source];
        arr[source] = arr[target];
        arr[target] = temp;
    }
    //【3、归并排序】
    //O(nlogn) O(n)
    //稳定算法
    public static int[] mergeSort(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] temp = new int[len1 + len2];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i <= len1 - 1 && j <= len2 - 1) {
            if (arr1[i] <= arr2[j]) {
                temp[k++] = arr1[i++];
            } else {
                temp[k++] = arr2[j++];
            }
        }
        if (i <= len1 - 1) {
            while (i <= len1 - 1) {
                temp[k++] = arr1[i++];
            }
        } else {
            while (j <= len2 - 1) {
                temp[k++] = arr1[j++];
            }
        }
        return temp;
    }
    //【4、选择排序】
    //O(n^2) 0(1)
    //不稳定
    public static void chooseSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i <= len - 1; i++) {
            int min = i;
            for (int j = i; j <= len - 1; j++) {
                if (arr[j] <= arr[min]) {
                    min = j;
                }
            }
            swapElement(arr, i, min);
        }
    }
    //【5、冒泡排序】
    //O(n^2) 0(1)
    //稳定
    public static void bubbleSort(int[] arr) {
        int len = arr.length - 1;
        for (int i = len; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] >= arr[j + 1]) {
                    swapElement(arr, j, j + 1);
                }
            }
        }
    }
    //【5、冒泡排序最优情况】
    //O(n) (1)
    public static void bubbleSortBestCondition(int[] arr) {
        boolean flag = true;
        int len = arr.length - 1;
        for (int i = len; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] >= arr[j+1]){
                    swapElement(arr,j,j+1);
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }

    //【6、插入排序】
    //O(n^2) O(n) O(1)
    //稳定
    public static void insertSort(int[] arr){
        int len = arr.length-1;
        for(int i=1;i<=len;i++){
            int temp = arr[i];
            for(int j=i-1;j>=0;j--){
                if(arr[j] > temp){
                    arr[j+1] = arr[j];
                    if(j == 0){
                        arr[j] = temp;
                    }
                }else {
                    arr[j+1] = temp;
                    break;
                }
            }
        }
    }
}
