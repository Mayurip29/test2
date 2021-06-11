package TestCases;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;

import PageObjects.LoginPagePO;
import PageObjects.HomePagePO;



public class CreateIncident extends BaseTest {


        int Flag =1;



       
       @SuppressWarnings("unlikely-arg-type")
	@Test
       public void createIncident() throws Exception {
            if (Flag > 0) {
                ExtentTestManager.getTest().getTest().setName("To validate User is successfully able to create Incident in service now application");
                ExtentTestManager.getTest().assignCategory("Incident");
                log.info("Create Incident test case execution started "); 
            }

            Thread.sleep(15000);
            CommonMethods commonMethods = new CommonMethods(driver);
            LoginPagePO loginpage = new LoginPagePO(driver);
            HomePagePO homepage = new HomePagePO(driver);
         
            
            // Step 1 :Open Url for execution
            commonMethods.openUrl(loginpage.Url);

        
            // Step 2: Switch to i frame 
         
             Assert.assertTrue(commonMethods.switchToframeClick(loginpage.frame,loginpage.txt_username),"Unable to switch to iframe");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Switch to i-frame", "Switched to i-frame");
            
            
            // Step 3: Enter UserName
            
            Assert.assertTrue(commonMethods.enterTextInInputField(loginpage.txt_username,loginpage.Username),"Unable to enter username ");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Enter Username", "Entered Username");
            
            
            // Step 4:Enter Password
            
            Assert.assertTrue(commonMethods.enterTextInInputField(loginpage.txt_password,loginpage.Password),"Unable to enter password");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Enter Password","Entered Password");
            
            
             // Step 5: Click on login button link
            
            Assert.assertTrue(commonMethods.clickOnLinkOrButton(loginpage.btn_login),"Unable to click on login button");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on login button","Clicked on login button");
            
            
            // Step 6: Click on incidents options
            
             Assert.assertTrue(commonMethods.clickOnLinkOrButton(homepage.option_Incidents),"Unable to click on incidents option");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on incidents options","Clicked incidents option");
            
            
           // Step 7: Switch to i frame
            
            Assert.assertTrue(commonMethods.switchToframeClick(homepage.frame,homepage.btn_new),"Unable to switch to iframe");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Switch to i-frame", "Switched to i-frame");
           
           // Step 8: Select value from dropdown list
            
            Assert.assertTrue(commonMethods.selectValFromDropDown(homepage.drpdwn_contact,homepage.drpdwnvalue_contact),"Unable to select value from contact dropdown list");
            ExtentTestManager.getTest().log(LogStatus.PASS," Select email dropdown value from dropdown", "Selected email dropdown value from contact value from dropdown list");

            // Step 9: Enter text in show description text
            
            Assert.assertTrue(commonMethods.enterTextInInputField(homepage.txt_description,homepage.description),"Unable to enter text in description");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Enter text in descripition","Entered text in description");
            
            // Step 10: Scroll page to down
            
            commonMethods.scrollPageByJs();
            
            // Step 11: Click on submit button
            
            Assert.assertTrue(commonMethods.clickOnLinkOrButton(homepage.btn_submit),"Unable to click on submit button");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on submit button","Clicked on submit button");
            
            
            // Step 11: Click on link incident
            
            Assert.assertTrue(commonMethods.clickOnLinkOrButton(homepage.link_incident),"Unable to click on link incident");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on link incident","Clicked on link incident");
            
            commonMethods.scrollPageByJs();
            
            // Step 12 : Click on resolved button
            
            Assert.assertTrue(commonMethods.clickOnLinkOrButton(homepage.btn_resolved),"Unable to click on resolve incident");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on resolved incident","Clicked on resolved incident");
            
            //Step 11: Click on link incident button
            
            Assert.assertTrue(commonMethods.clickOnLinkOrButton(homepage.link_incident),"Unable to click on link incident");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on link incident","Clicked on link incident");
           
            Thread.sleep(3000);
            
            commonMethods.scrollPageByJs();
            
             // Step 12 : Click on close incident button
            
            Assert.assertTrue(commonMethods.clickOnLinkOrButton(homepage.btn_close),"Unable to click on close incident");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on close incident","Clicked on close incident");
            
            
            
        }        
       
       
       @Test
       public void updateIncident() throws Exception {
            if (Flag > 0) {
                ExtentTestManager.getTest().getTest().setName("To validate User is successfully able to update Incident in service now application");
                ExtentTestManager.getTest().assignCategory("Incident");
                log.info("Create Incident test case execution started "); 
            }

            Thread.sleep(15000);
            CommonMethods commonMethods = new CommonMethods(driver);
            LoginPagePO loginpage = new LoginPagePO(driver);
            HomePagePO homepage = new HomePagePO(driver);
         
            
            // Step 1 :Open Url for execution
            commonMethods.openUrl(loginpage.Url);

        
            
            // Step 6: Click on incidents options
            
             Assert.assertTrue(commonMethods.clickOnLinkOrButton(homepage.option_Incidents),"Unable to click on incidents option");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on incidents options","Clicked incidents option");
            
            
           // Step 7: Switch to i frame
            
            Assert.assertTrue(commonMethods.switchToframeClick(homepage.frame,homepage.btn_new),"Unable to switch to iframe");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Switch to i-frame", "Switched to i-frame");
           
           // Step 8: Select value from dropdown list
            
            Assert.assertTrue(commonMethods.selectValFromDropDown(homepage.drpdwn_contact,homepage.drpdwnvalue_contact),"Unable to select value from contact dropdown list");
            ExtentTestManager.getTest().log(LogStatus.PASS," Select email dropdown value from dropdown", "Selected email dropdown value from contact value from dropdown list");

            // Step 9: Enter text in show description text
            
            Assert.assertTrue(commonMethods.enterTextInInputField(homepage.txt_description,homepage.description),"Unable to enter text in description");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Enter text in descripition","Entered text in description");
            
            // Step 10: Scroll page to down
            
            commonMethods.scrollPageByJs();
            
            // Step 11: Click on submit button
            
            Assert.assertTrue(commonMethods.clickOnLinkOrButton(homepage.btn_submit),"Unable to click on submit button");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on submit button","Clicked on submit button");
            
            
            // Step 11: Click on link incident
            
            Assert.assertTrue(commonMethods.clickOnLinkOrButton(homepage.link_incident),"Unable to click on link incident");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on link incident","Clicked on link incident");
            
            Assert.assertTrue(commonMethods.enterTextInInputField(homepage.txt_description,"Testing"),"Unable to enter text in description");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Enter text in descripition","Entered text in description");
            
            
            commonMethods.scrollPageByJs();
            
            
            Assert.assertTrue(commonMethods.clickOnLinkOrButton(homepage.btn_update),"Unable to click on upedat incident");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on update incident","Clicked on update incident");
            
            
            
            Assert.assertTrue(commonMethods.clickOnLinkOrButton(homepage.link_incident),"Unable to click on link incident");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on link incident","Clicked on link incident");
            
            
            // Step 12 : Click on resolved button
            
            Assert.assertTrue(commonMethods.clickOnLinkOrButton(homepage.btn_resolved),"Unable to click on resolve incident");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on resolved incident","Clicked on resolved incident");
            
            //Step 11: Click on link incident button
            
            Assert.assertTrue(commonMethods.clickOnLinkOrButton(homepage.link_incident),"Unable to click on link incident");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on link incident","Clicked on link incident");
           
            Thread.sleep(3000);
            
            commonMethods.scrollPageByJs();
            
             // Step 12 : Click on close incident button
            
            Assert.assertTrue(commonMethods.clickOnLinkOrButton(homepage.btn_close),"Unable to click on close incident");
            ExtentTestManager.getTest().log(LogStatus.PASS,"Click on close incident","Clicked on close incident");
            
            
            
        }        
}



