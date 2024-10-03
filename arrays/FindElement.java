package arrays;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int item = sc.nextInt();
        System.out.println("Index of Item: "+searchElement(arr, item));
    }

    public static int searchElement(int [] arr,int item){

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == item){
                return i;
            }
        }

        return -1;
    }



}
