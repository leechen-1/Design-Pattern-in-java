
public class MainClass {
	public static void main(String[] args) {
		Person person = new Person();
		//×¢²á¹Û²ìÕß
		person.addObserver(new MyObServer());
		person.addObserver(new MyObServer());
		System.out.println(person.countObservers());
		person.setName("lifengxing");
		person.setAge(23);
		person.setSex("ÄÐ");
	}
}
