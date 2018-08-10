package com.sumanthbayya.product_service_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseSaveLocation {
      public static void main(String[] args) {
    	  System.setProperty("webdriver.chrome.driver", "C:/Users/manikanta.nsk/Downloads/chromedriver_win32/chromedriver.exe");
    	  ChromeDriver driver =  new ChromeDriver();
    	  System.out.println("Opened Chrome");
             driver.get("http://localhost:9030/DemoUiWeb/#!/location");
             try {
				Thread.sleep(5000);
			} catch (Exception e) {
				
			}
             
             WebElement addButton = driver.findElement(By.id("addLocation"));
             addButton.click();
             
             WebElement locationName = driver.findElement(By.id("locName"));
             locationName.sendKeys("test01");
             
             WebElement locationDesc = driver.findElement(By.id("locDesc"));
             locationDesc.sendKeys("test01-desc");
             
             WebElement locationActive = driver.findElement(By.id("locActive"));
             locationActive.sendKeys("y");
             try {
  				Thread.sleep(2000);
  			} catch (Exception e) {
  			
  			}
             WebElement saveButton = driver.findElement(By.id("saveLocation"));
             saveButton.click();
             try {
   				Thread.sleep(3000);
   			} catch (Exception e) {
   			
   			}
             WebElement refreshButton = driver.findElement(By.id("refresh"));
             refreshButton.click();
 				
             

        }
}