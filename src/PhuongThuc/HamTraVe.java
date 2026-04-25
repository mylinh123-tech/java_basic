package PhuongThuc;

import java.sql.SQLOutput;

public class HamTraVe {
//    <modifier> returnType methodName(Danh sách các tham số) {
//        // code
//
//        return <giá trị gì đó> //giống kiểu returnType
//    }


    //Khai bao ham co tra ve gia tri

    public String getInfor (){
        String name = "My Linh is studying Automation Testing";
        return name;
    }

    public int getCategoriesTotal () {
        int categoryTotal = 100;
        return categoryTotal;
    }

    public Object Test (){
        String introduce = "Hi, my name is mylinh. I'm study to become a QC.";
        return introduce ;

    }




    public static void main(String[] args) {

        // Co the su dung lai ham tu 1 class khac
        KhaiBaoHam object1 = new KhaiBaoHam();
        object1.displayVersion();
        object1.showInfor();

        HamTraVe object2 = new HamTraVe();
        String name = object2.getInfor();
        System.out.println(name);

        Object introduce  = object2.Test();
        System.out.println(introduce);












    }
}
