package Study07;

public class escapeSequence {
    public static void main(String[] args) {
        //special character, escape sequence, escape character
        //waste memory
        System.out.println("Java");
        System.out.println("is");
        System.out.println("Fun");

        //same but save memory
        System.out.println("Java\nis\nFun");
        System.out.println("Java\tis\tFun");

        System.out.println("Past\t$8");
        System.out.println("pizza\t$7");
        System.out.println("Coke\t$2");

        System.out.println("C:\\Program Files\\Java");

        System.out.println("I said \"I like you\" to him");

        System.out.println("She though \'what?\' in her mind");
        System.out.println("She though 'what?' in her mind");


        char c = 'A';
        c = '\'';
        System.out.println(c); //print ' only
    }
}
