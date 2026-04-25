package PhuongThuc;

public class KhoiStatic {

    static String browser = "";
    static String getBrowser(){
        return browser;
    }

    static {
        System.out.println("browser initialized");
        browser = System.getProperty("browser");
        getBrowser();


        //public class A2 {
//    static {
//        System.out.println("Khối static: hello !");
//    }
//    public static void main(String args[]) {
//        System.out.println("Main: hello !");
//    }
//}
// Khối static chạy trước hàm main để tiền xử lý/ set up dữ liệu sau đó mới chạy

    }

    public static void main(String[] args) {
        System.out.println("Run testcase");
    }
}
