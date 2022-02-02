package test_scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Base_class;
import generic.Generic_readexcel;
import pom.ActiTime_Login;

public class LoginTestScript extends Base_class
{
	@Test
	public void test() throws EncryptedDocumentException, IOException
	{
		String username=Generic_readexcel.getData("sheet1", 0, 0);
		String password=Generic_readexcel.getData("sheet1", 1, 0);
		
		ActiTime_Login act=new ActiTime_Login(driver);
		act.username(username);
		act.password(password);
		act.login();
		//Assert.fail();
	}

}
