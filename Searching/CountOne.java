public class CountOne {
// Given a binary array sorted in non-increasing order, count the number of 1’s in it.

/* Examples:
    Input: arr[] = {1, 1, 0, 0, 0, 0, 0}
    Output: 2

    Input: arr[] = {1, 1, 1, 1, 1, 1, 1}
    Output: 7

    Input: arr[] = {0, 0, 0, 0, 0, 0, 0}
    Output: 0
*/

    int countOne(int[] arr,int low,int high) {
        if (high >= low) {
            //get the middle index
            int mid = (high + low) / 2;

            //check if the element at middle index is last 1
            if ((mid == high || arr[mid + 1] == 0) && (arr[mid] == 1)) {
                return mid + 1;
            }

            // If element is not last 1, recur for right side
            if (arr[mid] == 1) {
                return countOne(arr, mid + 1, high);
            }

            // else recur for left side
            return countOne(arr, low, mid - 1);
        }
        return 0;
    }
}
