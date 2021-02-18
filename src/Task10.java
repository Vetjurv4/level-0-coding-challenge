import java.util.ArrayList;

public class Task10 {

    public void commonChars(String word1, String  word2){
        ArrayList<Character> commonChars = new ArrayList<>();

        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        for(int i = 0; i < word2Array.length; i++){
            for(int j = 0; j < word1Array.length; j++){
                if(word2Array[i] == word1Array[j]){
                    commonChars.add(word2Array[i]);
                }
            }
        }
        System.out.println(commonChars);
    }
}
