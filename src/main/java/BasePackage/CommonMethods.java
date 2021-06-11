package BasePackage;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.lt;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.*;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import org.testng.Assert;

public class CommonMethods {

 
    private WebDriver driver;
    private JavascriptExecutor jse;
    public String value;
    
    public CommonMethods() {

    }

    public CommonMethods(WebDriver driver) {
        this.driver=driver;

    }
    public boolean clickOnLinkOrButton(By by) {
        try {
            Thread.sleep(2000);
            WebElement generic_WebL = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.elementToBeClickable(by));
            generic_WebL.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }



    public boolean enterTextInInputField(By by, String data) {
        try {
            WebElement generic_WebL = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            if (generic_WebL.isDisplayed()) {
                generic_WebL.clear();
                generic_WebL.sendKeys(data);
                return true;
            }
            return false;
        } catch (Exception e) {
            throw e;

        }
    }

 
    public  boolean  getText(By by){
        
   	 try{
            
            driver.findElement(by).getText();
            return true;
        }catch (Exception e){
            return false;
        }
    }
    
    
public boolean verifyElementIsVisible(By by) {
        try {
            Thread.sleep(5000);
            WebElement generic_WebL = driver.findElement(by);
             generic_WebL.isDisplayed();
             return true;
        } catch (Exception e) {
            return false;
        }
   
   }
    
    
    
    public boolean verifyElementIsEnable(By by){

        try {
            Thread.sleep(5000);
            WebElement generic_WebL = driver.findElement(by);
            generic_WebL.isEnabled();
            return true;
            
        } catch (Exception e) {
            return false;
        }
    }


   

    public boolean clickByJS(By by) {
        try {
            WebElement webElement = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
            return true;
        } catch (Exception e) {
            return false;
        }
    }



 public boolean openUrl(String url){
        try{
            Thread.sleep(500);
            driver.get(url);
            Thread.sleep(1000);
            return true;
        }catch (Exception e){
            return false;
        }

    }

    public boolean selectFromComboBox(By drpDownClick, By drpValue) throws Exception {
        try {
            Thread.sleep(2500);
            WebElement webElement = (new WebDriverWait(driver, 80))
                    .until(ExpectedConditions.visibilityOfElementLocated(drpDownClick));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
            Thread.sleep(2500);

            WebElement value1 = new WebDriverWait(driver,80).
                    until(ExpectedConditions.visibilityOfElementLocated(drpValue));
            value1.click();

            return true;
        }catch (Exception e ){
            throw e;
        }
    }

   

    public boolean selectValFromDropDown(By drpdown, String value){
        try{
            Select dropdown=new Select(driver.findElement(drpdown));
            dropdown.selectByValue(value);
            return true;
        }catch (Exception e){
            return false;

        }

    }


    public boolean refreshPage(){
        try {
            Robot r= new Robot();
            r.keyPress(KeyEvent.VK_F5);
            r.keyRelease(KeyEvent.VK_F5);
            return true;
        }catch (Exception e){
            return false;
        }
    }

   
    public void scrollPageByJs(){
        jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0, 250)");
    }
    public void scrollPageByJs(int x, int y){
        jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy("+x+","+y+")");
    }

    
    public boolean switchToframeClick(By frameId, By element){
        try{
            switchToframe(frameId);
            Thread.sleep(2500);
            clickOnLinkOrButton(element);
            return true;
        }catch (Exception e){
            return false;
        }
        
    }
        public void switchToframe(By by){
            driver.switchTo().frame(driver.findElement(by));
        }


    

   
     public void closeWindow() throws InterruptedException {
        Thread.sleep(2500);
        driver.close();
    }

  
    public  boolean  verifyTitle(String value ){
        
   	 try{
            
            String Title=driver.getTitle();
            System.out.println("Title of page==="+Title);
            Title.equals(value);
            
            return true;
        }catch (Exception e){
            return false;
        }
    }

}

