
public class MainClass {
	public static void main(String[] args) {
		FruitFactory ff = new NorthFruitFactory();
		Fruit apple = ff.getApple();
		apple.get();
		
		Fruit banana = ff.getBanana();
		banana.get();
		
		FruitFactory ff2= new SouthFruitFactory();
		Fruit apple2 = ff2.getApple();
		apple2.get();
		
		Fruit banana2 = ff2.getBanana();
		banana2.get();
		
		FruitFactory ff3 = new WenshiFruitFactory();
		Fruit apple3 = ff3.getApple();
		apple3.get();
		
		Fruit banana3 = ff3.getBanana();
		banana3.get();
	}
}
