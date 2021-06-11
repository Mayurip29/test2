package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BasePackage.BasePage;
import ExcelUtility.ReadExcel;

public class HomePagePO extends BasePage{

	
	
	

	    public HomePagePO(WebDriver driver) throws IOException {

	        super(driver);
	    }

	    ReadExcel readExcel = new ReadExcel("Data.xlsx", "AdminEmail");
	    
	  public  String drpdwnvalue_contact ="2";
	  public String description = readExcel.readValues("Description");
	  
	  
	   
	    
	   


	    
	    public By option_Incidents = By.xpath("//*[@id=\"087800c1c0a80164004e32c8a64a97c9\"]/div");
	    public By btn_new = By.id("sysverb_new");
	    public By txt_search = By.xpath(".//*[@placeholder='Search']");
	    public By frame = By.id("gsft_main");
	    public By drpdwn_contact = By.id("incident.urgency");
	    public By txt_description = By.xpath(".//*[@id='incident.short_description']");
	    public By btn_submit = By.id("sysverb_insert_bottom");
	    public By link_incident = By.xpath(".//*[@class='linked formlink']");
	    public By btn_resolved = By.id("resolve_incident_bottom");
	    public By btn_close = By.id("close_incident_bottom");
	    public By btn_update = By.id("sysverb_update_bottom");
	
}
