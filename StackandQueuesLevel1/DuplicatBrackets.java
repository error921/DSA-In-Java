import java.util.Scanner;
import java.util.Stack;

public class DuplicatBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character>st = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=')'){
                st.push(str.charAt(i));
            }
            else{
                if(st.peek()=='('){
                    System.out.println("Duplicate Brackets");
                    return;
                }
                while(st.peek()!='('){
                    st.pop();
                }
                st.pop();
            }
        }
        System.out.println("No Duplicate Brackets Found!!!!");
    }
}
