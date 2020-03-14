package com.utility;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Xls_dataProvider {

 static Workbook book;
 static Sheet sheet;
 
 public static String testdata_sheet_path = "C:\\Users\\reena\\Desktop\\testdata.xlsx";
 
 public static Object[][] getTestData(String sheetName){


Object[][] inputData= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
  for(int i=0; i<sheet.getLastRowNum();i++)
  {
   for( int j=0; j<sheet.getRow(0).getLastCellNum();j++)
   {
    inputData[i][j]= sheet.getRow(i+1).getCell(j).toString();
   }
  }
  return inputData;
  
    
  
  }
  
  
 }
 

