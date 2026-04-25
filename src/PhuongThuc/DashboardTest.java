package PhuongThuc;

import StaticJava.ConfigData;

public class DashboardTest {
    public void test01_CheckCustomerTotal (){
        System.out.println(ConfigData.browser);
        System.out.println(ConfigData.windowSize);
        System.out.println("Test success");
        PhuongThucStatic.clickElement("Search input");
        PhuongThucStatic.setText("10","Search input");
        PhuongThucStatic.clickElement("Add customer button");
        PhuongThucStatic.setText("10","VA");

    }

    public static void main(String[] args) {
        DashboardTest dashboardTest = new DashboardTest();
        dashboardTest.test01_CheckCustomerTotal();

    }

}
