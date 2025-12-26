package day4Conditional.switchcasebased;

public class Onetopic {
    public static void main(String[] args) {
        //here we are checking one thing.
        int a =0;
        int x;
        if(a==0){
            x = 6;
            a =7;
            
        }
      //  System.out.println(x);  it will give compile time error
        System.out.println(a);
        int n ;

        switch(1){
            case 1:
                n =3;
            case 2:
                n = 4;
        }
        System.out.println(n);
    }
}
//Java does not assign default values to local variables, so they must be initialized before use.
//Local variables must be initialized before use.