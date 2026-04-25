package DataType;

public class DemoDataType {
    public static void main(String[] args) {
//        kieu string
        String str =" WELCOME TO THE LESSON ABOUT DATATYPE";
//        Kieu char:  Luu so nguỵen khong am  + 1 character
        char character = 'a';
        char isDeleted = '1';

//        Kieu so nguyen
        byte number1 = 127;
        short number2 = 32000;
        int number3 =  2147483647;
        long number4 =  3000000000L;

//        Kieu so thuc
        float number5 = 0.5F;
        double number6 = 0.00000012; //Usually use in automation test
        System.out.println(str);
        System.out.println(number1 +" "+ number2 +" "+ number3+" "+ number4+" "+ number5+" "+ number6);

//        Kieu boolean, chi co 2 gia tri True and False
        Boolean CHECK = true;
        String actual = "Login success";
        String expected  = "Login success";
        Boolean checkCondition = actual.equals(expected);
        System.out.println(checkCondition);
        if (checkCondition == true) {
            System.out.println("The result is PASS");
        }



}}
