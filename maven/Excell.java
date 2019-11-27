package org.test.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excell {
public static void main(String[] args) throws Throwable {
	File loc= new File("C:\\Users\\WIN 10\\eclipse-workspace\\MavenFirst\\File\\Book1.xlsx");
	FileInputStream stream = new FileInputStream(loc);
	Workbook w = new XSSFWorkbook(stream);
	Sheet s = w.getSheet("Sheet1");
	Row r = s.getRow(1);
	Cell c = r.getCell(3);
	System.out.println(c);
	for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
		Row r1 = s.getRow(i);
		
	for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
		Cell c1 = r1.getCell(j);
		System.out.println(c1);
		int type = c1.getCellType();
		System.out.println(type);
		
		if(type==1) {
			String stringCellValue = c1.getStringCellValue();
			System.out.println(stringCellValue);
		}
		else if(type==0) {
			if(DateUtil.isCellDateFormatted(c1)) {
			Date dateCellValue = c1.getDateCellValue();
			System.out.println(dateCellValue);
		SimpleDateFormat sim= new SimpleDateFormat("dd-MMM-yy");
		String f = sim.format(dateCellValue);
		System.out.println(f);
		}
		else {
			double numericCellValue = c1.getNumericCellValue();
			long l = (long)numericCellValue;
			String value = String.valueOf(l);
			System.out.println(value);
			
			
			
		}
		
		
		
	}
	}

	
	
	
	
	
	
}
}}
