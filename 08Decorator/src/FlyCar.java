
public class FlyCar implements Car {

	public void show() {
		this.run();
		this.fly();
	}

	public void run() {
		System.out.println("可以跑");
	}
	
	public void fly() {
		System.out.println("可以飞");
	}
}
