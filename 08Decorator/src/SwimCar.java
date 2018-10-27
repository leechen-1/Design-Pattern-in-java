
public class SwimCar implements Car{

	public void run() {
		System.out.println("可以跑");
	}

	public void Swim() {
		System.out.println("可以游");
	}
	
	public void show() {
		this.run();
		this.Swim();
	}

}
