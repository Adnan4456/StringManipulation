import java.nio.charset.StandardCharsets;
import java.util.stream.StreamSupport;

public class MyStringClass {

    public static void main(String[] args)
    {
        int alphabet_len = 26;
        char[] alphabet = new char[alphabet_len];
        int[] integers = new int[alphabet_len];
        byte[] bytes = new byte[alphabet_len];
        int i = 0;

        for (char c = 'a'; c <= 'z'; c++, i++) {
            // Create character array containing the english alphabet a-z
            alphabet[i] = c;

            // Create an integer array, casting alphabet character to ints
            integers[i] = (int) c;

            // Create a byte array, casting alphabet character to a byte
            bytes[i] = (byte) c;
        }

        // Create a String from the character array
        String charString = new String(alphabet);
        System.out.println("charString = " + charString);

        // Create a String from the byte array
        String byteString = new String(bytes);
        System.out.println("byteString = " + byteString);

        // Create a String from the integer array
        // Note here:  You cannot create a String with integer array with a
        // simple one args constructor, so we'll use offset = 0 and
        // length = the length of array, to get the full alphabet
        String intString = new String(integers, 0, alphabet_len);
        System.out.println("intString = " + intString);

        //create  a  String from the character array
        int offSet = 0;
        String charString2 = new String(alphabet , offSet , alphabet_len);
        System.out.println("charString2 = " + charString2);

        //only want f-j now.
        offSet = 5;
        int length = 5;
        String intString2 = new String(integers, offSet, length);
        System.out.println("intString 2 = "+ intString2);


        offSet= 2;
        length = 9 ;
        //Create a string from the byte array , c-k
        String byteString2 = new String(bytes,offSet , length , StandardCharsets.ISO_8859_1);
        System.out.println("byteString 2 = "+ byteString2);

    }
}
