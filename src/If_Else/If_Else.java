package If_Else;

public class If_Else {
    public void createBrowser (String browser){
        String browserSystem = System.getProperty("browser");
        if (browserSystem != null){
            browser = browserSystem;
        }
        System.out.println(browser);
    }


    public static void main(String[] args) {
        String actualCustomerName = "linh";
        int CustomerID = 123;
        if (actualCustomerName.equals("Nga") && CustomerID == 123 ) {
            System.out.println("Test case Add new Customer passed");
        }
        else{
            System.out.println("Test case Add new Customer fail");
        }



}
}
