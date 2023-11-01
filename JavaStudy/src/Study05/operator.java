package Study05;

public class operator {
    public static void main(String[] args) {
        //Arithmetic operators
        System.out.println(4+2); //6
        System.out.println(4-2); //2
        System.out.println(4*2); //8
        System.out.println(4/2); //2

        System.out.println(5/2); //2
        System.out.println(5%2); //1

        System.out.println(2+2*2);//6
        System.out.println(2+(2*2));//6
        System.out.println((2+2)*2);//8


        int a = 20;
        int b = 10;
        int c;
        c = a + b;
        System.out.println(c); //30

        c = a - b;
        System.out.println(c);//10

        c = a * b;
        System.out.println(c);//200

        c = a / b;
        System.out.println(c);//2

        c = a % b;
        System.out.println(c);//0

        int val;
        val = 10;
        System.out.println(val); //10

        val = val + 1;
        System.out.println(val); //11

        System.out.println(++val); //12
        System.out.println(val++); //12
        System.out.println(val); //13

        val = 10;

        System.out.println(--val); //9
        System.out.println(val--); //9
        System.out.println(val); //8

        //Waiting Number
        int waiting = 0;
        System.out.println("Waiting : " + waiting++);// Waiting : 0
        System.out.println("Waiting : " + waiting++);// Waiting : 1
        System.out.println("Waiting : " + waiting++);// Waiting : 2
        System.out.println("Total Waiting : " + waiting); // 3


    }
}
