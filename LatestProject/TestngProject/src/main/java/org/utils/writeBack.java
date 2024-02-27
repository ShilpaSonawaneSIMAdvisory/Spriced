package org.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeBack {
	


	    
	    
	                public void  writeToExcel(int rowNum, String str) throws IOException
	                	    {
	                		
	                	       
	                	            FileInputStream inputfile = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx");
	                	            File outputfile = new File(System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx");
	                	           
	                	                    XSSFWorkbook ObjWorkBook = new XSSFWorkbook(inputfile);
	                	                    XSSFSheet DriverTableSheet = ObjWorkBook.getSheetAt(0);
	                	                    
	                	                    XSSFRow row1 = DriverTableSheet.getRow(rowNum);
	                	                    
	                	                    XSSFCell cell = row1.getCell(CellReference.convertColStringToIndex("C"));
	                	                    if (cell == null) {
	                	                     
	                	                        cell = row1.createCell(CellReference.convertColStringToIndex("C")); 
	                	                    }
	                	                   // String str = "Abc";
	                	                    cell.setCellValue(str);

	                	                     FileOutputStream out1 = new FileOutputStream (System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx",false);
	                	                     ObjWorkBook.write(out1);
	                	                    inputfile.close();
	                	                    

	                	              
	                	            }
	                public void  writeToExcelNewSegmentValue(int rowNum, String str) throws IOException
            	    {
            		
            	       
            	            FileInputStream inputfile = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx");
            	            File outputfile = new File(System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx");
            	           
            	                    XSSFWorkbook ObjWorkBook = new XSSFWorkbook(inputfile);
            	                    XSSFSheet DriverTableSheet = ObjWorkBook.getSheetAt(0);
            	                    
            	                    XSSFRow row1 = DriverTableSheet.getRow(rowNum);
            	                    
            	                    XSSFCell cell = row1.getCell(CellReference.convertColStringToIndex("B"));
            	                    if (cell == null) {
            	                     
            	                        cell = row1.createCell(CellReference.convertColStringToIndex("B")); 
            	                    }
            	                   // String str = "Abc";
            	                    cell.setCellValue(str);

            	                     FileOutputStream out1 = new FileOutputStream (System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx",false);
            	                     ObjWorkBook.write(out1);
            	                    inputfile.close();
            	                    

            	              
            	            }
	                	       
	                public void  writeToExcelActualResult(int rowNum, String str) throws IOException
                    {
                    
                       
                            FileInputStream inputfile = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx");
                            File outputfile = new File(System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx");
                           
                                    XSSFWorkbook ObjWorkBook = new XSSFWorkbook(inputfile);
                                    XSSFSheet DriverTableSheet = ObjWorkBook.getSheetAt(0);
                                    
                                    XSSFRow row1 = DriverTableSheet.getRow(rowNum);
                                    
                                    XSSFCell cell = row1.getCell(CellReference.convertColStringToIndex("E"));
                                    if (cell == null) {
                                     
                                        cell = row1.createCell(CellReference.convertColStringToIndex("E")); 
                                    }
                                   // String str = "Abc";
                                    cell.setCellValue(str);

                                     FileOutputStream out1 = new FileOutputStream (System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx",false);
                                     ObjWorkBook.write(out1);
                                    inputfile.close();
                                    

                              
                            }
	                  
	                public void  writeToExcelListOfElements(int rowNum, String str) throws IOException
                    {
                    
                       
                            FileInputStream inputfile = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx");
                            File outputfile = new File(System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx");
                           
                                    XSSFWorkbook ObjWorkBook = new XSSFWorkbook(inputfile);
                                    XSSFSheet DriverTableSheet = ObjWorkBook.getSheetAt(0);
                                    
                                    XSSFRow row1 = DriverTableSheet.getRow(rowNum);
                                    
                                    XSSFCell cell = row1.getCell(CellReference.convertColStringToIndex("F"));
                                    if (cell == null) {
                                     
                                        cell = row1.createCell(CellReference.convertColStringToIndex("F")); 
                                    }
                                   // String str = "Abc";
                                    cell.setCellValue(str);

                                     FileOutputStream out1 = new FileOutputStream (System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx",false);
                                     ObjWorkBook.write(out1);
                                    inputfile.close();
                                    

                              
                            }
	                
	                public void  writeToExcelListOfSegmentedElements(int rowNum, String str) throws IOException
                    {
                    
                       
                            FileInputStream inputfile = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx");
                            File outputfile = new File(System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx");
                           
                                    XSSFWorkbook ObjWorkBook = new XSSFWorkbook(inputfile);
                                    XSSFSheet DriverTableSheet = ObjWorkBook.getSheetAt(0);
                                    
                                    XSSFRow row1 = DriverTableSheet.getRow(rowNum);
                                    
                                    XSSFCell cell = row1.getCell(CellReference.convertColStringToIndex("G"));
                                    if (cell == null) {
                                     
                                        cell = row1.createCell(CellReference.convertColStringToIndex("G")); 
                                    }
                                   // String str = "Abc";
                                    cell.setCellValue(str);

                                     FileOutputStream out1 = new FileOutputStream (System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx",false);
                                     ObjWorkBook.write(out1);
                                    inputfile.close();
                                    

                              
                            }
	                public void  writeToExcelListOfAttributesPart(int rowNum, String str) throws IOException
                    {
                    
                       
                            FileInputStream inputfile = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx");
                            File outputfile = new File(System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx");
                           
                                    XSSFWorkbook ObjWorkBook = new XSSFWorkbook(inputfile);
                                    XSSFSheet DriverTableSheet = ObjWorkBook.getSheetAt(0);
                                    
                                    XSSFRow row1 = DriverTableSheet.getRow(rowNum);
                                    
                                    XSSFCell cell = row1.getCell(CellReference.convertColStringToIndex("H"));
                                    if (cell == null) {
                                     
                                        cell = row1.createCell(CellReference.convertColStringToIndex("H")); 
                                    }
                                   // String str = "Abc";
                                    cell.setCellValue(str);

                                     FileOutputStream out1 = new FileOutputStream (System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx",false);
                                     ObjWorkBook.write(out1);
                                    inputfile.close();
                                    

                              
                            }
	                public void  writeToExcelListOfAttributesSegment(int rowNum, String str) throws IOException
                    {
                    
                       
                            FileInputStream inputfile = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx");
                            File outputfile = new File(System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx");
                           
                                    XSSFWorkbook ObjWorkBook = new XSSFWorkbook(inputfile);
                                    XSSFSheet DriverTableSheet = ObjWorkBook.getSheetAt(0);
                                    
                                    XSSFRow row1 = DriverTableSheet.getRow(rowNum);
                                    
                                    XSSFCell cell = row1.getCell(CellReference.convertColStringToIndex("I"));
                                    if (cell == null) {
                                     
                                        cell = row1.createCell(CellReference.convertColStringToIndex("I")); 
                                    }
                                   // String str = "Abc";
                                    cell.setCellValue(str);

                                     FileOutputStream out1 = new FileOutputStream (System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx",false);
                                     ObjWorkBook.write(out1);
                                    inputfile.close();
                                    

                              
                            }
	                
	                public void  writeToExcelListOfActualElements(int rowNum, String str) throws IOException
                    {
                    
                       
                            FileInputStream inputfile = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\xrefToPartTable.xlsx");
                            File outputfile = new File(System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx");
                           
                                    XSSFWorkbook ObjWorkBook = new XSSFWorkbook(inputfile);
                                    XSSFSheet DriverTableSheet = ObjWorkBook.getSheetAt(0);
                                    
                                    XSSFRow row1 = DriverTableSheet.getRow(rowNum);
                                    
                                    XSSFCell cell = row1.getCell(CellReference.convertColStringToIndex("H"));
                                    if (cell == null) {
                                     
                                        cell = row1.createCell(CellReference.convertColStringToIndex("H")); 
                                    }
                                   // String str = "Abc";
                                    cell.setCellValue(str);

                                     FileOutputStream out1 = new FileOutputStream (System.getProperty("user.dir")+"\\Test data\\xrefToPartTable.xlsx",false);
                                     ObjWorkBook.write(out1);
                                    inputfile.close();
                                    

                              
                            }
                    
                    public void  writeToExcelResult(int rowNum, String str) throws IOException
                    {
                    
                       
                            FileInputStream inputfile = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\xrefToPartTable.xlsx");
                            File outputfile = new File(System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx");
                           
                                    XSSFWorkbook ObjWorkBook = new XSSFWorkbook(inputfile);
                                    XSSFSheet DriverTableSheet = ObjWorkBook.getSheetAt(0);
                                    
                                    XSSFRow row1 = DriverTableSheet.getRow(rowNum);
                                    
                                    XSSFCell cell = row1.getCell(CellReference.convertColStringToIndex("I"));
                                    if (cell == null) {
                                     
                                        cell = row1.createCell(CellReference.convertColStringToIndex("I")); 
                                    }
                                   // String str = "Abc";
                                    cell.setCellValue(str);

                                     FileOutputStream out1 = new FileOutputStream (System.getProperty("user.dir")+"\\Test data\\xrefToPartTable.xlsx",false);
                                     ObjWorkBook.write(out1);
                                    inputfile.close();
                                    

                              
                            }
                    public void  writeToExcelResultLocalSegemnt(int rowNum, String str) throws IOException
                    {
                    
                       
                            FileInputStream inputfile = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\localsegment.xlsx");
                            File outputfile = new File(System.getProperty("user.dir")+"\\Test data\\localsegment.xlsx");
                           
                                    XSSFWorkbook ObjWorkBook = new XSSFWorkbook(inputfile);
                                    XSSFSheet DriverTableSheet = ObjWorkBook.getSheetAt(0);
                                    
                                    XSSFRow row1 = DriverTableSheet.getRow(rowNum);
                                    
                                    XSSFCell cell = row1.getCell(CellReference.convertColStringToIndex("B"));
                                    if (cell == null) {
                                     
                                        cell = row1.createCell(CellReference.convertColStringToIndex("B")); 
                                    }
                                   // String str = "Abc";
                                    cell.setCellValue(str);

                                     FileOutputStream out1 = new FileOutputStream (System.getProperty("user.dir")+"\\Test data\\localsegment.xlsx",false);
                                     ObjWorkBook.write(out1);
                                    inputfile.close();
                                    

                              //
                            }
                    public void  writeToExcelResultDnPricingAction(int rowNum, String str) throws IOException
                    {
                    
                       
                            FileInputStream inputfile = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\DnSetPricing.xlsx");
                            File outputfile = new File(System.getProperty("user.dir")+"\\Test data\\localsegment.xlsx");
                           
                                    XSSFWorkbook ObjWorkBook = new XSSFWorkbook(inputfile);
                                    XSSFSheet DriverTableSheet = ObjWorkBook.getSheetAt(0);
                                    
                                    XSSFRow row1 = DriverTableSheet.getRow(rowNum);
                                    
                                    XSSFCell cell = row1.getCell(CellReference.convertColStringToIndex("C"));
                                    if (cell == null) {
                                     
                                        cell = row1.createCell(CellReference.convertColStringToIndex("C")); 
                                    }
                                   // String str = "Abc";
                                    cell.setCellValue(str);

                                     FileOutputStream out1 = new FileOutputStream (System.getProperty("user.dir")+"\\Test data\\DnSetPricing.xlsx",false);
                                     ObjWorkBook.write(out1);
                                    inputfile.close();
                          
                            }
                          public void  writeToExcelResultDnFutureEffectiveDate(int rowNum, String str) throws IOException
                    {
                    
                       
                            FileInputStream inputfile = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\DnSetPricing.xlsx");
                            File outputfile = new File(System.getProperty("user.dir")+"\\Test data\\localsegment.xlsx");
                           
                                    XSSFWorkbook ObjWorkBook = new XSSFWorkbook(inputfile);
                                    XSSFSheet DriverTableSheet = ObjWorkBook.getSheetAt(0);
                                    
                                    XSSFRow row1 = DriverTableSheet.getRow(rowNum);
                                    
                                    XSSFCell cell = row1.getCell(CellReference.convertColStringToIndex("D"));
                                    if (cell == null) {
                                     
                                        cell = row1.createCell(CellReference.convertColStringToIndex("D")); 
                                    }
                                   // String str = "Abc";
                                    cell.setCellValue(str);

                                     FileOutputStream out1 = new FileOutputStream (System.getProperty("user.dir")+"\\Test data\\DnSetPricing.xlsx",false);
                                     ObjWorkBook.write(out1);
                                    inputfile.close();
                          
                            }
                          
                          
                          public void  writeToExcelRegion(int rowNum, String str) throws IOException
                          {
                          
                             
                                  FileInputStream inputfile = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\DnSetPricing.xlsx");
                                  File outputfile = new File(System.getProperty("user.dir")+"\\Test data\\localsegment.xlsx");
                                 
                                          XSSFWorkbook ObjWorkBook = new XSSFWorkbook(inputfile);
                                          XSSFSheet DriverTableSheet = ObjWorkBook.getSheetAt(0);
                                          
                                          XSSFRow row1 = DriverTableSheet.getRow(rowNum);
                                          
                                          XSSFCell cell = row1.getCell(CellReference.convertColStringToIndex("B"));
                                          if (cell == null) {
                                           
                                              cell = row1.createCell(CellReference.convertColStringToIndex("B")); 
                                          }
                                         // String str = "Abc";
                                          cell.setCellValue(str);

                                           FileOutputStream out1 = new FileOutputStream (System.getProperty("user.dir")+"\\Test data\\DnSetPricing.xlsx",false);
                                           ObjWorkBook.write(out1);
                                          inputfile.close();
                                
                                  }
                          
                          public void  writeToExcelDnPricingElements(int rowNum, String str) throws IOException
                          {
                          
                             
                                  FileInputStream inputfile = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\DnSetPricing.xlsx");
                                  File outputfile = new File(System.getProperty("user.dir")+"\\Test data\\localsegment.xlsx");
                                 
                                          XSSFWorkbook ObjWorkBook = new XSSFWorkbook(inputfile);
                                          XSSFSheet DriverTableSheet = ObjWorkBook.getSheetAt(0);
                                          
                                          XSSFRow row1 = DriverTableSheet.getRow(rowNum);
                                          
                                          XSSFCell cell = row1.getCell(CellReference.convertColStringToIndex("C"));
                                          if (cell == null) {
                                           
                                              cell = row1.createCell(CellReference.convertColStringToIndex("C")); 
                                          }
                                         // String str = "Abc";
                                          cell.setCellValue(str);

                                           FileOutputStream out1 = new FileOutputStream (System.getProperty("user.dir")+"\\Test data\\DnSetPricing.xlsx",false);
                                           ObjWorkBook.write(out1);
                                          inputfile.close();
                                
                                  }
	                }





	
	


