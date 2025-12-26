package day2assigmnets;

public class CharacterCheck {
    public static void main(String[] args) {
        char ch = 'A';

        String result =
            (ch >= 'A' && ch <= 'Z')?((ch == 'A'||ch =='E'||ch == 'I'||ch =='O'||ch=='U')?
            "UPPERCASE VOWEL":"UPPERCASE CONSONANT")
            :
             (ch >= 'a' && ch <= 'z') ? ((ch == 'a'||ch =='e'||ch == 'i'||ch =='o'||ch=='u')? 
             "LOWERCASE VOWEL":"LOWEERCASE CONSONANT")
              :
            (ch >= '0' && ch <= '9') ? "Digit" :
            "Special Character";

        System.out.println(result);
    }
}


