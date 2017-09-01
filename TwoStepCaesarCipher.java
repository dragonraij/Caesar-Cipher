package CaesarCipher;
import edu.duke.*;

public class TwoStepCaesarCipher {
    public String encrypt(String input, int key1) {
        //Make a StringBuilder with message (encrypted)
        StringBuilder encrypted = new StringBuilder(input);

        //Write down the alphabet
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = uppercase.toLowerCase();
        //Compute the shifted alphabet
        String shiftedUppercase = uppercase.substring(key1)+
        uppercase.substring(0,key1);
        String shiftedLowercase = shiftedUppercase.toLowerCase();

        //Count from 0 to < length of encrypted, (call it i)
        for(int i = 0; i < encrypted.length(); i++) {
            //Look at the ith character of encrypted (call it currChar)
            char currChar = encrypted.charAt(i);
            System.out.print("Current char is "+ currChar);
            if(currChar == Character.toUpperCase(currChar)){
                //Find the index of currChar in the alphabet (call it idx)
                System.out.println(" it is uppercase ");
                int idx = uppercase.indexOf(currChar);
                //If currChar is in the alphabet
                if(idx != -1){
                    //Get the idxth character of shiftedUppercase (newChar)
                    char newChar = shiftedUppercase.charAt(idx);
                    //Replace the ith character of encrypted with newChar
                    encrypted.setCharAt(i, newChar);
                }
                //Otherwise: do nothing
                
            }else{
                //It is a lowercase character or non character
                //Find the index of currChar in the alphabet (call it idx)
                System.out.println(" it is lowercase ");
                int idx = lowercase.indexOf(currChar);
                //If currChar is in the alphabet
                if(idx != -1){
                    //Get the idxth character of shiftedUppercase (newChar)
                    char newChar = shiftedLowercase.charAt(idx);
                    //Replace the ith character of encrypted with newChar
                    encrypted.setCharAt(i, newChar);
                }
                //Otherwise: do nothing
                
                
            }
        }
        //Your answer is the String inside of encrypted
        return encrypted.toString();
    }
    public void TestTwoStepCaesar() {
        int key = 1;
        FileResource fr = new FileResource();
        String message = fr.asString();
        String encrypted = encrypt(message, key);
        System.out.println(encrypted);
        //String decrypted = encrypt(encrypted, 26-key);
        //System.out.println(decrypted);
    }
}

