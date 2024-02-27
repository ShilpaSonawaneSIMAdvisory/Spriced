package org.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetTestData {
    
    
                public String getTestData(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
                    
                   // FileInputStream file = new FileInputStream("C:\\Users\\nirmala.j_simadvisor\\Documents\\exceldata");
                	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx");
                    Sheet sheet = WorkbookFactory.create(file).getSheet("010Part");
                    String value = sheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
                    
                    return value;
                }
                
                public String getTestDataPreSegmentation(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
                    
                    // FileInputStream file = new FileInputStream("C:\\Users\\nirmala.j_simadvisor\\Documents\\exceldata");
                 	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\ExplorerTestData.xlsx");
                     Sheet sheet = WorkbookFactory.create(file).getSheet("preSegmentation");
                     String value = sheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
                     
                     return value;
                 }
                
                
                public String getTestDataModel(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
                    
                    // FileInputStream file = new FileInputStream("C:\\Users\\nirmala.j_simadvisor\\Documents\\exceldata");
                     FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\Model.xlsx");
                     Sheet sheet = WorkbookFactory.create(file).getSheet("Model");
                     String value = sheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
                     
                     return value;
                 }
                

               public String getTestDataEntity(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
                    
                    // FileInputStream file = new FileInputStream("C:\\Users\\nirmala.j_simadvisor\\Documents\\exceldata");
                     FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\Entity.xlsx");
                     Sheet sheet = WorkbookFactory.create(file).getSheet("entity");
                     String value = sheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
                     
                     return value;
                 }
               
                public String getTestDataBulkUpload(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
                   
                   // FileInputStream file = new FileInputStream("C:\\Users\\nirmala.j_simadvisor\\Documents\\exceldata");
                	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\BulkUpload.xlsx");
                    Sheet sheet = WorkbookFactory.create(file).getSheet("bulkupload");
                    String value = sheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
                    
                    return value;
                }

                    public String getTestDataRules(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
                    
                    // FileInputStream file = new FileInputStream("C:\\Users\\nirmala.j_simadvisor\\Documents\\exceldata");
                 	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\RuleTestData.xlsx");
                     Sheet sheet = WorkbookFactory.create(file).getSheet("SampleRule");
                     String value = sheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
                     
                     return value;
                 }
                    public String getTestDataXrefToPart(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
                        
                        // FileInputStream file = new FileInputStream("C:\\Users\\nirmala.j_simadvisor\\Documents\\exceldata");
                     	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\xrefToPartTable.xlsx");
                         Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
                         String value = sheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
                         
                         return value;
                     }
                     public String getTestDataLocalSegment(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
                        
                        // FileInputStream file = new FileInputStream("C:\\Users\\nirmala.j_simadvisor\\Documents\\exceldata");
                     	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\localsegment.xlsx");
                         Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
                         String value = sheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
                         
                         return value;
                     }
                     public String getTestDataDnPricingAction(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
                         
                         // FileInputStream file = new FileInputStream("C:\\Users\\nirmala.j_simadvisor\\Documents\\exceldata");
                      	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\DnSetPricing.xlsx");
                          Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
                          String value = sheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
                          
                          return value;
                      }
                     
                     public String getTestDataDnPricingUpdate(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
                         
                         // FileInputStream file = new FileInputStream("C:\\Users\\nirmala.j_simadvisor\\Documents\\exceldata");
                      	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\dnPricingUpdate.xlsx");
                          Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
                          String value = sheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
                          
                          return value;
                      }
                     
                     public String getTestDataDnPricingSeed(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
                         
                         // FileInputStream file = new FileInputStream("C:\\Users\\nirmala.j_simadvisor\\Documents\\exceldata");
                      	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\dnPricingSeed.xlsx");
                          Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
                          String value = sheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
                          
                          return value;
                      }
                     
                     public String getTestDataDnPricingSetApproval(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
                         
                         // FileInputStream file = new FileInputStream("C:\\Users\\nirmala.j_simadvisor\\Documents\\exceldata");
                      	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\DnPricingSetApprovals.xlsx");
                          Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
                          String value = sheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
                          
                          return value;
                      }
                     
                     public String getTestDataRegionalCalculatePrice(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
                         
                         // FileInputStream file = new FileInputStream("C:\\Users\\nirmala.j_simadvisor\\Documents\\exceldata");
                      	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\DnPricingSetApprovals.xlsx");
                          Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
                          String value = sheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
                          
                          return value;
                      }
                     
                     
                  
                     
                    
}
