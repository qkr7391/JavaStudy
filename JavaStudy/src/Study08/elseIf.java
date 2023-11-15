package Study08;

public class elseIf {
    public static void main(String[] args) {
        boolean lemonAde = false;
        boolean mangoJuice = true;
        boolean berrySmoothie = true;

        if (lemonAde){
            System.out.println("Lemonade has been placed +1");
        }
        else if (mangoJuice) {
            System.out.println("Mango Juice has been placed +1");
        }
        else if(berrySmoothie){
            System.out.println("Berry Smoothie has been placed +1");
        }
        else {
            System.out.println("Iced Americano has been placed +1");
        }

        System.out.println("Order has been placed #1");
    }
}
