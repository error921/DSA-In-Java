import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimeFromArrayList {

    private boolean checkPrime(int n){
        for(int i =2;i*i<=n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        RemovePrimeFromArrayList obj = new RemovePrimeFromArrayList();
        int n = sc.nextInt();;

        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
//        System.out.println(arr);
        for(int i =0;i<arr.size();i++){
            if(obj.checkPrime(arr.get(i))){
                arr.remove(i--);
            }
        }
        System.out.println(arr);

    }
}
