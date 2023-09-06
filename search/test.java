package search;
import sort.Insertion;

/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    // instance variables - replace the example below with your own
    int[] arr = {53,85,93,25,39,27,42,5,24,45,33,51,5,80,4,7,91,
                31,66,71,32,19,79,58,61,82,89,63,7,4,50,10,48,24,75,19,22,
                73,54,51,25,33,20,52,79,97,70,54,63,49};


    public static void main(String[] args) {
        int low = 0;
        int high = arr.length-1;
        int mid;
        Insertion.sort(arr);
        while (low <= high) {          
            mid = (low + high)/2;
            if (arr[mid] == target ){
                return mid;
            } else if (arr[mid] < target ) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
