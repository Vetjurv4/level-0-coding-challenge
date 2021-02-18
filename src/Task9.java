public class Task9 {

    public static String isVowel(String word){
        String vowels = "";
        for(int i = 0; i < word.length(); i++){
            //check compare each charecter if it is a vowel
            if(word.charAt(i) == 'a' || word.charAt(i) == 'A' || word.charAt(i) == 'e' || word.charAt(i) == 'E' ||
                    word.charAt(i) == 'i' || word.charAt(i) == 'I' || word.charAt(i) == 'o' || word.charAt(i) == 'O' ||
                    word.charAt(i) == 'u' ||word.charAt(i) == 'U'){

                vowels += word.charAt(i);
            }
        }
        return vowels;
    }
}
