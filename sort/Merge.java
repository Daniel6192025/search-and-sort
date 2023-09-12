package sort;

import java.util.Arrays;

/**
 * Write a description of class Merge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Merge
{

    /**
     * Returns the sorted array
     */
    public static int[] sort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        
        int mid = arr.length/2;
        int[] leftLength = new int [mid];
        int[] rightLength = new int [arr.length - mid];
        System.arraycopy(arr, 0, leftLength, 0, mid);
        System.arraycopy(arr, mid, rightLength, 0, arr.length - mid);
        
        sort(leftLength);
        sort(rightLength);
        
        merge(arr, leftLength, rightLength);
        
        return arr;
        }
        
    public static void merge(int[] arr, int[] leftLength, int[] rightLength) {
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < leftLength.length && j < rightLength.length) {
            if (leftLength[i] <= rightLength[j]) {
                arr[k++] = leftLength[i++];
            } else {
                arr[k++] = rightLength[j++];
            }
        }
        
        while (i < leftLength.length) {
            arr[k++] = leftLength[i++];
        }
        
        while (j < rightLength.length) {
            arr[k++] = rightLength[j++];
        }
    }
    

    public static void main(String[] args) {
        int[] arr = {53,85,93,25,39,27,42,5,24,45,33,51,5,80,4,7,91,
                31,66,71,32,19,79,58,61,82,89,63,7,4,50,10,48,24,75,19,22,
                73,54,51,25,33,20,52,79,97,70,54,63,49};    

        // Test the sort
        testSort(sort(arr));
    }

    public static void testSort(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                System.out.println("FAIL at index "+i);
                System.out.println(Arrays.toString(arr));
                return;
            }
        }
        System.out.println("SUCCESS!");
    }

}
