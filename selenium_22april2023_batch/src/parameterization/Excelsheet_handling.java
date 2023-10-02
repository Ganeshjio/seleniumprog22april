package parameterization;

	import java.io.FileInputStream;

	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.CellType;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class Excelsheet_handling {

		public static void main(String[] args) throws EncryptedDocumentException, IOException {

			String excelPath = "D:\\Apacheexcellsheet\\apache.xlsx\\";
			// Paramerization - Fetching and Retriving the test data from outside source(Excel sheet)
			//into the selenium test script
			// No - Selenium Automates Browser that's it !!

			// Step 1 - we handle file using Java File Class
			// Step 2 - We configure the Apachi POI Lib into our project
			// Step 3 - We take excel sheet which consist of test data
			// Step 4 - We provide path of the located excel sheet
			// Step 5 - As we want to fetch/take input --> we use FileInputStream class
			// Step 6 - As we want to retrieve or send the data from code to excel sheet -> we use FileOutputStream class
			// Step 7 - Reading of Spreadsheet
			// Step 8 - As we have multiple sheets present in a Spreadsheet we need to switch on necessary sheet
			// Step 9 - Reading the Row and Column
			// Step 10 - Will take it in our code

			FileInputStream s = new FileInputStream(excelPath);
				String value = WorkbookFactory.create(s).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
					System.out.println("Test Data is = "+ value);
			//double value = WorkbookFactory.create(s).getSheet("Sheet2").getRow(0).getCell(0).getNumericCellValue();
			//System.out.println("Test Data is = "+ value);
			//		CellType value = WorkbookFactory.create(s).getSheet("Sheet1").getRow(0).getCell(0).getCellType();
			//		System.out.println("Row and Column Type is = "+ value);

					/*for(int i=1; i<=3; i++)
					{ 						
						for(int j=0; j<=3; j++)
						{  FileInputStream s = new FileInputStream(excelPath);
							String value = WorkbookFactory.create(s).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
							System.out.println(" "+ value);
						
						}
						System.out.println();
					}
*/
			//Boss1	 Boss2	Boss3
			//Cross1 Cross2	Cross3
			//Soos1	 Soos2	Soos3


			//		Boss1	
			//		Boss2	
			//		Boss3
			//		Cross1	
			//		Cross2	
			//		Cross3
			//		Soos1	
			//		Soos2	
			//		Soos3

			//		Boss1	Cross1	Soos1		
			//		Boss2	Cross2	Soos2
			//		Boss3	Cross3  Soos3

		}

	}


