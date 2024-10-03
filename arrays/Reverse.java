package arrays;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Reverse----------------------");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.err.println();
        reverse(arr);
        System.out.println("After Reverse--------------------------");
        for(int i : arr){
            System.out.print(i + " ");
        }
        sc.close();
    }
    static void reverse(int[] arr){
        int li = 0;
        int ri = arr.length - 1;

        while( li < ri){
            int t = arr[li];
            arr[li] = arr[ri];
            arr[ri] = t;
            li++;
            ri--;
        }
    }
}
