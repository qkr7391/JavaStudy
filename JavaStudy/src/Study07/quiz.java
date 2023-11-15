package Study07;

public class quiz {
    public static void main(String[] args) {
       String id = "921226-2011611";
        System.out.println(id.substring(0, 8)); //index 0 to 8(include)

        System.out.println(id.substring(0, id.indexOf("-")+2));
//        System.out.println(id.substring(0, id.indexOf("-"))); >> 0 to before -

    }
}
