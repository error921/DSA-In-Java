package arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i =0 ;i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println("Before Rotation----------");
        for(int x: arr){
            System.out.print(x + " ");
        }
        System.out.println();
        rotate(arr,k);
        System.out.println("After Rotation----------");
        for(int x: arr){
            System.out.print(x + " ");
        }
    }
    static void reverse(int[]arr, int li, int ri){
        while (li < ri) {
            int t = arr[li];
            arr[li] = arr[ri];
            arr[ri] =t;
            li++;
            ri--;
        }
    }
    static void rotate(int[] arr, int k){
        k = k % arr.length;
        int n = arr.length;
        if(k < 0){
            k += arr.length;
        }
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }
}
