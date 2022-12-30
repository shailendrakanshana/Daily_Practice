// Given an integer n, your task is to count how many strings of length n can be formed under the following rules:

// Each character is a lower case vowel ('a', 'e', 'i', 'o', 'u')
// Each vowel 'a' may only be followed by an 'e'.
// Each vowel 'e' may only be followed by an 'a' or an 'i'.
// Each vowel 'i' may not be followed by another 'i'.
// Each vowel 'o' may only be followed by an 'i' or a 'u'.
// Each vowel 'u' may only be followed by an 'a'.
// Since the answer may be too large, return it modulo 10^9 + 7.


import java.util.*;

public class Count_Vowels_Permutations {
    int MOD = 1000000007;
    //For memoization
    HashMap<String,Long> map = new HashMap<>();
    //Helper function 
    public long find_per(int r,char c){
        if(r==0) return 1;
        String key = ""+r+c;
        if(map.containsKey(key)) return map.get(key);
        long sum = 0;
        if(c=='a') sum = (find_per(r-1, 'e'))%MOD;
        if(c=='e') sum = (find_per(r-1, 'a')+find_per(r-1, 'i'))%MOD;
        if(c=='i') sum = (find_per(r-1, 'a')+find_per(r-1, 'e')+find_per(r-1, 'o')+find_per(r-1, 'u'))%MOD;
        if(c=='o') sum = (find_per(r-1, 'i')+find_per(r-1, 'u'))%MOD;
        if(c=='u') sum = (find_per(r-1, 'a'))%MOD;

        map.put(key, sum);

        return sum;

    }
    //MAIN FUNCTION
    public int Count(int n){
        char ar[] = {'a','e','i','o','u'};
        long sum = 0;
        for(char c: ar) sum  = (sum + find_per(n-1,c))%MOD;

        return (int)sum;
    }
    public static void main(String[] args) {
        Count_Vowels_Permutations obj = new Count_Vowels_Permutations();
        Scanner sc = new Scanner(System.in);
        System.out.println(obj.Count(sc.nextInt()));
    }
}
