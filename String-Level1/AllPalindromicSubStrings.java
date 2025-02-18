import java.util.Scanner;

public class AllPalindromicSubStrings {

    private boolean checkPalindrome(String s) {

        int i = 0, j = s.length() - 1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        AllPalindromicSubStrings obj = new AllPalindromicSubStrings();
        for(int i=0;i<s.length()-1;i++){
            for(int j = i+1;j<=s.length();j++){
                if(obj.checkPalindrome((s.substring(i,j)))){
                    System.out.println(s.substring(i,j));
                }
            }
        }
    }
}
