package FactoryMethodPatternExample;

public class Pdf extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
