package Study10;

public class nestedloop {
    public static void main(String[] args) {
        //making * - 5x5 squ
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

            System.out.println();

        //2
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
            System.out.println();


        //3
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
       }
            System.out.println();

    }
}
