package PhuongThuc;

public class HamCoThamSo {
    public int sumNumber (int number1, int number2){
        return number1 + number2;

    }

    public void LoginTest (String username, String password){
        System.out.println("Navigate to url:");
        System.out.println("Enter username: "+ username);
        System.out.println("Enter password: "+ password);
        System.out.println("Click Login button and verify login success");
    }


    public static void main(String[] args) {
        HamCoThamSo object1 = new HamCoThamSo();
        System.out.println(object1.sumNumber(20,7));
        object1.LoginTest("tester04x","***lINA123");

    }

}
