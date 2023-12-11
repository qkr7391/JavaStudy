package Study12;

public class arrayLoop {
    public static void main(String[] args) {
        String[] coffeeOrders4 = {"Americano", "Cafemocha", "Cafelatte", "Cappuccino"};

        for (int i = 0; i < 4; i++) {
            System.out.println(coffeeOrders4[i] + " one");
        }
        System.out.println("please");

        System.out.println("----------------");
        //finding array length
        String[] coffeeOrders5 = {"Americano", "Cafemocha", "Cafelatte", "Cappuccino"};

        for (int i = 0; i < coffeeOrders5.length; i++) {
            System.out.println(coffeeOrders5[i] + " one");
        }
        System.out.println("please");
        System.out.println("----------------");

        //enhanced for (for-each)
        for (String coffee: coffeeOrders5) {
            System.out.println(coffee + " One");
        }
        System.out.println("please");
        System.out.println("----------------");
    }
}
