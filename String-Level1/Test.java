import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Test {
    public static void main(String [] args){
//        String s = "Nihar";
        Scanner st = new Scanner(System.in);
        String s1=st.nextLine();
//        String s2=st.next();
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.charAt(2));

        int[]nums = {1,2,3,4,5};
        List<Integer> l1 = new ArrayList<>(nums);


    }
}
