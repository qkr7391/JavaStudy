package Study08;

public class if_statement {
    public static void main(String[] args) {
        //if statement
        int openTime = 11;
        int arriveTime1 = 10;
        int arriveTime2 = 15;

        if (arriveTime1 < openTime)
            System.out.println("Store is not open");
        System.out.println("Welcome");

        if (arriveTime2 > openTime){
            System.out.println("Order has been placed");
            System.out.println("Would you like to order more?");
        }
        System.out.println("Welcome");

        boolean ordered = false;
        //if (arriveTime2 > openTime && !ordered){
        if (arriveTime2 > openTime && ordered == false){
            System.out.println("Order has been packed");
            System.out.println("Ready to pick up");
        }
        System.out.println("Welcome");

        ordered = true;
       // if (arriveTime2 > openTime || ordered){
        if (arriveTime2 > openTime || ordered == true){
            System.out.println("Will you change order?");
        }
        System.out.println("Welcome");
    }
}
