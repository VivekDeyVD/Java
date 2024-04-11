public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {15, 9, 7, 13, 12, 16, 4, 18, 11};
        int length = arr.length;
        QuickSort ob = new QuickSort();
        ob.quicksortRecursion(arr, 0, length - 1);
        ob.printArray(arr);
    }

    int partition(int arr[], int l, int h) {
        int pivot = arr[l + (h - l) / 2]; // Choose pivot element
        while (l <= h) {
            while (arr[l] < pivot) {
                l++;
            }
            while (arr[h] > pivot) {
                h--;
            }
            if (l <= h) {
                int temp = arr[l];
                arr[l] = arr[h];
                arr[h] = temp;
                l++;
                h--;
            }
        }
        return l; // Return the pivot index
    }

    void quicksortRecursion(int arr[], int l, int h) {
        if (l < h) {
            int p = partition(arr, l, h);
            quicksortRecursion(arr, l, p - 1); // Sort left subarray
            quicksortRecursion(arr, p, h);     // Sort right subarray
        }
    }

    void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
