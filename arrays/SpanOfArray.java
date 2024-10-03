package arrays;

import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int MAX = Integer.MIN_VALUE;
        int MIN = Integer.MAX_VALUE;
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i : arr){
            if(i > MAX){
                MAX = i;
            }
            if(i < MIN){
                MIN = i;
            }
        }

        System.out.println(MAX - MIN);
    }
}
