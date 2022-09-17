package driverPackage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_001 extends BaseDriver {
    String baseUrl= "https://rahulshettyacademy.com/locatorspractice/";

    @Test
     public void locator() throws InterruptedException {
        driver.get(baseUrl);
        driver.manage().window().maximize();

        driver.findElement(By.id("inputUsername")).sendKeys("sajib");

        driver.findElement(By.name("inputPassword")).sendKeys("12345");

        driver.findElement(By.className("signInBtn")).click();

        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        //If class if given --> tagname.value
        //If ID if given --> tagname#value

        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("riyan");
                //tagname[@attribute=""value
        driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("riyan@gamil.com");

        driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("01518919299");

        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Go to Login')]")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("inputUsername")).sendKeys("sajib");

        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");

        Thread.sleep(2000);
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();

        Thread.sleep(2000);
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(5000);

        driver.findElement(By.className("logout-btn")).click();
        Thread.sleep(2000);
    }
}
