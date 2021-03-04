package arrays_sort;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int[] arr = {10, 30, 1, 50, 5, 70};

        sortDesc(arr);
    }

    private static void sortDesc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
