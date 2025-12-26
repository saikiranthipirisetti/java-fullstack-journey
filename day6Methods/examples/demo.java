package day6Methods.examples;

public class demo {
    public static void main(String[] args) {
        System.out.println("start");
        demo();//method calling statement.//caler method //calling method.
        System.out.println("end");
    }
    public static void demo()//called method.
    {
        demo1();//calling.
        System.out.println("demo");
       
    }
    public static void demo1()//called method.
    {
        
        System.out.println("demo");
       
    }
}
