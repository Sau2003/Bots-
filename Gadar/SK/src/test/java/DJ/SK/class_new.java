package DJ.SK;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class class_new {

    public static void main(String[] args) {
        // Set the path to chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\OneDrive\\Desktop\\Gadar\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open GitHub login page
        driver.get("https://github.com/login");

        // Enter email
        WebElement emailInput = driver.findElement(By.id("login_field"));
        emailInput.sendKeys("saurabhkuche2@gmail.com"); // Replace with your email

        // Enter password
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("Saurabh$02003"); // Replace with your password

        // Click on the "Sign in" button
        WebElement signInButton = driver.findElement(By.name("commit"));
        signInButton.click();

        // Wait for some time to ensure login is successful
        try {
            Thread.sleep(5000); // 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Navigate to repository creation page
        driver.get("https://github.com/new");

        // Enter repository name
        WebElement repositoryNameInput = driver.findElement(By.id(":r3:"));
        repositoryNameInput.sendKeys("Data-Science-Repo by SK"); // Replace with your desired repository name

        // Enter repository description if needed
        WebElement repositoryDescriptionInput = driver.findElement(By.id(":r4:"));
        repositoryDescriptionInput.sendKeys("Repository for data science projects"); // Replace with your desired description

        // Choose visibility (public or private) if needed
        WebElement repositoryVisibilityDropdown = driver.findElement(By.id("repository_visibility"));
        repositoryVisibilityDropdown.sendKeys("public"); // Replace with "private" if needed

        // Click on the "Create repository" button
     // Execute JavaScript to click on the "Create repository" button
     // Click on the "Create repository" button using CSS selector
        WebElement createRepositoryButton = driver.findElement(By.cssSelector("body > div.logged-in.env-production.page-responsive > div.application-main > main > react-app > div > form > div.Box-sc-g0xbh4-0.aBKvw > button > span > span"));
        createRepositoryButton.click();

        // Wait for some time to ensure repository creation
        try {
            Thread.sleep(5000); // 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
