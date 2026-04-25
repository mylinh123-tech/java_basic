package DataCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDomo {

    public static void main(String[] args) {
        // Cho phep luu tru trung gia tri
        // Du lieu co thu tu vi tri
        // Array khac voi Arrray List, Array phai khai bao kich co, nho thu tu. Arraylist khong can khai bao kich co, khong can nho vi tri
        // Arraylist ho tro xu ly du lieu : them - sua - xoa...

        //Khai bao List dang 1
        List<String> listMenu = new ArrayList<String>();

        //Khai bao List dang 2
        ArrayList<String> ListMenu1 = new ArrayList<>();



        //Them phan tu vao list
        listMenu.add("Contact");
        listMenu.add("Dashboard");
        listMenu.add("Customer");
        listMenu.add("Projects");
        listMenu.add("Tasks");
        listMenu.add("Contact");

        // Duyet het List
        for (String menu: listMenu){
            System.out.println(menu);

        }
        System.out.println("===============");
        listMenu.add("Reports"); //Them gia tri chi dinh
        // Them phan tu theo vi tri chi dinh
        listMenu.add(1, "Support");
        for (String menu: listMenu){
            System.out.println(menu);

        }
        System.out.println("===============");
        listMenu.remove("Contact"); // xoa gia tri chi dinh
        for (String menu: listMenu){
            System.out.println(menu);

        }
        //Kiem tra 1 gia tri co trong List khong
        System.out.println("Check Reports menu in list: "+listMenu.contains("Reports"));

        // So sanh 2 List
        List <String> listMenu2 = new ArrayList<>();
        System.out.println("==================================");
        listMenu2.add("Contact");
        listMenu2.add("Dashboard");
        listMenu2.add("Customer");
        listMenu2.add("Projects");
        listMenu2.add("Tasks");
        listMenu2.add("Contact");
        for(String menu:listMenu2){
            System.out.println(menu);
        }
        System.out.println("Compare 2 List: "+listMenu.equals(listMenu2));

        // Get phan tu theo vi tri
        System.out.println("==================================");
        System.out.println("value at 1st position: "+listMenu2.get(0));

        System.out.println("==================================");

        //Sap xep tang  dan cac phan tu, theo A-Z, 1-9

        Collections.sort(listMenu2);
        for (String menu: listMenu2) {
            System.out.println(menu);

        }
    }
}
