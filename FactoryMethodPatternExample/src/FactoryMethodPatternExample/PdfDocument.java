package FactoryMethodPatternExample;

public class PdfDocument implements Document{
	@Override
	public void Create()
	{
		System.out.println("Creating a PDF Document");
	}

}
