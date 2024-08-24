package pages.webui.demoblaze;
import java.time.Duration;

import org.openqa.selenium.By;
import helper.Utility;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageDemoBlaze {
     //Selected web elements
    static By click_product = By.xpath("//a[contains(text(),'Samsung galaxy s6')]");
    static By click_Login = By.id("login2");
    static By input_username = By.id("loginusername");
    static By input_pwd = By.id("loginpassword");
    static By btn_login = By.xpath("//div[@id='logInModal']//button[text()='Log in']");

 
     //End of Selected web elements
 

     public static void openBrowser() { 
         Utility.startDriver();
         Utility.driver.get(helper.EndPoint.host_demoblazeweb);
      
              }
     public void demoblaze_user_click_menu_Log_In() {
           WebDriverWait wait = new WebDriverWait(Utility.driver,Duration.ofSeconds(500));
        wait.until(ExpectedConditions.presenceOfElementLocated(click_Login));
        Utility.driver.findElement(click_Login).click();
        
    }
     public static void user_input_username(String username) {
        Utility.driver.findElement(click_Login).click();
        Utility.driver.findElement(input_username).click();
        Utility.driver.findElement(input_username).sendKeys(username);
     }
 
     public static void user_input_password(String pwd) {
        Utility.driver.findElement(input_pwd).click();
           Utility.driver.findElement(input_pwd).sendKeys(pwd);
     }
 
     public static void user_click_login_button() {
        //WebDriverWait wait1 = new WebDriverWait(Utility.driver,Duration.ofSeconds(10));
        //wait1.until(ExpectedConditions.elementToBeClickable(btn_login));
         //Utility.driver.findElement(btn_login).click();
         System.out.println("Login Button doesn't work using automation");
     }
   
     public static void quitDriver() {
         // Utility.quitDriver();
     }
}
