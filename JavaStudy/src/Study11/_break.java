package Study11;

public class _break {
    public static void main(String[] args) {
        int max = 20;
        //for
        for (int i = 1; i < 50; i++) {
            System.out.println("Number " + i + ", Your menu is ready.");
            if (i == max){
                System.out.println("Today we are sold out for the menu.");
                break;
            }
        }
        System.out.println("We're close today.");

        System.out.println("---------------------");

        //while
        int index = 1;
        while(index <= 50) {
            System.out.println("Number " + index + ", Your menu is ready.");
            if (index == max){
                System.out.println("Today we are sold out for the menu.");
                break;
            }
            index++;
        }
        System.out.println("We're close today.");

        System.out.println("---------------------");
    }
}
