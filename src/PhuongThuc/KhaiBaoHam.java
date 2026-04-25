package PhuongThuc;

public class KhaiBaoHam {
    //Khai bao ham khong tra ve gia tri
    //  <modifier> void methodName(Danh sách các tham số) { code}

    public void showInfor (){
        String name = "My Linh";
        int age = 23;
        System.out.println(name);
        System.out.println(age);
    }
    public void displayVersion (){
        String name = "Version 2.10";
        String content = "Enhance UI and integrate AI Agent in CS site ";
        System.out.println(name +" "+ content);

    }


    public static void main(String[] args) {
        KhaiBaoHam object = new KhaiBaoHam();
        object.showInfor();
        object.displayVersion();

        }
}
