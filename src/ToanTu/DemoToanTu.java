package ToanTu;

public class DemoToanTu {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        int c = 5;
        ++c;
        System.out.println(c);
        --c;
        System.out.println(c);
        boolean hasTD = true    ;
        String address = "Ho Chi Minh City";
        int age = 19;
        if (hasTD == true && age >= 18 && address.equals("Ho Chi Minh City")){
            System.out.println("You can access this page");
        }
        boolean isManager = true;
        boolean isStaff = false;
        if (isManager == true || isStaff == true){
            System.out.println("You can log in");
        }
        //Phủ đinh (!), Nếu chưa isActive tức isActive = false thì in ra dòng chữ sau
        boolean isActive = false;
        if (! isActive){
            System.out.println("Navigate to management page");
        }
        //        toan tu gan
        int number1, number2;
        number2 =  number1 = 100;
        System.out.println(number2+ ", " +number1);
        System.out.println(number1 + number2);


    }

}
