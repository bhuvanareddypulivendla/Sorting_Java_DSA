import java.util.*;

public class SlectionSort {
    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7, 3, 2, 1, 8};

        // Bubble Sort implementation
        for (int i = 0; i < arr.length-1; i++) {
            int smallest=i;
            for (int j = i+1;j < arr.length; j++) {
                // Compare adjacent elements
                if (arr[smallest] > arr[j]) {
                    // Swap if they are in the wrong order
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        
        // Print the sorted array
        PrintArray(arr); // Call Sort with the sorted array
    }
}
