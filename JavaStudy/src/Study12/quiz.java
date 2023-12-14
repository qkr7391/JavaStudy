package Study12;

public class quiz {
    public static void main(String[] args) {
        int[] size = new int[10];
        for (int i = 0; i < size.length; i++) {
            size[i] = 250 + (5*i);
        }
        for (int sizes: size
             ) {
            System.out.println("size " + sizes + " is available.");
        }
    }
}
