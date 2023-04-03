public class Solution {
    static int[] bubbleSort(int[] arr) {
        int arrLength = arr.length;

        for (int i = 0; i < arrLength; i++) {
            int swaps = 0;

            for (int j = 0; j < arrLength-1; j++) {
                if(arr[j] > arr[j+1]){
                    swaps++;
                    arr = arrSwap(arr, j, j+1);
                }
            }
            if(swaps ==0){
                break;
            }
        }
        return arr;
    }

    private static int[] arrSwap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }
}
