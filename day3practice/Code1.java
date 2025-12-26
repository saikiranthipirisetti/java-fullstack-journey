package day3practice;
public class Code1 {
    public static void main(String[] args) {
        String username = "saikiran";
        String password="123sai";
        boolean isActive=true;

        boolean res1 = username != null && password != null && isActive;

        String result =  res1? "id is valid" : " id is invalid";
    }
    
}
