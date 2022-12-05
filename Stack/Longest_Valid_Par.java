import java.util.*;

public class Longest_Valid_Par{
    public static int longestValidParentheses(String s) {
        Stack<Integer> stk = new Stack<>();
        //Storing indices , -1 for valid size calculate.
        stk.push(-1);
        int ans = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(') stk.push(i);
            else{
                stk.pop();
                //Cause of -1 or getting a top index
                if(stk.isEmpty()) stk.push(i);
                else ans = Math.max(ans,i-stk.peek());
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(longestValidParentheses(")()())"));
    }
}