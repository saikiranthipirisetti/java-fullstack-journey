//WAP TO CHECK WHEATHER THE GIVEN ALPHABET OR NOT
public class Alphacheck {

    public static void main(String[] args) {
        char c = 'a';
        String s = (((c>='a' && c<='z')||(c>='A' && c<='Z'))? "yes it is alphabet":"it is not ");
        System.out.print(s);
    }
}
