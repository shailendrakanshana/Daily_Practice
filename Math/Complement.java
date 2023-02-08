public class Complement {
    public static int find_pow(int num){
        int a = 1;
        for(int i = 0;i<=31;i++){
            if(num<a) return i;
            a = a*2;
        }
        return 31;
    }
    public static int findComplement(int num) {
        if(num==0) return 1;
        if(num==1) return 0;
        return (int)(((long)Math.pow(2,find_pow(num)))-1-(long)num);
    }
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
}
