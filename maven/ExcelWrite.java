package org.test.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
public static void main(String[] args) throws Throwable {
	File loc=new File("C:\\Users\\WIN 10\\eclipse-workspace\\MavenFirst\\File\\Book1.xlsx");
	FileInputStream f=new FileInputStream(loc);
	Workbook w= new XSSFWorkbook(f);
	Sheet cS = w.getSheet("Sheet0");
	Row cRow = cS.getRow(5);
	Cell c = cRow.getCell(7);
	String cellValue = c.getStringCellValue();
	if(cellValue.equals("Kailash")) {
		c.setCellValue("padmaja");
	}
	FileOutputStream out=new FileOutputStream(loc);
	w.write(out);
	System.out.println("updated");
	
	
}
}
