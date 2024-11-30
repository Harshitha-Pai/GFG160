public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={1,44,5,88,22,91};
        getSecondLargest(arr);
    }

    public static void getSecondLargest(int[] arr) {
        int n = arr.length;
        int firstLargest = -1;
        int secondLargest = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > firstLargest) {
                firstLargest = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i];
            }
        }
            System.out.println(secondLargest);


    }
}
