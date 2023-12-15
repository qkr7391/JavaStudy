package Study13;

public class overloading {
    //method overloading is possible when:
    //1. parameter types are different
    //2. number of parameters are different
    public static int getPower(int num){
        return (num * num);
    }

    public static int getPower(String strNum){
        int num = Integer.parseInt(strNum);
        return (num * num);
    }
    public static void main(String[] args) {
        System.out.println(getPower(2));
        System.out.println(getPower("4"));
    }
}
