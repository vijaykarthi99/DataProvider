package org.com;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	@DataProvider(name="login")
//execute particular set of data indices= {1}
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
data[0][0]= "vijy";
data[0][1]= "vijy";

data[1][0]= "123";
data[1][1]= "12324252353523";
return data;
	}
	
	

}
