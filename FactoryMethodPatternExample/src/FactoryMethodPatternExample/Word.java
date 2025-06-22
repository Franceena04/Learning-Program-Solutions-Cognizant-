package FactoryMethodPatternExample;

public class Word extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}