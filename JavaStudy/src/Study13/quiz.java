package Study13;

public class quiz {
    public static String getHiddenData(String data, int pos) {
        String hiddenData = data.substring(0, pos);
        for (int i = 0; i < data.length() - pos; i++) {
            hiddenData += "*";
        }

        return hiddenData;
    }
    public static void main(String[] args) {
        String name = "Helen";
        String sin = "512-435-2455";
        String phone = "000-111-2222";

        System.out.println("Name : " + getHiddenData(name, 3));
        System.out.println("Sin : " + getHiddenData(sin, 3));
        System.out.println("Phone : " + getHiddenData(phone, 8));
    }
}
