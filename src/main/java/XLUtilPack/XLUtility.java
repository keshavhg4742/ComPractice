package XLUtilPack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtility {
	FileInputStream fi;
	FileOutputStream fo;
	public XSSFWorkbook xssfWorkbook;
	public XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	String path;

	public XLUtility(String path) {
		this.path = path;

	}

	public int getRowCount(String sheetName) throws FileNotFoundException, IOException {
		fi=new FileInputStream(path);
		xssfWorkbook = new XSSFWorkbook(fi);
		sheet = xssfWorkbook.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		xssfWorkbook.close();
		fi.close();
		return rowCount;

	}

	public int getCellCount(String sheetName, int rowNum) throws FileNotFoundException, IOException {
		fi=new FileInputStream(path);
		xssfWorkbook = new XSSFWorkbook(fi);
		sheet = xssfWorkbook.getSheet(sheetName);
		row = sheet.getRow(rowNum);
		int cellNum = row.getLastCellNum();
		xssfWorkbook.close();
		fi.close();

		return cellNum;

	}

	public String getCellData(String sheetName, int rownum, int colnum) throws FileNotFoundException, IOException {
		fi = new FileInputStream(path);
		xssfWorkbook = new XSSFWorkbook(fi);
		sheet = xssfWorkbook.getSheet(sheetName);
		row = sheet.getRow(rownum);
		cell = row.getCell(colnum);
		DataFormatter dataFormatter = new DataFormatter();
		String data;
		// Returns the formatted value of a cell as a String regardless of the cell
		// type.
		data = dataFormatter.formatCellValue(cell);
		xssfWorkbook.close();
		return data;

	}

	public void setCellData(String sheetName, int rownum, int colnum, String data)
			throws FileNotFoundException, IOException {
		File xlFile = new File(path);
		if (!xlFile.exists()) {
			xssfWorkbook = new XSSFWorkbook();
			fo = new FileOutputStream(path);
			xssfWorkbook.write(fo);

		}
		fi = new FileInputStream(path);
		xssfWorkbook = new XSSFWorkbook(fi);
		//// If sheet not exists then create new Sheet
		if (xssfWorkbook.getSheetIndex(sheetName) == -1)
			xssfWorkbook.createSheet(sheetName);

		sheet = xssfWorkbook.getSheet(sheetName);
		// If row not exists then create new Row
		if (sheet.getRow(rownum) == null)
			row = sheet.createRow(rownum);
		cell = row.createCell(colnum);
		cell.setCellValue(data);
		fo = new FileOutputStream(path);
		fo.close();
		fi.close();

	}

}
