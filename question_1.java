/* 1. Given are two one-dimensional arrays A & B, which are sorted in ascending order. Write a Java program to merge them into single sorted array C that contains every item from arrays A & B, in ascending order */

import java.util.Arrays;

public class MergeSortedArrays {

    public static int[] mergeArrays(int[] A, int[] B) {

        int[] C = new int[A.length + B.length];

        int i = 0, j = 0, k = 0;

        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                C[k] = A[i];
                i++;
            } else {
                C[k] = B[j];
                j++;
            }
            k++;
        }

        while (i < A.length) {
            C[k] = A[i];
            i++;
            k++;
        }

        while (j < B.length) {
            C[k] = B[j];
            j++;
            k++;
        }

        return C;
    }

    public static void main(String[] args) {

        int[] A = {1, 3, 5, 7};
        int[] B = {2, 4, 6, 8};

        int[] C = mergeArrays(A, B);

        System.out.println("Merged Sorted Array: " + Arrays.toString(C));
    }
}
