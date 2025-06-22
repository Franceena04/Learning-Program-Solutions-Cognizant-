package FactoryMethodPatternExample;

public class Test {
    public static void main(String[] args) {
    	DocumentFactory word = new Word();
    	Document WordDocument = word.createDocument();
    	WordDocument.Create();
    	
    	DocumentFactory pdf = new Pdf();
    	Document PdfDocument = pdf.createDocument();
    	PdfDocument.Create();
    	
    	DocumentFactory excel = new Excel();
    	Document  ExcelDocument = excel.createDocument();
    	ExcelDocument.Create();
    	
    }

}
