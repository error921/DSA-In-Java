package arrays;

import java.util.Scanner;

public class SubSetOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int limit = (int)Math.pow(2, n);
        for(int i = 0 ; i < limit ; i++){
            int temp = i;
            String set = "";
            for(int j = arr.length -1 ; j >= 0 ; j--){
                if(temp % 2 != 0){
                    set = arr[j] + set;
                }else{
                    set = "-" + set;
                }
                temp /= 2;
            }
            System.out.println(set);
        }
        
    }
}
