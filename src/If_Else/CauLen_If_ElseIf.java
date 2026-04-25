package If_Else;

public class CauLen_If_ElseIf {
    public void checkRoleAndMenuDisplay(String role){

        if (role.equals("Admin")){
            System.out.println("Display 15 menu");
        } else if (role.equals("Customer")){
            System.out.println("Display 5 menu");
        } else if (role.equals("Employee")){
            System.out.println("Navigate to UserHome page");
        } else{
            System.out.println("Navigate to Project Manager page");
        };
        //co the thay the thanh 4 cua if



    }
    public static void main(String[] args) {

        //Thuong dung trong test phan quyen
            float mark = 1.3f;
            if (mark >=8){
                System.out.println("Excellent student");
            }else if (mark < 8 && mark >= 6.5){
                System.out.println("Good student");
            }else if (mark < 6.5 && mark >= 5){
                System.out.println("Medium student");
            }else if (mark < 5 && mark >= 2){
                System.out.println("Poor student");
            }else {
                System.out.println("Not process to next class");
            };

        CauLen_If_ElseIf object = new CauLen_If_ElseIf();
        object.checkRoleAndMenuDisplay("Employee");


    }


}
