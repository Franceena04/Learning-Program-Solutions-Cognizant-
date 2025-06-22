package FactoryMethodPatternExample;

public class WordDocument implements Document {
	@Override
	public void Create()
	{
		System.out.println("Creating a Word Document");
	}

}
