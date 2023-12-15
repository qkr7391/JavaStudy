package Study13;

public class mainMethod {
    public static void main(String[] args) {

        //1. edit configurations
        //2. Add new
        //3. name set
        //4. in the build and run, red box -> select java file
        //5. under that box, write parameters (ex)It's Test Parameters
        //6. for each / print

        for (String s: args) {
            System.out.println(s);

            System.out.println("------------");

            if (args.length == 1 ){
                switch (args[0]){
                    case "1":
                        System.out.println("Search menu");
                        break;
                    case "2":
                        System.out.println("Borrowing  menu");
                        break;
                    case "3":
                        System.out.println("Return menu");
                        break;
                    default:
                        System.out.println("wrong input");
                }
            }
            else {
                System.out.println("how to: Enter among 1~3");
            }
        }
    }
}
