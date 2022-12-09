package testNGtest;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExamp {
	@DataProvider
	public String[][] dtProvider() {
		String[][] str=new String[2][3];
		str[0][0]="sant";str[0][1]="sac";str[0][2]="ac";
		str[1][0]="vrj";str[1][1]="kesh";str[1][2]="ke";
		//str[2][0]="pra";str[2][1]="pra";str[2][2]="pra";
		
	return str;
	}
	
		@Test(dataProvider="dtProvider")
		public void test(String s,String t,String r) {
			Reporter.log(s+"  "+t+r,true);
		
	}

}
