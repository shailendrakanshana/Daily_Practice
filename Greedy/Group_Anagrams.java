import java.util.*;

public class Group_Anagrams {
    //Function for sorting string
    public static String sortString(String s){
        char ar[] = s.toCharArray();
        Arrays.sort(ar);
        return new String(ar);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> r = new ArrayList<>();

        //Sorting based on sorted forms
        Arrays.sort(strs, (a,b) -> sortString(a).compareTo(sortString(b)));
        List<String> l = new ArrayList<>();
        l.add(strs[0]);
        r.add(l);
        if(strs.length==1) return r;
        for(int i = 1;i<strs.length;i++){
            String a = sortString(strs[i-1]);
            String b = sortString(strs[i]);
            if(a.equals(b)){
                List<String> p = r.get(r.size()-1);
                p.add(strs[i]);
                r.set(r.size()-1,p);
            }
            else{
                List<String> p = new ArrayList<>();
                p.add(strs[i]);
                r.add(p);
            }
        }

        return r;
    }

    public static void main(String[] args) {
        String ar[] = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(ar));
    }
}
