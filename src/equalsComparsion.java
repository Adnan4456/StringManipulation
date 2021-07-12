public class equalsComparsion {

    public static void main(String[] args)
    {
        // String litter
        String first = "Adnan";
        String second = "Adnan";

        //String  with new keyword
        String hello = new String ("Hello");
        String Hello = new String ("Hello");

        String f = "khan";
        String g = "Khan";

        // == keyword compare the reference of object
        //Because the string first and second refer same object in String constant pool
        if (first == second)
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        //These two string refer different object in memory
        if (hello == Hello)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }


        //Equals method compare the content of object.This method consider lower and Upper case differently.
        if (f.equals(g))
        {
            System.out.println("True equals method");
        }
        else {
            System.out.println("false equals method");
        }


        //EqualsIgnore method works like equal method.But it consider Lower and Upper case same.
        if (f.equalsIgnoreCase(g))
        {
            System.out.println("Equals Ignore Case is True");
        }
        else {
            System.out.println("Equals Ignore Case is False");
        }

        //CompareTo method.compare to strings lexicographically
       //This method consider lower and Upper case differently.
        //it returns int value

        int hold = hello.compareTo(Hello);
        if (hold>0)
        {
            System.out.println("First value is greater then second  " + hold);
        }
        else if (hold<0)
        {
            System.out.println("First value is smaller then second  " + hold);
        }
        else if (hold ==0)
        {
            System.out.println("First value is equal to second  =  " + hold);
        }
    }
}
