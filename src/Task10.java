import java.util.ArrayList;

public class Task10 {

    public static void main(String[] args){
        commonChars("house", "Computers");
    }

    public static void commonChars(String word1, String  word2){
       String commonChars = "";

        char[] word1Array = word1.toLowerCase().toCharArray();
        char[] word2Array = word2.toLowerCase().toCharArray();

        for(int i = 0; i < word2Array.length; i++){
            for(int j = 0; j < word1Array.length; j++){
                if(word2Array[i] == word1Array[j]){
                    commonChars += word2Array[i];
                   commonChars += i == word2Array.length - 1? "":", ";
                }
            }
        }
        System.out.print("Common letters: "+commonChars );
    }
}
