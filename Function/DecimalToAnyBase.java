package Function;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int base=sc.nextInt();
        int p=1;
        int sum=0;
        while(num!=0){
            int d=num%base;
            sum+=d*p;
            p*=10;
            num/=base;
        }
        System.out.println(sum);
    }

}
