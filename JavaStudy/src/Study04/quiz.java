package Study04;

public class quiz {
    public static void main(String[] args) {
        // bus num(1234, Sangam08)
        String busNum = "Sangam08";
        // time left ( 3min, 5min)
        int minute = 3;
        // street left (1.5 km, 0.8km)
        double distance = 1.5;

        System.out.println("This bus is " + busNum);
        System.out.println("It will be arrived after " + minute + "minutes");
        System.out.println("Left distance is " + distance + "km");
    }
}
