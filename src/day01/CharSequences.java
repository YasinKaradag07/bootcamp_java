package day01;

public class CharSequences {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        //StringBuilder stringBuilder = "Java"; String literal not allowed, gives compiler error
        StringBuilder stringBuilder = new StringBuilder("Java");

        //StringBuffer stringBuffer = "Java"; String literal not allowed, gives compiler error
        StringBuffer stringBuffer = new StringBuffer("Java");

        System.out.println("---------------------------------------");

        String s1 = "Cydeo";
        s1.concat(" School");

        System.out.println(s1); // immutable so we get only Cydeo

        StringBuilder s2 = new StringBuilder("Cydeo"); // mutable
        s2.append(" School");

        System.out.println(s2);  // since builder is mutable, we can get cydeo school

        StringBuffer s3 = new StringBuffer("Cydeo");
        s3.append(" School");

        System.out.println(s3);






    }
}
