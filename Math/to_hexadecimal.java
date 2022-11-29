public class to_hexadecimal {
    char[] ar = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    
    public String toHex(int num) {
        if(num == 0) return "0";
        String result = "";
        while(num != 0){
            result = ar[(num & 15)] + result; 
            num = (num >>> 4);
        }
        return result;
    }
    public static void main(String[] args) {
        to_hexadecimal obj = new to_hexadecimal();
        System.out.println(obj.toHex(-1));
    }
    
}
