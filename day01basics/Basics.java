class Main{
    public static void main(String args[]){
        System.out.print(10);
        System.out.print(20);
        System.out.println(30);
        System.out.println(40);
        System.out.println(50);
        System.out.print(60);
        System.out.print(70);
        System.out.println(80);
        System.out.println(90);
        System.out.print(100);
        System.out.println(110);
        System.out.print(120);
    }
}


//Area of square
class Main{
    
    public static void main(String args[]){
      double s = 4.2;
      double area = s*s;
      float f = 4.2f;
      double area1 = s*s;
      System.out.println(area);
      System.out.print(area1);
    }
}
//Area of circle
//wp  to find area of circle and rectangle
class Main{
    
    public static void main(String args[]){
      double s = 4.2;
      double area = 3.14*s*s;
      float l = 3.5f;
      float b = 4;
      double area1 = l*b;
      System.out.println(area);
       System.out.println(area1);
    }
}

//wp  to swap two numbers using third 
class Main{
    
    public static void main(String args[]){
      int a = 5;
      int b = 8;
      int c = a;
       a = b;
       b = c;
       System.out.println(a);
       System.out.println(b);
      a = a+b;
      b = a-b;
      a = a-b;
      
      System.out.println(a);
       System.out.println(b);
    }
}

//operators
class Main{
    
    public static void main(String args[]){
    int a = 2;
    int b = 5;
    int c = 2;
    a = ++a - b--;
    b= --b + c--;
    c = ++a - ++b + --c;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    }
}

//operators
class Main{
    
    public static void main(String args[]){
    int a = -10;
   // int b = 5;
    //int c = 2;
    int b = -5 + ++a;
    a = ++b + b - b + ++b;
    int c = ++a - ++b -10 + 5;
    b = ++a + ++c;
    
    
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.print(d);
    }
}
