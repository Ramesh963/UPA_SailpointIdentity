package com.upasailpoint.testcase;


import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.upasailpoint.pages.HomePage;

import wrappers.TestSuite;

public class IdentityVerify extends TestSuite{

@Test(dataProvider="fetchdata")
public void verifyTheData(String username,String employeeId,String EIsource) throws IOException {
	startTest("Details of User "+" '"+ username+"' ");
	Reporter.log("UserID: "+username);
	Reporter.log("------------------");
			new HomePage(driver, test).clickOnIdentites()
			.clickOnIdentityWareHouse()
			.enterTheUserName(username)
			.clickTheSearchIcon()
			.clickOnUserName(username)
			//.verifyTheFirstName(firstname)
			//.verifyTheLastName(lastname)
			.verifyTheEmployeeID(employeeId)
			.verifyTheEISource(EIsource)
			.clickOnApplicationAccount()
			.getListOfApplication(username)
			.getAttributes(username);
			

}
}