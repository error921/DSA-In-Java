import java.util.Scanner;

public class PermutationOfString {

    private int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        PermutationOfString obj = new PermutationOfString();
        int itr = obj.factorial(s.length());

        for(int i=0;i<itr;i++){
            StringBuilder sb1 = new StringBuilder(s);
            StringBuilder sb2 = new StringBuilder();
            for(int j=s.length();j>=1;j--){
                sb2.append(sb1.charAt(i%j));
                sb1.deleteCharAt(i%j);
            }
            System.out.println(sb2);
        }

    }
}
