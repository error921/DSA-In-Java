package arrays;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i =0 ;i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int li = 0;
        int ri = n - 1;
        
        while(li <=  ri ){
            int mid = li + (ri - li) / 2;
            if(arr[mid] == key){
                System.out.println("Exist");
                return;
            }else if(arr[mid] > key){
                ri = mid - 1;
            }else if(arr[mid] < key){
                li = mid + 1;
            }
        }
    }
}
