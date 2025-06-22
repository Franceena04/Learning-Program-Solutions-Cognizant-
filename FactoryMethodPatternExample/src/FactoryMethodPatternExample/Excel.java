package FactoryMethodPatternExample;

public class Excel extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}