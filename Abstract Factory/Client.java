
public class Client {
	public static void main(String[] args) {
		AbstractFactory abstractFactory = new ConcreteFactory1();
		
		ComputerEngineer computerEngineer = new ComputerEngineer();
		computerEngineer.makeComputer(abstractFactory);
	}
}
