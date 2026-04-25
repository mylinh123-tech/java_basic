package Array;

public class MangChuoiMenu {
    public static void main(String[] args) {
        String menuList[] = new String[]{"Dashboard","Customer","Project","Task"};
        boolean checkMenu = false;
        for (String menu : menuList){
            System.out.println(menu);
            if (menu.equals("Dashboard")){
                //System.out.println("Have contain menu Dashboard");
                checkMenu = true;
                break; // Thoat luon vong lap for, khong kiem tra tiep
            }
        }

        if (checkMenu==true){
            System.out.println("Menu Dashboard has already existed");
        }else {
            System.out.println("The menu Dashboard not exist");
        };
    }

}
