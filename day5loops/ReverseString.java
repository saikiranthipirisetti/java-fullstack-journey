package day5loops;

public class ReverseString {
    public static void main(String[] args) {
        String s = "001";
        String r = "";
        for(int i =s.length()-1;i>=0;i--){
            r = r+s.charAt(i);
        }
        System.out.println(r);
    }
    
}
