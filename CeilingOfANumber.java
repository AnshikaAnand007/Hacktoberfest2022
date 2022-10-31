package KK.BinarySearch;

import java.util.Scanner;

public class CeilingOfANumber {

    public static int BS (int[] arr, int x) {
        int ans = 0;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (x == arr[mid]) {
                return mid;
            }

            if (x > arr[mid]) {
                start = mid + 1;
            } else  {
                end = mid - 1;
            } 
        }

        return start;
    }

    public static void main(String[] args) {
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

        int ans = BS(arr, x);
        System.out.println(ans);
    }
}
