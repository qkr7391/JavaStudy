package Study09;

public class switchCase {
    public static void main(String[] args) {
        //switch case
        int ranking = 1;

        //switch case #1
//        switch (ranking) {
//            case 1:
//                System.out.println("** 1st ranking");
//                break;
//            case 2:
//                System.out.println("** 2nd ranking");
//                break;
//            case 3:
//                System.out.println("** 3rd ranking");
//                break;
//            default:
//       }

        //switch case #2
        switch (ranking) {
            case 1:
                System.out.println("** 1st ranking");
                break;
            case 2:
                //case 2&3 execute same thing
            case 3:
                System.out.println("** Congrats!");
                break;
            default:
        }

        int grade = 1;
        int price = 7000;
        //switch case #4
        switch (grade) {
            case 1: //10000
                price += 1000;
            case 2: //9000
                price += 1000;
            case 3: //8000
                price += 1000;
                break;
        }
        System.out.println(grade + " will be " + price);
    }
}
