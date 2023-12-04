package Study12;

public class array01 {
    public static void main(String[] args) {
        String coffeeRoss = "Americano";
        String coffeeRachel = "Cafemocha";
        String coffeeChandler = "Cafelatte";
        String coffeeMonica = "Cappuccino";

        System.out.println(coffeeRoss + " one");
        System.out.println(coffeeRachel + " one");
        System.out.println(coffeeChandler + " one");
        System.out.println(coffeeMonica + " one");
        System.out.println("Please.");

        System.out.println("----------------------");

        String[] coffeeOrders = new String[4];
        String coffeeOrders2[] = new String[4];

        //1
        coffeeOrders[0] = "Americano";
        coffeeOrders[1] = "Cafemocha";
        coffeeOrders[2] = "Cafelatte";
        coffeeOrders[3] = "Cappuccino";

        //2
        String[] coffeeOrders3 = new String[] {"Americano", "Cafemocha", "Cafelatte", "Cappuccino"};

        //3
        String[] coffeeOrders4 = {"Americano", "Cafemocha", "Cafelatte", "Cappuccino"};

        System.out.println("----------------------");

        System.out.println(coffeeOrders[0] + " One");
        System.out.println(coffeeOrders[1] + " One");
        coffeeOrders[2] = "Espresso"; //change value
        System.out.println(coffeeOrders[2] + " One");
        System.out.println(coffeeOrders[3] + " One");

//other typse
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;

        double[] d = new double[] {0.1, 0.2, 0.3};

        boolean[] b = {true, true, false};



    }
}
