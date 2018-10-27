
public class Person4 {
	private String name;
	private static Person4 person;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//构造函数私有化
	private Person4() {
	}
	
	//提供一个全局的静态方法
	public static Person4 getPerson() {
		if(person == null) {
			synchronized (Person4.class) {
				if(person == null) {
					person = new Person4();
				}
			}
			
		}
		return person;
	}
}
