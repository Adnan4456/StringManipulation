import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public static void main(String[] args)
    {

        // . means first can any character and second should be m.
        Pattern p = Pattern.compile(".m");
        Matcher matcher = p.matcher("am");

        boolean b = matcher.matches();

        System.out.println("Result = " + b);

        //second  way. first argument is your pattern and second is String
        boolean c = Pattern.matches(".m" , "am");
        System.out.println("Result = " + c);

        //among a , m or n
        System.out.println(Pattern.matches("[amn]","amd"));

        //it should accept any letter except  amn.
        System.out.println(Pattern.matches("[^amn]","c"));

     //It should accept any character that falls between small a to z and capital A to S.
        System.out.println(Pattern.matches("[a-zA-S]","B"));

      //String should start  with capital M or S , then small letters come then length of string is 5 .
        // total String lenght is 6.
        System.out.println(Pattern.matches("[MS][a-z]{5}","Manaat"));

        //any small letter from a to d and s to u is valid.
        System.out.println(Pattern.matches("[a-ds-u]","b"));
        //
        System.out.println(Pattern.matches("[xyz]?","x"));


    }

}
