public class equalsComparsion {

    public static void main(String[] args)
    {
        String first = "Adnan";
        String second = "Adnan";

        String f = "khan";
        String g = "khan";


        if (first == second)
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        if (f.equals(g))
        {
            System.out.println("True equals method");
        }
        else {
            System.out.println("false equals method");
        }

    }

}
