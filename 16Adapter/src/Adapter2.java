
public class Adapter2 {
	private Current current;
	
	public Adapter2(Current current) {
		this.current = current;
	}
	
	public void use18V() {
		System.out.println("Ê¹ÓÃÊÊÅäÆ÷");
		this.current.use220V();
	}
}
