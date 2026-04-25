package DataCollection;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        // - Lưu trữ giá trị không trùng lặp
        // - Không lưu theo thứ tự, nên không thể lấy ra 1 phần tử theo vị trí chỉ định
        // HashSet khong sap xep / TreeSet sắp theo thứ tự tăng dần

        Set<String> setTabBrowser = new HashSet<>();
        setTabBrowser.add("Li12344");
        setTabBrowser.add("ML12333");
        setTabBrowser.add("AN12344");
        setTabBrowser.add("Li12344");

        for (String tab : setTabBrowser)
        {
            System.out.println(tab);
        }

//        List<String> list = new ArrayList<>();
//        Collections.sort(list);
//        for (String tab: list){
//            System.out.println(tab);
//        }
        System.out.println("===============");
        Set<String> setTabBrowser1 = new TreeSet<>();
        setTabBrowser1.add("Li12344");
        setTabBrowser1.add("ML12333");
        setTabBrowser1.add("AN12344");
        setTabBrowser1.add("Li12344");

        for (String tab : setTabBrowser1)
        {
            System.out.println(tab);
        }
        System.out.println("===============");
        Set<String> setTabBrowser3 = new TreeSet<>(Collections.reverseOrder());
        setTabBrowser3.add("Li12344");
        setTabBrowser3.add("ML12333");
        setTabBrowser3.add("AN12344");
        setTabBrowser3.add("Li12344");

        for (String tab : setTabBrowser3)
        {
            System.out.println(tab);
        }

        System.out.println("===============");
        System.out.println(setTabBrowser.contains("Li12344"));

        System.out.println("===============");
        setTabBrowser.remove("Li12344");
        for (String tab : setTabBrowser)
        {
            System.out.println(tab);
        }

    }

}
