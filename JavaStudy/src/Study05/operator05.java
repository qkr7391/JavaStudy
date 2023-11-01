package Study05;

public class operator05 {
    public static void main(String[] args) {
        //result = (condition) ? true : false
        int x = 5;
        int y = 3;

        int max = (x > y) ? x : y;
        System.out.println(max); //5

        int min = (x < y) ? x : y;
        System.out.println(min); //3

        boolean b = (x == y) ? true : false;
        System.out.println(b); //false

        String s = (x != y) ? "Different" : "Equals";
        System.out.println(s); //Different
    }
}
