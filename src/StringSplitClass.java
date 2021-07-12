import java.util.Arrays;

public class StringSplitClass {

    public static void main(String[] args)
    {
        String s = "Welcom to java";
        String[] s1 = s.split(" ");
        System.out.println(Arrays.toString(s1));

        //Now limit the number of split
        s1 = s.split(" ",2);
        System.out.println(Arrays.toString(s1));

    }
}
