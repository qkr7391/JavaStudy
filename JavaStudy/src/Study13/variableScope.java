package Study13;

public class variableScope {
    public static void methodA(){
//        System.out.println(num); //error -> scope problem
    }
    public static void methodB(){
       int result = 1;
    }
    public static void main(String[] args) {
        int num = 3;
        methodA();
//        System.out.println(result); //error -> scope problem

    }
}
