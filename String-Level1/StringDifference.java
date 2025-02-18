import java.util.Scanner;

public class StringDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(s1.charAt(0));
        for(int i=1;i<s1.length();i++){

            sb.append(s1.charAt(i)-s1.charAt(i-1));
            sb.append(s1.charAt(i));
        }
        System.out.println(sb);
    }
}
