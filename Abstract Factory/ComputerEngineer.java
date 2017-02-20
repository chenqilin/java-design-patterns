
public class ComputerEngineer {
	AbstractProductA abstractProductA = null;
	AbstractProductB abstractProductB = null;
	
	public void makeComputer(AbstractFactory abstractFactory) {
		prepareHardwares(abstractFactory);
	}
	
	private void prepareHardwares(AbstractFactory abstractFactory) {
		this.abstractProductA = abstractFactory.createProductA();
		this.abstractProductB = abstractFactory.createProductB();
	}
}
