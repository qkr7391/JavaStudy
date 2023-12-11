package Study12;

public class multiArray03 {
    public static void main(String[] args) {
        // 10 * 15
        String[][] seats = new String[10][15];
        String[] eng = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = eng[i] + (j + 1);
            }
        }

        //print for checking
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}
