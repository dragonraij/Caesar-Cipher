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
    
    public String replaceVowels(String phrase, char ch){
        StringBuilder text = new StringBuilder(phrase);
        
        for(int i = 0; i < text.length(); i ++){
            //For each letter check if it is a vowel
            if(isVowel(text.charAt(i))){
            //If its a vowel replace it with ch
            text.setCharAt(i, ch);
        }
            //Otherwise does not need to change
        }
        
        //return the resulting string
        return text.toString();
    }
    
    void testReplaceVowels(){
    String input = "This is the day";
    char replacewith = '*';
    System.out.println("Input is "+ input);
    System.out.println("Output is "+ (replaceVowels(input, replacewith)));
    }
}
