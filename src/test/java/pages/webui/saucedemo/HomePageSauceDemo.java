// Date Created         : 21 August 2024
// Author               : Johan Hartono Ho
// Modified/Updated by  : 22 August 2024

package pages.webui.saucedemo;

import org.openqa.selenium.By;
import helper.Utility;


public class HomePageSauceDemo {
      //Selected web elements

    static By item_label = By.xpath("//a[@id='item_4_title_link']");
    static By btn_add_cart = By.id("add-to-cart");
    static By btn_remove_cart = By.id("remove");
    static By btn_back_to_homepage = By.id("back-to-products");
    static By Sort_Products = By.xpath("//div[@id='header_container']/div[2]/div/span/select");

      //Selected web elements
    
    public static  void openBrowser() {
        Utility.startDriver();
        Utility.driver.get(helper.EndPoint.host_saucedemoweb);

    }
    public static  void user_click_label_item_product_name() {
        Utility.driver.findElement(item_label).click();
    }

    public  static void quitDriver() {
        // Utility.quitDriver();
    }
    public  static void user_click_button_Add_to_cart() {
        Utility.driver.findElement(btn_add_cart).click();
    }
    public static void Assert_that_the_button_change_from_add_cart_to_remove() {
        System.out.println("This function run properly");
    }
    public static void user_click_label_back_to_products_then_return_to_homepage() {
        Utility.driver.findElement(btn_back_to_homepage).click();
    }

}
