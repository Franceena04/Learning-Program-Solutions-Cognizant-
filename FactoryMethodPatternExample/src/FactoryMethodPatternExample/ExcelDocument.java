package FactoryMethodPatternExample;

public class ExcelDocument implements Document{
	@Override
	public void Create()
	{
		System.out.println("Creating a Excel Document");
	}

}
