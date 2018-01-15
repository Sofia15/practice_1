package com.company;

import java.util.Arrays;

/**
 * Created by sofia on 7/12/17.
 */
public class BubbleSort {
    public static void main(String[] args) {

        int[] data = new int[]{2, 8, 7, 5, 2};
        new BubbleSort().selectionSort(data);

        System.out.println(Arrays.toString(data));
    }

    public void sort(int[] data) {

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {

                if (data[j] > data[j + 1]) {
                    int tmp = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = tmp;
                }

            }

        }
    }

    public void selectionSort(int[] data) {
        for (int i = 0; i < data.length-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = tmp;
        }

    }
}





