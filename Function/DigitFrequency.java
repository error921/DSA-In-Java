package Function;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int digit=sc.nextInt();
        int count=0;

        while(num!=0){
            if(num%10==digit){
                count++;
            }
            num/=10;
        }
        System.out.println(count);
    }
}
