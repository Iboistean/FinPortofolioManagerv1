package com.finportofoliomanager.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrontPage {

    WebDriver ldriver;


    // Constructor
    public FrontPage(WebDriver rdriver) {

        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);


    }


    @FindBy(partialLinkText = "Investor Profi")
    WebElement investorProfile;

    @FindBy(partialLinkText = "Load Morning Positio")
    WebElement loadMorningPosition;


    public void investorProfile() {

        investorProfile.click();
    }


    public void loadMorningPosition() {

        loadMorningPosition.click();
    }


}
