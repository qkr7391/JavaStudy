package Study12;

public class multiArrayLoop {
    public static void main(String[] args) {
        String[][] seats = new String[][] {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3"},
                {"C1", "C2", "C3"}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}
