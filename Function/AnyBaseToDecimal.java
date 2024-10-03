package Function;

import java.util.Scanner;


public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int base=sc.nextInt();
        int p=1;
        int sum=0;

        while(num!=0){
            int d=num%10;
            sum+=d*p;
            p*=base;
            num/=10;
        }
        System.out.println(sum);
    }
}
