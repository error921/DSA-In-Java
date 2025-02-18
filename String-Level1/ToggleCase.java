import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        StringBuilder sb = new StringBuilder(st);
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)>='A' && sb.charAt(i)<='Z'){
                sb.setCharAt(i,(char)(sb.charAt(i)+32));
            }else if(sb.charAt(i)>='a' && sb.charAt(i)<='z'){
                sb.setCharAt(i,(char)(sb.charAt(i)-32));
            }
        }
        System.out.println(sb);
    }
}
