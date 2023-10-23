package Study04;

public class typecasting {
    public static void main(String[] args) {
        //type casting
        // int -> double
        // double -> int ...

        int score = 93;
        System.out.println(score); //93
        System.out.println((float)score); //93.0
        System.out.println((double)score); //93.0

        float scoreF = 93.3F;
        double scoreD = 98.8;
        System.out.println((int)scoreF); //93
        System.out.println((int)scoreD); //98

        score = 93 + (int) 98.8;
        System.out.println(score); //191

        scoreD = (double)93 + 98.8;
        System.out.println(scoreD);//191.8

        double convertedScoreD = score;
        System.out.println(convertedScoreD); //191.0

        int convertedScoreI = (int)scoreD;
        System.out.println(convertedScoreI); //191


        String s1 = String.valueOf(93);
        System.out.println(s1); // 93
        s1 = Integer.toString(93);
        System.out.println(s1); // 93

        String s2 = String.valueOf(98.9);
        System.out.println(s2);//98.9
        s2 = Double.toString(98.8);
        System.out.println(s2);//98.8

        int i = Integer.parseInt("93");
        System.out.println(i); // 93
        double d = Double.parseDouble("98.8");
        System.out.println(d);//98.8

//        int error = Integer.parseInt("java");

    }}
