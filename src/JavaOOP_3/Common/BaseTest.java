package JavaOOP_3.Common;

public class BaseTest {

    public void createDriver() {
        System.out.println("Browser: " + Constants.browser);
        System.out.println("Report: " + Constants.report);
        System.out.println("Headless: " + Constants.headless);
    }

    public void createDriver(String browser) {
        System.out.println("Browser: " + browser);
        System.out.println("Report: " + Constants.report);
        System.out.println("Headless: " + Constants.headless);
    }

    //Hàm đa hình
    public void closeDriver(String browser) {
        System.out.println("Browser: " + browser);
    }
    public void closeDriver() {
        System.out.println("Browser: " + Constants.browser);
    }
}
