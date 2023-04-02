public class Main {
    public static void main(String[] args) {
        int output = largestProductOfThree(new int[]{-5, 2, -5, 7});
        System.out.println(output);
    }

    private static int largestProductOfThree(int[] arr) {
        int result = arr[0]* arr[1]* arr[2];
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(result < arr[i]* arr[j]* arr[k]){
                        result = arr[i]* arr[j]* arr[k];
                    }

                }

            }

        }
        return result;
    }
}