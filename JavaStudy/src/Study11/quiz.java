package Study11;

public class quiz {
    public static void main(String[] args) {
        int DailyMax = 30000;
        int parkingFee = 4000;
        int hour = 10;

        boolean isSmallCar = false;
        boolean withDisabled = true;

        int totalFee = hour * parkingFee;

        if (totalFee > DailyMax){
            totalFee = DailyMax;
        }

        if(isSmallCar || withDisabled){
            totalFee /= 2;
        }

        System.out.println("Total parking fee is " + totalFee);

        for (int i = 0; i < 5; i++) {

        }
    }
}
