package Study02;

public class variables {
    public static void main(String[] args) {
        //p1
        String name = "Amy";
        System.out.println(name + ", Delivery is on the way");
        System.out.println(name + ", Delivery is arrived");

        //p2
        double score = 90.5;
        char grade = 'A';
        name = "Lily";
        System.out.println(name + "'s average score is " + score);
        System.out.println(name + "'s grade is " + grade);

        boolean pass = true;
        System.out.println(name + "is pass(" + pass + ") final test");

        //p3
        double d = 3.141592123456789;
        float f = 3.141592123456789F;
        System.out.println(d);
        System.out.println(f);

//        int a = 1000000000000; //-error
        long la = 1000000000000L;
        la = 1_000_000_000_000L;

//        System.out.println(a);
        System.out.println(la);


        //p4
        int size = 240;
        size = size + 10;
        System.out.println("Shoes size is " + size);


        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }
}
