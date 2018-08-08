package com.cg.nd.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page1 {

@FindBy(xpath="//*[@id=\"txtFirstName\"]")
	
	public WebElement fname;

@FindBy(xpath="//*[@id=\"txtLastName\"]")

public WebElement lname;

@FindBy(xpath="//*[@id=\"txtEmail\"]")

public WebElement mail;

@FindBy(xpath="//*[@id=\"txtPhone\"]")

public WebElement cnum;

@FindBy(xpath="/html/body/form/table/tbody/tr[5]/td[2]/select/option[1]")

public WebElement count;

@FindBy(xpath="//*[@id=\"txtAddress1\"]")

public WebElement area1;

@FindBy(xpath="//*[@id=\"txtAddress2\"]")

public WebElement area2;

@FindBy(xpath="/html/body/form/table/tbody/tr[9]/td[2]/select/option[4]")

public WebElement city;

@FindBy(xpath="/html/body/form/table/tbody/tr[10]/td[2]/select/option[4]")

public WebElement state;

@FindBy(xpath="/html/body/form/table/tbody/tr[12]/td[2]/input")

public WebElement mem;

@FindBy(xpath="/html/body/form/table/tbody/tr[14]/td/a")

public WebElement next;

@FindBy(xpath="//*[@id=\"txtCardholderName\"]")

public WebElement name;

@FindBy(xpath="//*[@id=\"txtDebit\"]")

public WebElement cardnum;

@FindBy(xpath="//*[@id=\"txtCvv\"]")

public WebElement cvvnum;

@FindBy(xpath="//*[@id=\"txtMonth\"]")

public WebElement month;

@FindBy(xpath="//*[@id=\"txtYear\"]")

public WebElement year;

@FindBy(xpath="//*[@id=\"btnPayment\"]")

public WebElement next1 ;
}
