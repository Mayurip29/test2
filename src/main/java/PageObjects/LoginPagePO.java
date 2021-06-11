package PageObjects;

import BasePackage.BasePage;
import ExcelUtility.ReadExcel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.io.IOException;

public class LoginPagePO extends BasePage
{

    public LoginPagePO(WebDriver driver) throws IOException {

        super(driver);
    }

    ReadExcel readExcel = new ReadExcel("Data.xlsx", "AdminEmail");

    public String Url = readExcel.readValues("Url");
    public String Username = readExcel.readValues("UserName");
    public String Password = readExcel.readValues("Password");
   
    
  
   
    
   


    
    public By txt_username = By.id("user_name");
    public By txt_password = By.id("user_password");
    public By btn_login = By.id("sysverb_login");
    public By frame = By.id("gsft_main");
    
    
  



}

