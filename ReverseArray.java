public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};//Make changes accordingly ;

        reverseArray(arr);
    }

    public static void reverseArray(int arr[]) {

        for(int i=0; i<arr.length/2; i++) {
            int n = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = n;
        }

        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
