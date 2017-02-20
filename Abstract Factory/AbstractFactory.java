/**
 * 抽象工厂的接口，声明创建抽象产品对象的操作
 * @author kylin
 *
 */
public interface AbstractFactory {
	public AbstractProductA createProductA();
	
	public AbstractProductB createProductB();
}
