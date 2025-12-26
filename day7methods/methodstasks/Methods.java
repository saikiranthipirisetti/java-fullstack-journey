package day7methods.methodstasks;

public class Methods {
    public static void main(String[] args) {
        
        m1(m2(),m3(100),200);   //actual args
    }
    public static void m1(int i,int x, int a){  //formal args
      
        System.out.println("m1 : " + a);
        System.out.println("m2() : " +);
        System.out.println(m3(a));
    }
    public static int m2(){
        return 10;
    }
    public static int m3(int c){
       // System.out.println("m3"+c);
       return c;
    }
}
