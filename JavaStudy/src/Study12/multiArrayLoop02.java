package Study12;

public class multiArrayLoop02 {
    public static void main(String[] args) {
        String[][] seats = {
                {"a1", "a2", "a3"},
                {"b1", "b2", "b3", "b4"},
                {"c1", "c2", "c3", "c4", "c5"}
        };
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}
