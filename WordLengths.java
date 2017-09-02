package CaesarCipher;

import edu.duke.*;


/**
 * Write a description of WordLengths here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordLengths {

        void testWordLengths(){
            FileResource fr = new FileResource();
            int[] counts = new int[20];
            
            countWordLengths(fr, counts);
        }
    
         private void countWordLengths (FileResource resource, int[] counts){
        
            for(String word : resource.words()){
                
                //remove non characters at begining or end of word
                word = chompWord(word);
                //if word lenght is less than counts array
                if(word.length()< counts.length-1 ){
                    //increment count at counts index word length
                    counts[word.length()]+= 1;
                }
                else{
                    //word is longer than array length.
                    //increment last element of array
                    counts[counts.length-1]+=1;
                    
                }
            }
            
            for(int i =1; i < counts.length; i++){
                System.out.println(counts[i] + " words of length " + i);
            }
            
        }
        
        public void testChomp(){
            System.out.println(chompWord("WorD"));
            System.out.println(chompWord("word"));
            System.out.println(chompWord("!Word"));
            System.out.println(chompWord("Word%"));
            System.out.println(chompWord("%^Word^*"));
            System.out.println(chompWord("$Wo&rd$"));
        }
        
        //removes nonletter character from begining and end of string
        private String chompWord(String word){
            
            if(!Character.isLetter(word.charAt(0))){
                 word = word.substring(1);
            }

            if(!Character.isLetter(word.charAt(word.length()-1))){
                 word = word.substring(0,word.length()-1);
            }
            
            return word;
        }
}
