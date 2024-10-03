package Function;

import java.util.Scanner;

class Helper{

    public int anyBaseAddition(int base,int num1,int num2){
        int sum = 0;
        int c = 0;
        int p = 1;
        while(num1 != 0 || num2 != 0 || c > 0){
            int t = c + (num1 % 10) + (num2 % 10);
            int d = t % base;
            c = t / base;
            num1 /= 10;
            num2 /= 10;
            sum += d * p;
            p *= 10;
        }
       

        return sum;
    }
}

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Helper hp = new Helper();
        System.out.println(hp.anyBaseAddition(base, num1, num2));
    }
}
