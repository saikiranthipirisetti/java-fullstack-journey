package day6Methods.examples;
//METHOD WITHOUT ARGUMENTS AND WITHOUT RETURN STATEMENT
//USING CHAINING..
import java.util.*;
public class Operation {
    public static void main(String[] args) {
        add();
        sub();
        multi();
       
    }
    public static void add(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println(c);
        sc.close();

    }
    public static void sub(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a-b;
        System.out.println(c);
        sc.close();

    }
    public static void multi(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a*b;
        System.out.println(c);
        sc.close();

    }
    
}

/*
package day6Methods.examples;
import java.util.*;

public class Operation {

    static Scanner sc = new Scanner(System.in); // ✅ ONE scanner

    public static void main(String[] args) {
        add();
        sub();
        multi();
        sc.close(); // ✅ close ONCE
    }

    public static void add() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }

    public static void sub() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a - b);
    }

    public static void multi() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a * b);
    }
}

*/