package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet_handling1 {

	public void excel() throws EncryptedDocumentException, IOException  
	{
		String excelpath =  "D:\\Apacheexcellsheet\\apache.xlsx\\";
		for(int i=0; i<3; i++)
		{
			for(int j =0; j<3; j++)
			{
				FileInputStream s = new FileInputStream(excelpath);
				String value = WorkbookFactory.create(s).getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.print(" "+value);
			}
			System.out.println();
		}

		System.out.println("--");

		
		for(int i =0; i<3; i++)
		{
			for(int j =0; j<3; j++)
			{
				FileInputStream s = new FileInputStream(excelpath);
				String value = WorkbookFactory.create(s).getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.println(" "+value);
			}
		}
		
		System.out.println("-----------------------");	
		
		for(int j =0; j<3; j++)
		{
			for(int i=0; i<3; i++)
			{
				FileInputStream s = new FileInputStream(excelpath);
				String value = WorkbookFactory.create(s).getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.print(" "+value);
			}

			System.out.println();

		}
	}

	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		Excelsheet_handling1 r = new Excelsheet_handling1();
		r.excel();
	}

}
