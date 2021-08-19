package data_provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@Test(dataProvider="getvalues")
	public void datta(String s1, String s2)
	{
		System.out.println(s1+" "+s2);
	}
	
	@DataProvider
	public Object[][] getvalues()
	{
		Object[][] arr=new Object[5][2];
		arr[0][0]="UN1";
		arr[0][1]="PWD1";
		
		arr[1][0]="UN2";
		arr[1][1]="PWD2";
		
		arr[2][0]="UN3";
		arr[2][1]="PWD3";
		
		arr[3][0]="UN4";
		arr[3][1]="PWD4";
		
		arr[4][0]="UN5";
		arr[4][1]="PWD5";
		
		return arr;
	}

}
