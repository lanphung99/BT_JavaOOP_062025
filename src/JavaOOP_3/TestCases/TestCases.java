package JavaOOP_3.TestCases;

import JavaOOP_3.Common.BaseTest;

public class TestCases extends BaseTest {
    public void login() {
        createDriver();
        System.out.println("Navigate to https://cms.anhtester.com/login");
        System.out.println("Enter Email: admin@example.com");
        System.out.println("Enter Password: 123456");
        System.out.println("Click Login button");
        System.out.println("Verify mennu Dashbroad is display");
        closeDriver();
    }

    public void addCategory() {
        createDriver("Firefox");
        System.out.println("Navigate to https://cms.anhtester.com/login");
        System.out.println("Enter Email: admin@example.com");
        System.out.println("Enter Password: 123456");
        System.out.println("Click Login button");
        System.out.println("Verify mennu Dashbroad is display");
        System.out.println("Click menu Products");
        System.out.println("Click menu Category");
        System.out.println("Verify redirect to the Category Page");
        System.out.println("Click Add New Category Button");
        System.out.println("Enter form data to Add New Category");
        System.out.println("Click Save Button");
        System.out.println("Verify new category added successfully");
        System.out.println("Verify the new category information is correct");
        closeDriver("Firefox");
    }
}
