package Study09;

public class whileStatement {
    public static void main(String[] args) {
        // while
        int distance = 25;
        int move = 0;
        while (move < distance){
            move += 5;
            System.out.println((distance - move) +"m is left.");
        }
    }
}
