import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character>st = new Stack<>();

        for(int i=0;i<str.length();i++){

            char ch =str.charAt(i);
            if(ch == '(' || ch =='{' || ch == '['){
                st.push(ch);
            }else if(ch == ')'){
                if(st.size()>0 && st.peek()=='(')st.pop();
                else{
                    System.out.println("Not balanced");
                    return ;
                }
            }else if(ch=='}'){
                if(st.size()>0 && st.peek()=='{')st.pop();
                else{
                    System.out.println("Not balanced");
                    return ;
                }
            }else if(ch==']'){
                if(st.size()>0 && st.peek()=='[')st.pop();
                else{
                    System.out.println("Not balanced");
                    return ;
                }
            }
        }

        if(!st.isEmpty()){
            System.out.println("Not balanced");
            return ;
        }else{
            System.out.println("balanced");
        }



    }
}
