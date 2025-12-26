

public class compare3digits {
    public static void main(String[] args) {
        int a= 10,b=2,c=45;
        int res = (a>=b&&a>=c)? a:((b>=c)?b:c);
        System.out.print(res);
    }
    
}
