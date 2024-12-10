import java.util.Arrays;

public class MinimizeTheHeightsII {
    public static void main(String[] args) {
        int k = 2, arr[] = {1, 5, 8, 10};
        System.out.println(getMinDiff(arr,k));

    }
    static int getMinDiff(int[] arr, int k) {
        int n = arr.length;

        Arrays.sort(arr);

        int result = arr[n - 1] - arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] - k < 0)
                continue;

            int minH = Math.min(arr[0] + k, arr[i] - k);

            int maxH = Math.max(arr[i - 1] + k, arr[n - 1] - k);

            result = Math.min(result, maxH - minH);
        }
        return result;
    }
}
