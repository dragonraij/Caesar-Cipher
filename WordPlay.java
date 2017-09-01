package CaesarCipher;


/**
 * Write a description of WordPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordPlay {
    boolean isVowel(char ch){
        switch (Character.toLowerCase(ch))
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            return true;
            default:
                return false;
            
        }
    }
    
    void testIsVowel(char input){
    System.out.println("Is "+ input+" a vowel?");
    System.out.println(isVowel(input));
    
    }
}
