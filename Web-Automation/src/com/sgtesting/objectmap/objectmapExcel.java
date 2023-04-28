package com.sgtesting.objectmap;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

public class objectmapExcel {
	public static Workbook wb=null;
	public objectmapExcel(String Filename)
	{
		FileInputStream fin=null;
		try
		{
		fin=new FileInputStream(Filename);	
		wb=new XSSFWorkbook(fin);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public By getLocator(String logicalname)
	{
		By by=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
		sh=wb.getSheet("sheet1");
		int rc=sh.getPhysicalNumberOfRows();
		for(int r=1;r<rc;r++)
		{
			row=sh.getRow(r);
			cell=row.getCell(0);
			if(cell.getStringCellValue().toLowerCase().trim().equals(logicalname.toLowerCase().trim()))
			{
				cell=row.getCell(1);
				String locatorname=cell.getStringCellValue();
				cell=row.getCell(2);
				String locatorvalue=cell.getStringCellValue();
				System.out.println(locatorname+"  "+locatorvalue);
				switch(locatorname.toLowerCase())
				{
				 case "id":
					  by=By.id(locatorvalue);
					  break;
					  case "name":
						  by=By.name(locatorvalue);
						  break;
					  case "classname":
						  by=By.className(locatorvalue);
						  break;
					  case "xpath":
						  by=By.xpath(locatorvalue);
						  break;
					  case "linktext":
						  by=By.linkText(locatorvalue);
						  break;
					  case "cssselector":
						  by=By.cssSelector(locatorvalue);
						  break;
					  case "tagname":
						  by=By.tagName(locatorvalue);
						  break;
				}
			}
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return by;
	}

}
