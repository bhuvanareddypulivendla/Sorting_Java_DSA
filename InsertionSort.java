import java.util.*;

public class InsertionSort {
    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7, 3, 2, 1, 8};

        // Bubble Sort implementation
        for (int i = 1; i < arr.length; i++) {
            int current=arr[i];
            int j=i-1;
            while(j>=0&&current<arr[j]) {
                // Compare adjacent elements
                arr[j+1]=arr[j]; 
                j--;
            }
            arr[j+1]=current;
        }
        
        // Print the sorted array
        PrintArray(arr); // Call Sort with the sorted array
    }
}
