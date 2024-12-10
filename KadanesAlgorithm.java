public class KadanesAlgorithm {
    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));

    }
    static int maxSubarraySum(int[] arr) {

        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        int n= arr.length;


        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }


            if (sum < 0) {
                sum = 0;
            }
        }

        return maxi;

    }
}
