import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.isEmpty()){
            System.out.println(s);
            return;
        }
        else if (s.length()==1){
            System.out.println(s);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        int cnt = 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1))
            {
                if(cnt>1){
                    sb.append(cnt);
                    cnt=1;
                }
                sb.append(s.charAt(i));
            }else
            {
                cnt++;
            }
        }
        if(cnt > 1){
            sb.append(cnt);
        }
        System.out.println(sb);
    }
}
