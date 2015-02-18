
/**
 * 单例模式的实验
 * @author leon
 *
 */
public class Singleton {
	//1、私有构造函数
	private Singleton(){
		
	}
	
	//2、静态变量;唯一获取实例的入口，首次创建了单例
	public static Singleton instance = new Singleton();
	
}
