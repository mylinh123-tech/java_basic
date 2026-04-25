package DataCollection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // Dang Key - Value (tuong tu Dict trong python)
        // Tuong tu Set neu muon sap xep theo thu tu thi dung TreeMap
        // Map khong cho phep trung key, neu trung thi giu lai key sau cung
        //Khai bao Map
        Map<String, String> map = new HashMap<>();
        //Them du lieu (put instead of add)
        map.put("Browser","Chrome");
        map.put("OS","MacOS");
        map.put("Browser","Edge");
        map.put("Screen","True");

        // In du lieu
        // Truy xuat theo tung Key
        System.out.println(map.get("OS"));
        //Get het gia tri cua key and value
        for (Map.Entry<String,String> entry: map.entrySet()){
            System.out.println(entry.getKey() +": "+entry.getValue());
        }
        //Xoa - Kiem tra
        map.remove("Screen");
        System.out.println("===================");
        for (Map.Entry<String,String> entry: map.entrySet()){
            System.out.println(entry.getKey() +": "+entry.getValue());
        }

        System.out.println(map.containsKey("OS"));
        System.out.println(map.containsValue("Chrome"));


    }
}
