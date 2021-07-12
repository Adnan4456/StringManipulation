import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class StringJoinerClass {

    public static void main(String[] args)
    {
        String s  = "Adnan ";
        String s1 = "Khan";

        String[] wordArray = new String[]{"Hello" , "World" , "How", "are","you"};
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(wordArray));

        //can not provide null vale to delimiter.
        String joner = String.join(" ",s , s1);
        System.out.println(joner);

        //public String concate (String str)
        String sentence= "";

        //for each loop to concate the array or string in a single string
        for (String word: wordArray){
            sentence += word + " ";
        }
        System.out.println("Our sentence using concate : " + sentence);

        //concatenate string with out for loop
        sentence = String.join(" ","Hello","World","how","are","you.");
        System.out.println("Our sentence using Join : " + sentence);

        //We can use join method with iterable elements , such as array of string
        sentence = String.join(" ",wordArray);
        System.out.println("Our sentence using Join with array of String : " + sentence);

        //String joiner class was added in java 8.
        StringJoiner sj = new StringJoiner(" ");
        for (String word: wordArray) sj.add(word);
        sentence = sj.toString();
        System.out.println("Our sentence using String Joiner : " + sentence);
    }
}
