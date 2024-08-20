// Date Created         : 21 August 2024
// Author               : Johan Hartono Ho
// Modified/Updated by  : 21 August 2024

package pages.webui;

import org.openqa.selenium.By;

import helper.Utility;

public class HomePage {
    static By item_label = By.xpath("//a[@id='item_4_title_link']");
    
    public static void openBrowser() {
        Utility.driver.get("https://www.saucedemo.com");

    }
    public static void user_click_label_item_product_name() {
        Utility.driver.findElement(item_label).click();
    }

    public static void quitDriver() {
        // Utility.quitDriver();
    }
}
