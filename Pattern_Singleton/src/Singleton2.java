/**
 * 懒汉模式:第一次调用getInstance才创建。
 * @author leon
 *
 */
public class Singleton2 {
	private Singleton2(){}
	
	private static Singleton2 instance;
	
	public static Singleton2 getInstance(){
		if (instance==null) {
			instance = new Singleton2();
		}
		return instance;
	}

}
