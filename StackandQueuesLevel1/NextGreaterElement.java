// package StackandQueuesLevel1;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Stack<Integer>st = new Stack<>();

        for(int j=n-1;j>=0;j--){
            int temp =arr[j];

            while(!st.isEmpty() && st.peek() <= arr[j]){
                st.pop();
            }

            if(!st.isEmpty()){
                arr[j]=st.peek();
            }
            else{
                arr[j]=-1;
            }


            st.push(temp);
        }

        for(int x : arr){
            System.out.println(x);
        }
    }
}