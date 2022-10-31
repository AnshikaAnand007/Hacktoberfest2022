package KK.BinarySearch;

import java.util.Scanner;

public class OrderAgnosticBS {
    static int OABS (int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether array is sorted in ascending or descending order 
        boolean isAsc;

        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }



        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (target == arr[mid]) {
                return mid;
            }


            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else  {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else  {
                    end = mid - 1;
                }
            }
        }

        return -1;

    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();

        System.out.println("Enter a sorted array of length " + n + " : ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println("Enter the target element : ");
        int x = sc.nextInt();
    }
}
