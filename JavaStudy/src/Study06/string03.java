package Study06;

import com.sun.security.jgss.GSSUtil;

public class string03 {
    public static void main(String[] args) {
        //compare string

        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equals("Java")); //true

        System.out.println(s2.equals("python")); //false --> upper and lower diff
        System.out.println(s2.equalsIgnoreCase("python")); //true --> ignore case


        s1 = "1234";
        s2 = "1234"; //->s2 reference s1

        System.out.println(s1.equals(s2)); //true --> reference contents
        System.out.println(s1 == s2); //true --> reference position

        s1 = new String("1234");
        s2 = new String("1234"); // -> s2 independently saved data
        System.out.println(s1.equals(s2)); //true --> same value
        System.out.println(s1 == s2); //false --> different position

    }
}
