import java.util.*;

public class Lettertile {
    public static Set<String> numTilePossibilities(String tiles) {
        Set<String> set = new HashSet<>();
        boolean[] b = new boolean[tiles.length()];
        permute(tiles, "", set, b);
        return set;
    }
    public static void permute(String tiles, String curr, Set<String> set, boolean[] b){
        set.add(curr);
        for(int i=0; i<tiles.length(); i++){
            if(!b[i]){
                b[i]=true;
                permute(tiles, curr+tiles.charAt(i), set, b);
                b[i]=false;
            }
        }   
    }
    public static void main(String[] args) {
        String s = "123";
        System.out.println(numTilePossibilities(s));
    }
}
