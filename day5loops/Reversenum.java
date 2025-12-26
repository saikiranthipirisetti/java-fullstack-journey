package day5loops;

public class Reversenum {
    public static void main(String[] args) {
        int a = 123;
        int x =0;
        int n =0;
        while(a!=0){
         x = a%10;
        n = n*10+x;
        a = a/10;

        }
        System.out.println(n);
    }
}
