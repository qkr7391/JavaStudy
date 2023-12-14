package Study13;

public class method {

    public static void sayHello(){
        //method define
        System.out.println("Hello from Method");
    }
    public static void main(String[] args) {
        //Method = A bundle of code that does something = function
        System.out.println("before call method");

        sayHello(); //call method

        System.out.println("after call method");
    }
}
