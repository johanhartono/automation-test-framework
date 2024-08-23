// Date Created         : 11 August 2024
// Author               : Johan Hartono Ho
// Modified/Updated by  : 19 August 2024

package helper;

import java.io.File;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
    public static WebDriver driver;

    public static File getJSONSchemaFile(String JSONFile) {
        return new File("src/test/java/helper/JSONSchemaData/" + JSONFile);
    }

    public static String generateRandomEmail() {
        @SuppressWarnings("unused")
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_-";
        String email = "";
        String temp = RandomStringUtils.randomAlphanumeric(10);
        email = temp + "@testdata.com";
        return email;
    }

    public static void startDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }

    public static void quitDriver() {
        driver.quit();
    }
}
