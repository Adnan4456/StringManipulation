public class StringManipulation {

    public static void main(String[] args)
    {
        String s1 = "adnana";

        //this is case senestive method.  it will return false with capital A
        Boolean s = s1.endsWith("A");
        System.out.println("Ends with method = " + s);

        //Now it will returns true.
        s = s1.endsWith("a");
        System.out.println("Ends with method = " + s);

        //startswith method
        s= s1.startsWith("d");
        System.out.println("Start with method = " + s);

        //contains method.it is also case  senestive method
        s = s1.contains("ana");
        System.out.println("Contains method = " + s);

        //This will return false because capital AN
        s = s1.contains("AN");
        System.out.println("Contains method = " + s);

        //CharAt method will get integer as argument and return
        //char at the specific index number
        char get  = s1.charAt(5);
        System.out.println("CharAt method = " + get);

        //Indexof method takes char and string as argument and return its index number in string.
        int v = s1.indexOf("na");
        System.out.println("IndexOf method = " + v);
    }
}
