package Study06;

public class string02 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        System.out.println(s.replace(" and", ",")); //I like Java, Python, C.
        System.out.println(s); //original is not changed

        //System.out.println(s.substring(7)); //Java and Python and C.
        System.out.println(s.substring(s.indexOf("Java"))); // Java and Python and C.
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); //Java and Python and C


        s = "       I love JAVA.     ";
        System.out.println(s);
        System.out.println(s.trim()); //eliminate space

        String s1 = "Java";
        String s2 = "JavaScript";
        System.out.println(s1 + s2); //JavaJavaScript
        System.out.println(s1 + ", " + s2);
        System.out.println(s1.concat(", ").concat(s2)); //Java, JavaScript

    }
}
