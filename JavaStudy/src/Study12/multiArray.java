package Study12;

public class multiArray {
    public static void main(String[] args) {
        //Multidimensional arrays
        String[] seatA = {"A1", "A2", "A3"};
        String[] seatB = {"B1", "B2", "B3"};
        String[] seatC = {"C1", "C2", "C3"};

        // 3*3 array
        String[][] seats = new String[][] {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3"},
                {"C1", "C2", "C3"}
        };

        // B2
        System.out.println(seats[1][1]);
    }
}
