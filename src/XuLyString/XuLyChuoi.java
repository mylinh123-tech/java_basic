package XuLyString;

public class XuLyChuoi {
    public static void main(String[] args) {
        String str1 = "Selenium Java - Web Test Automation";
        String str2 = "Playwright Java - Web API Test Automation";
        System.out.println(str1.toLowerCase());
        System.out.println(str2.toUpperCase());
        System.out.println(str1.charAt(14)); // Lay tra ki tu tai vi tri thu [14] - bat dau  = 0
        System.out.println("The length of input string: "+str1.length());
        System.out.println("Cut string from position 16 : " +str1.substring(16));
        System.out.println("Cut string from position 16 - 19:"+str1.substring(16,19));
        System.out.println(str1.contains("Selenium"));
        System.out.println(str2.contains("Playwright"));
        System.out.println(str1.equals("Selenium Java - Web Test"));
        System.out.println(str1.equals("Selenium Java - Web Test Automation"));
        String textTableFooter = "Showing 1 to 25 of 40 entries";
        //Lay ki tu 40 trong chuoi
        System.out.println(textTableFooter.substring(19,21));
        // Tach chuoi theo khoang trang
        String mangGiaTriSauTach[] = textTableFooter.split(" ");
        System.out.println(mangGiaTriSauTach[5]);
        //Kiem tra chuoi co rong khong
        boolean check = str1.isEmpty();
        System.out.println(check);
        // Noi chuoi lai voi nhau
        String str3 = "Library automation: "+"Selenium";
        System.out.println(str3);
        System.out.println(str3.concat(" Selenium"));
        //Thay the chuoi
        System.out.println(str1.replace("Java","C#"));
        String str4 = "Selenium Java Selenium C# Selenium Python ";
        System.out.println(str4.replaceAll("Selenium","Playwright"));
        //Kiem tra chu dau, chu cuoi
        System.out.println("Start with:"+ str1.startsWith("Selenium"));
        System.out.println("End with: "+ str1.endsWith("Automation"));
        // Loai bo khoang trang o dau va cuoi chuoi
        String str5 = " Welcome Automation court    ";
        System.out.println(str5.trim());
        // Chuyen doi so <-> chuoi
        String stringNumber = "10000";
        int number  = 20000;
        System.out.println(stringNumber + 5);
        System.out.println("Transfer number string -> number:" + (Integer.valueOf(stringNumber) + 10));
        System.out.println("Transfer number -> string:" + (String.valueOf(number) + 5));
        //Kiem tra chuoi rong
        // isEmpty, khoang trang  => khong rong
        // isBlank, khoang trang => rong
        System.out.println("==============");
        String string01 ="    ";
        String string02 ="";
        boolean check01 = string01.isEmpty();
        System.out.println(check01);
        System.out.println(string02.isEmpty());
        System.out.println("==============");
        System.out.println(string01.isBlank());
        System.out.println(string02.isBlank());



    }

}
