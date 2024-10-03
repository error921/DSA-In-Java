package arrays;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        printBarChart(arr, max);
    }

    public static void printBarChart(int[] arr ,int max){

        for(int j = max; j > 0; j--){
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] >= j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
