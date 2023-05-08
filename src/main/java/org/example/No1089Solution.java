package org.example;

public class No1089Solution {
    public void duplicateZeros(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                shiftArr(i++, arr);
            }
        }
    }

    private void shiftArr(int start, int[] arr) {
        if (start < arr.length - 1) {
            int prev = arr[start];
            for (int j = start; j < arr.length - 1; j++) {
                int next = arr[j + 1];
                arr[j + 1] = prev;
                prev = next;
            }
        }
    }
}
