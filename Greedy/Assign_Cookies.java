/* PROBLEM STATEMENT : 
 * Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.

Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with;
 and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. 
 Your goal is to maximize the number of your content children and output the maximum number.
 */



import java.util.*;

public class Assign_Cookies {
    public static int findContentChildren(int[] g, int[] s) {
        if(g.length==0 || s.length==0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0;i<g.length;i++){
            if(g[i]>s[s.length-1]) break;
            else l.add(g[i]);
        }
        int i = 0;
        int j = 0;
        int c = 0;
        while(i<l.size() && j<s.length){
            if(s[j]>=l.get(i)){
                c++;
                j++;
                i++;
            }
            else j++;
        }
        return c;
    }
    public static void main(String[] args) {
        int g[] = {1,2};
        int s[] = {1,2,3};
        System.out.println(findContentChildren(g, s));
    }
    
}
