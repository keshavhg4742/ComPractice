package XLUtilPack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dummy {

	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream(".\\XLFile\\loginData.xlsx");
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fi);
		XSSFSheet sheet = xssfWorkbook.getSheet("Sheet1");
		System.out.println(sheet);
		int rowCount = sheet.getLastRowNum();
		xssfWorkbook.close();
		fi.close();
		System.out.println(rowCount);

	}

}
