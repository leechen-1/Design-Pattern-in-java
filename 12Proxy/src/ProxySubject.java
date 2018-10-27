
public class ProxySubject implements Subject{
	private RealSubject realSubject;

	public void sailBook() {
		dazhe();
		if(realSubject == null) {
			realSubject = new RealSubject();
		}
		realSubject.sailBook();
		give();
	}
	
	public void dazhe() {
		System.out.println("´òÕÛ");
	}
	
	public void give() {
		System.out.println("ÔùËÍ´ú½ğÈ¯");
	}
}
