public class CommonInThree {
// Given three arrays sorted in non-decreasing order, print all common elements in these arrays.
/*Examples:
   Input:
   ar1[] = {1, 5, 10, 20, 40, 80}
   ar2[] = {6, 7, 20, 80, 100}
   ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
   Output: 20, 80
*/

    void commonInThree(int[] arr1,int[] arr2,int[] arr3){
        //Initialize starting indexes for arr1,arr2,arr3
        int i=0,j=0,k=0;

        // Iterate through three arrays while all arrays have elements
        while (i<arr1.length && j<arr2.length && k<arr3.length){
            // If x = y and y = z, print any of them and move ahead
            // in all arrays
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.print(arr1[i]+" ");
                i++; j++; k++;
            }

            // x < y
            else if (arr1[i] < arr2[j])
                i++;

            // y < z
            else if (arr2[j] < arr3[k])
                j++;

            // We reach here when x > y and z < y, i.e., z is smallest
            else
                k++;
        }
    }
//=====================================================================
//        Stack<Integer> st = new Stack<Integer>();
//
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//
//        for (int i = 0; i < arr1.length; i++) {
//
//            arr.add(arr1[i]);
//        }
//        for (int i = 0; i < arr2.length; i++) {
//
//            if (arr.contains(arr2[i])) {
//                st.push(arr2[i]);
//            }
//        }
//        arr.clear();
//        for (int i = 0; i < arr3.length; i++) {
//
//            if (st.contains(arr3[i])) {
//                arr.add(arr3[i]);
//            }
//        }
//        System.out.println(arr);
}
