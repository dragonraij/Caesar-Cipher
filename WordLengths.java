package CaesarCipher;

import edu.duke.*;


/**
 * Write a description of WordLengths here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordLengths {

        void testWordLenghts(){
            FileResource fr = new FileResource();
            int[] counts = new int[20];
            
            countWordLengths(fr, counts);
        }
    
        void countWordLengths (FileResource resource, int[] counts){
        
            for(String word : resource.words()){
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
}
