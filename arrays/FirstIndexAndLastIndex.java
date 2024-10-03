package arrays;

import java.util.Scanner;

public class FirstIndexAndLastIndex {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int li = 0;
        int ri = n - 1;
        int fi = -1;
        while (li <= ri) {
            int mid = li + (ri - li) / 2;
            if(arr[mid] == key){
                ri = mid - 1;
                fi = mid;
            }else if(arr[mid] > key){
                ri = mid - 1;
            }else if(arr[mid] < key){
                li = mid + 1;
            }
        }
        if(fi != -1) System.out.println("First Index: "+fi);

        int lii = -1;
        li = 0;
        ri = n - 1;
        while (li <= ri) {
            int mid = li + (ri - li) / 2;
            if(arr[mid] == key){
                li = mid + 1;
                lii = mid;
            }else if(arr[mid] > key){
                ri = mid - 1;
            }else if(arr[mid] < key){
                li = mid + 1;
            }
        }

        if(lii != -1) System.out.println("Last Index: "+lii);

    }
}
