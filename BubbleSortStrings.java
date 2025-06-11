package chowdeswari;

public class BubbleSortStrings {
    public static void main(String[] args) {
        String[] arr = { "banana", "apple", "grape", "cherry", "mango" };

        bubbleSort(arr);

        System.out.println("Strings sorted using Bubble Sort:");
        for (String str : arr) {
            System.out.println(str);
        }
    }

    // Bubble sort method for strings
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Last i elements are already in place
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent strings lexicographically
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap arr[j] and arr[j+1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, array is sorted
            if (!swapped)
                break;
        }
    }
}
