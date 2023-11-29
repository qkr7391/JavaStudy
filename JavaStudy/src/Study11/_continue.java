package Study11;

public class _continue {
    public static void main(String[] args) {
        //for
        int max = 20;
        int soldMenu = 0;
        int noShow = 17;

        for (int i = 1; i < 50; i++) {
            System.out.println("Number " + i + ", Your menu is ready.");
            //noShow occur
            if(i == noShow){
                System.out.println("Number " + i + ", NOSHOW, PASS");
                continue; //do not process under and go up
            }

            soldMenu++;
            if (soldMenu == max){
                System.out.println("Today we are sold out for the menu.");
                break;
            }
        }
        System.out.println("We're close today.");

        System.out.println("---------------------");
        soldMenu = 0;

        //while
        int index = 1;
        while(index <= 50){
            System.out.println("Number " + index + ", Your menu is ready.");
            if (index == noShow){
                System.out.println("Number " + index + ", NOSHOW, PASS");
                index++;
                continue;
            }
            soldMenu++;
            if (soldMenu == max){
                System.out.println("Today we are sold out for the menu.");
                break;
            }
            index++;
        }
        System.out.println("We're close today.");

        //while #2
//        int index = 0;
//        while(true){
//            index++;
//            System.out.println("Number " + index + ", Your menu is ready.");
//            if (index == noShow){
//                System.out.println("Number " + index + ", NOSHOW, PASS");
//                continue;
//            }
//            soldMenu++;
//            if (soldMenu == max) {
//                System.out.println("Today we are sold out for the menu.");
//                break;
//            }
//        }
//        System.out.println("We're close today.");
    }
}
