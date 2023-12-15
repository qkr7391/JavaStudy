package Study13;

public class returnValue {
    public static String getPhoneNum(){
        String phoneNum = "000-111-2222";
        return phoneNum;
    }

    public static String getAddress(){
        return "Somewhere";
    }

    public static String getActivities(){
        return "bowling, karaoke, pool";
    }
    public static void main(String[] args) {
        String contactNum = getPhoneNum();
        System.out.println("Number is " + contactNum);

        String address = getAddress();
        System.out.println("Address is " + address);

        String activities = getActivities();
        System.out.println("Activities are " + activities);
    }
}
