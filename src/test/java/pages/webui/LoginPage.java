// Date Created         : 11 August 2024
// Author               : Johan Hartono Ho
// Modified/Updated by  : 21 August 2024

package pages.webui;

import org.openqa.selenium.By;

import helper.Utility;

public class LoginPage {
    static By input_username = By.cssSelector("input#user-name");
    static By input_pwd = By.xpath("//*[@id=\"password\"]");
    static By btn_login = By.id("login-button");
    static By icon_burger = By.id("react-burger-menu-btn");
    static By icon_cart = By.xpath("//a[@class='shopping_cart_link']");
    static By menu_logout = By.id("logout_sidebar_link");

    public static void openBrowser() {
        Utility.driver.get("https://www.saucedemo.com");

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
    public static void user_click_hamburger_icon() {
        Utility.driver.findElement(icon_burger).click();
    }
    public static void user_logout_from_system() {
        Utility.driver.findElement(menu_logout).click();
    }
    

    public static void quitDriver() {
        // Utility.quitDriver();
    }
}
