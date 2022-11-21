package com.celtic.automation.cmcs.util;

import java.io.File;import java.io.FileInputStream;import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class WriteExcelUtil {
	/*private  FileInputStream fis = null;
	private Map<String, Integer> columns =null;
	private Cell cellC=null;;
	ConfigReader config=new ConfigReader();*/
	private Map<String, Integer> columns =null;

	public  void setCellData(String sheetname, String columnName, int rownum,String value) throws IOException {
		FileInputStream fis = null;
		
		Cell cellC=null;;
		ConfigReader config=new ConfigReader();
		Workbook workbook = null;
		Boolean bool = null;
		Sheet newSheet;
		Row row ;
		FileOutputStream out = null;
		String eachcolumnName=null;
		try {
			fis = new FileInputStream(new File(config.writeexcel()));
			workbook = WorkbookFactory.create(fis);
			for (int i=0; i<workbook.getNumberOfSheets(); i++) {
				bool=workbook.getSheetName(i).toString().equalsIgnoreCase(sheetname);
				if(bool==true) {
					break;
				}
			}
			if(bool==false) {
				newSheet = workbook.createSheet(sheetname);
				columns	= new HashMap<>();
			}
			else {
				newSheet =workbook.getSheet(sheetname);
			}
			if(newSheet.getLastRowNum()<0) {
				row=  newSheet.createRow(0);
			}
			int rown= newSheet.getLastRowNum();
			if(rown>=rownum) {
				row= newSheet.getRow(rownum);
			}
			else {
				row= newSheet.createRow(rownum);
			}
			if(newSheet.getRow(0).getLastCellNum()<0) {
				newSheet.getRow(0).createCell(0).setCellValue(columnName);
			}
			int lastcellnum=newSheet.getRow(0).getLastCellNum();
			if(columns.isEmpty()) {
				columns.put(columnName, columns.size()+1);
				newSheet.getRow(0).createCell(lastcellnum-1).setCellValue(columnName); // row=0,cell=0 lo setting value
			}
			for(int j=0;j<lastcellnum;j++) {
				eachcolumnName=newSheet.getRow(0).getCell(j).getStringCellValue().trim();
				if(!(columns.containsKey(eachcolumnName))) {
					columns.put(eachcolumnName, columns.size()+1); //b=1
				}
				if(!(columns.containsKey(columnName))) {
					newSheet.getRow(0).createCell(newSheet.getRow(0).getLastCellNum()).setCellValue(columnName);
					columns.put(columnName, columns.size()+1); //b=1
				}	
			}
			if(newSheet.getRow(rownum).getLastCellNum()<0) {
				newSheet.getRow(rownum).createCell(0).setCellValue(value);
			}
			else {
				cellC=newSheet.getRow(rownum).createCell(columns.get(columnName)-1);
			cellC.setCellValue(value);
			}
				out  = new FileOutputStream(new File(config.writeexcel()));
			workbook.write(out); 
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			workbook.close();
			out.close();
		}
	}
}