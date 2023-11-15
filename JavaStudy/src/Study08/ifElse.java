package Study08;

public class ifElse {
    public static void main(String[] args) {
        //If Else
        int hour = 10;
        if (hour < 14){
            System.out.println("Iced Americano +1");
        }
        else{
            System.out.println("Iced decaf coffee +1");
        }
        System.out.println("Order has been placed #1");

        hour = 15;
        boolean morningCoffee = true;
        if (hour >= 14 || morningCoffee){
            System.out.println("Iced decaf coffee +1");
        }
        else{
            System.out.println("Iced Americano +1");
        }
        System.out.println("Order has been placed #2");
    }
}
