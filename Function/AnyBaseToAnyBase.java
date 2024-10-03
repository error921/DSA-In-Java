package Function;

import java.util.Scanner;

class Helper{
    public int anyBaseToDecimal(int num,int base1){
        int p=1;
        int sum=0;
        while(num!=0){
            int d = num % 10;
            sum += d*p;
            p *= base1;
            num /= 10;
        }
        return sum;
    }
    public int decimalToAnyBase(int num,int base2){
        int p = 1;
        int sum = 0;
        while(num != 0){
            int d = num % base2;
            num /= base2;
            sum += d*p;
            p *= 10;
        }
        return sum;
    }
}


public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int base1 = sc.nextInt();
        int base2 = sc.nextInt();
        Helper hp = new Helper();
        int dec = hp.anyBaseToDecimal(num,base1);
        int res = hp.decimalToAnyBase(dec,base2);
        System.out.println(res);
    }
}
