package org.Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class demo {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\REZO\\eclipse-workspace\\org.Maven\\excel\\workbook.xlsx");
		FileInputStream input=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(input);
		Sheet s=w.getSheet("workbook");
		Row r=s.getRow(1);
		Cell c=r.getCell(0);
		System.out.println(c);
	}

}
