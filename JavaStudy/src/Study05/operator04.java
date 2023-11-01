package Study05;

public class operator04 {
    public static void main(String[] args) {
        boolean candy = true;
        boolean chocolate = true;
        boolean cocoa = false;

        System.out.println(candy || chocolate || cocoa); //true
        System.out.println(candy && chocolate && cocoa); //false

        System.out.println((5>3) && (3>1)); //true
        System.out.println((5>3) && (3<1)); //false

        System.out.println((5>3) || (3>1)); //true
        System.out.println((5>3) || (3<1)); //true
        System.out.println((5<3) || (3<1)); //false


        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); //false
        System.out.println(!(5 == 3)); //true

    }
}
