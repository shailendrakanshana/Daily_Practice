import java.util.*;

public class Fibbo{
    //Memoization in Fibbo
    //THIS IS TOP DOWN MEMOIZATION Cause we are finding answers n then n-1...... till base case.
    int memo[];
    public int fib(int n){
        if(memo[n]!=-1) return memo[n];
        //Memoization
        memo[n] = fib(n-1) + fib(n-2);
        return memo[n];
    }
    public int find(int n){
        memo = new int[n+1];
        Arrays.fill(memo,-1);
        memo[0] = 0;
        memo[1] = 1;
        return fib(n);
    }

    //THIS IS BOTTOM UP MEMOIZATION
    public int fibBU(int n){
        int memo[] = new int[n+1];
        memo[0]  = 0;
        memo[1]  = 1;
        for(int i = 2;i<=n;i++){
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];
    }
    public static void main(String[] args) {
        Fibbo obj = new Fibbo();
        System.out.println(obj.find(4));
        System.out.println(obj.fibBU(4));
    }
}