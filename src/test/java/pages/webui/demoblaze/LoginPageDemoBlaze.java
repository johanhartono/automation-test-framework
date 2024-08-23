package pages.webui.demoblaze;
import org.openqa.selenium.By;

import helper.Utility;
public class LoginPageDemoBlaze {
     //Selected web elements
    static By mnuSignIn = By.id("login2");
       static By input_username = By.id("loginusername");
       static By input_pwd = By.id("loginpassword");
       static By btn_login = By.xpath("//button[@type='button'])[9]");

 
     //End of Selected web elements
 
     public static void openBrowser() {
         Utility.startDriver();
         Utility.driver.get(helper.EndPoint.host_demoblazeweb);
 
     }
     public void demoblaze_user_click_menu_Log_In() {
        Utility.driver.findElement(mnuSignIn).click();
    }
     public static void user_input_username(String username) {
         Utility.driver.findElement(input_username).sendKeys(username);
     }
 
     public static void user_input_password(String pwd) {
         Utility.driver.findElement(input_pwd).sendKeys(pwd);
     }
 
     public static void user_click_login_button() {
         Utility.driver.findElement(btn_login).click();
     }
   
     public static void quitDriver() {
         // Utility.quitDriver();
     }
}
