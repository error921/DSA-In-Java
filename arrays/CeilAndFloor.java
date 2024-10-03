package arrays;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class CeilAndFloor {
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
        int c=Integer.MAX_VALUE,f=Integer.MAX_VALUE;
        while (li <= ri) {
            int mid = li + (ri - li) / 2;
            if(arr[mid] == key){
                c = mid + 1;
                f = mid - 1;
                return;
            }else if(arr[mid] > key){
                c = mid;
                ri = mid - 1;
            }else if(arr[mid] < key){
                f = mid;
                li = mid + 1;
            }
        }
        if(c == Integer.MAX_VALUE && f != Integer.MAX_VALUE){
            System.out.println("No Ceil value");
            System.out.println("Floor value: "+ arr[f]);
        }
         if(f == Integer.MAX_VALUE && c != Integer.MAX_VALUE){
            System.out.println("No floor Value");
            System.out.println("Ceil value: "+ arr[c]);
         }
         if(c != Integer.MAX_VALUE && f != Integer.MAX_VALUE)
            System.out.println("Ceil: " + arr[c]  + "floor: "+arr[f]);
    }
}
