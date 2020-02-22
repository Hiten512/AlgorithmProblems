public class FixedPoint {
// Given an array of n distinct integers sorted in ascending order,
// write a function that returns a Fixed Point in the array,
// if there is any Fixed Point present in array, else returns -1.
// Fixed Point in an array is an index i such that arr[i] is equal to i.
// Note that integers in array can be negative.
//
/* Examples:
    Input: arr[] = {-10, -5, 0, 3, 7}
    Output: 3  // arr[3] == 3

    Input: arr[] = {0, 2, 5, 8, 17}
    Output: 0  // arr[0] == 0

    Input: arr[] = {-10, -5, 3, 4, 7, 9}
    Output: -1  // No Fixed Point
*/

    int binarySearch(int arr[], int low, int high)
    {
        if(high >= low)
        {
            /* low + (high - low)/2; */
            int mid = (low + high)/2;
            if(mid == arr[mid])
                return mid;

            //If value at mid is smaller than that its index
            if(mid > arr[mid])
                return binarySearch(arr, (mid + 1), high);
            else
                return binarySearch(arr, low, (mid -1));
        }

        /* Return -1 if there is
           no Fixed Point */
        return -1;
    }

}
