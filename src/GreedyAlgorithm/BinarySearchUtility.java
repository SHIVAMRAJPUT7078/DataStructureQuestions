package GreedyAlgorithm;

import java.util.Arrays;

public class BinarySearchUtility {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        int[] arr = {1, 2, 5, 10, 15, 20, 25, 30};
        int search = 12;
        int idx = Arrays.binarySearch(arr, search);
        /*this gives the lower bound index of an element
        if element is not present
        lower bound = |index|-2; if element is not present
        upper bound = |index|-1; immediate greater
        lower bound element is the immediate lower element of the search element
        */
        if (idx < 0) {
            idx = Math.abs(idx) - 2; // for lower bound
        }
        System.out.println(idx);


    }
}
