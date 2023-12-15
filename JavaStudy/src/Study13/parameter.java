package Study13;

public class parameter {
    public static void power(int num){
        int result = num * num;
        System.out.println("Result is " + result);
    }

    public static void powerByExp(int num, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;
        }
        System.out.println(result + " is " + num +"'s " + exponent);
    }
    public static void main(String[] args) {
        //parameter
        power(2);
        power(3);
        power(4);

        powerByExp(2, 3);
        powerByExp(3, 3);

    }
}
