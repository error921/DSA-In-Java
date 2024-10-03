package arrays;

import java.util.Scanner;

public class DifferenceOfTwoArrays {
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

        int[] res =differenceHelper(arr1,arr2);

        for(int i = 0 ; i < res.length ; i++){
            if(i==0 && res[i] == 0)
                continue;
            else
                System.out.println(res[i]);
        }
    }
    static int[] differenceHelper(int[] arr1, int[] arr2){
        int [] res = new int [arr2.length];
        int k = res.length -1;
        int b = 0;
        for(int i = arr1.length-1,j = arr2.length-1;i >= 0 || j>=0 ; i--,j--){
            int d,d1,d2;
            if(i < 0){
                d1 = 0;
            }else{d1 = arr1[i];}
            d2 = arr2[j];
            if(d2 + b >= d1){
                d = d2 + b - d1;
                b = 0;
            }else{
                d = d2 + b + 10 - d1;
                b = -1;
            }
            res[k--] = d;
        }


        return res;
    }
}
