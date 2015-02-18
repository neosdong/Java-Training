import org.omg.CORBA.PUBLIC_MEMBER;


public class TestSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton s01 = Singleton.getInstance();
		Singleton s02 = Singleton.getInstance();
		
		if (s01==s02) {
			System.out.println("s01 and s02 refer the same instance.");
		}
	}

}
