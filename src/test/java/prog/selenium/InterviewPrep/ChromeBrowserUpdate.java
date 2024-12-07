package prog.selenium.InterviewPrep;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserUpdate {


    public static void main(String[] args) {


        try {
            updateChromeBrowser();

        } catch (Exception e) {
            System.out.println();
        }

        // Step 3: Verify the update using Selenium
        WebDriver driver = new ChromeDriver();
        driver.get("chrome://settings/help");
        System.out.println("Opened Chrome Settings to verify update.");
        driver.quit();


    }

    static void updateChromeBrowser() {


        try {
            String osName = System.getProperty("os.name").toLowerCase();

            if (osName.equals("win")) {

                Runtime.getRuntime().exec("cmd /c start chrome.exe--force-update");

            } else if (osName.contains("mac")) {
                // macOS: Use `brew` to update Chrome
                System.out.println("Updating Chrome on macOS...");
                Runtime.getRuntime().exec("brew upgrade --cask google-chrome");


            }
        } catch (IOException e) {


        }

    }
}
