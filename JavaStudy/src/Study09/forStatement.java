package Study09;

public class forStatement {
    public static void main(String[] args) {
        //for statement
        for (int i = 0 ; i < 10; i++){
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0 && i != 0){
                System.out.println(i);
            }
        }

        int sum = 0;
        for (int i = 1 ; i < 11; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
