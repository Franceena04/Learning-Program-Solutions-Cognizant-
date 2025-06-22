package SingletonPatternExample;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        
        if (l1==l2)
        	System.out.println("Both l1 and l2 refer to same instance");
        else
        	System.out.println("Both l1 and l2 refer to different instance");
	}

}
