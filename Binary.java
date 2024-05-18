public class Binary {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 7, 8, 9};
        int start = 0;
        int end = arr.length - 1;
        int search = 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == search) {
                System.out.println("Item found at index " + mid);
                break;
            } else if (arr[mid] < search) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }
}
//binary search in java logic part
