package arrays;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        for(int i = 0 ; i < n1 ; i++){
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for(int i =0 ; i < n2 ; i++){
            arr2[i] = sc.nextInt();
        }

        int[] res =sumHelper(arr1,arr2);

        for(int i : res){
            System.out.println(i);
        }

    }
    static int[] sumHelper(int[]arr1, int[]arr2){
        int n = arr1.length > arr2.length ? arr1.length : arr2.length;
        int[] res = new int[n];
        int c = 0;
        int k = n-1;
        for(int i = arr1.length-1, j = arr2.length-1 ; i >= 0 || j >= 0 ; i--,j--){
            int d;
            d = c;
            if(i >= 0){
                d += arr1[i];
            }
            if(j >= 0){
                d += arr2[j];
            }
            
            d %= 10;
            c /= 10;
            res[k--] = d;
        }
        return res;
    }
}
