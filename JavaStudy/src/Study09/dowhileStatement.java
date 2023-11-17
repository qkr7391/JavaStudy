package Study09;

public class dowhileStatement {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;
        int height = 2;

        do {
            System.out.println("Keep going");
            System.out.println((distance-move-height)+"m is left.");
            move += 5;
        } while (move + height < distance);
    }
}
