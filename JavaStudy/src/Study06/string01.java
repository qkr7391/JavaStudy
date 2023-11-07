package Study06;

public class string01 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        //len of string
        System.out.println(s.length()); //29


        //upper case to lower case
        System.out.println(s.toUpperCase()); // all upper case
        System.out.println(s.toLowerCase()); // all lower case

        System.out.println(s.contains("Java")); //true
        System.out.println(s.contains("JavaScript")); // false

        System.out.println(s.indexOf("Java")); //7 --> index of J
        System.out.println(s.indexOf("JavaScript")); //-1 --> not included
        System.out.println(s.indexOf("and")); //12 -->first
        System.out.println(s.lastIndexOf("and")); //and -->last

        System.out.println(s.startsWith("I like")); //true
        System.out.println(s.endsWith("Thank you")); //false




    }
}
