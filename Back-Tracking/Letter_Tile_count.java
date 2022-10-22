import java.util.Scanner;

public class Letter_Tile_count {
    public static int counttile(int freq[],String ans){
        int c = 0;
        for(int i =0 ;i<freq.length;i++){
            if(freq[i]>0){
                char ch = (char)(i+'A');
                freq[i]--;
                c = c +counttile(freq, ans+ch)+1;
                freq[i]++;

            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tiles = sc.next();
        int freq[] = new int[26];
        for(int i =0 ;i<tiles.length();i++){
            freq[tiles.charAt(i)-'A']++;
        }
        System.out.println(counttile(freq, ""));
    }
}
