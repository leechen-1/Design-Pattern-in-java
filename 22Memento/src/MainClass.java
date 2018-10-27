
public class MainClass {
	public static void main(String[] args) {
		Person per = new Person("lifengxing","男",30);
		
		//保存内部状态
		Person backup = new Person();
		backup.setName(per.getName());
		backup.setAge(per.getAge());
		backup.setSex(per.getSex());
		
		per.display();
		
		//修改
		per.setAge(20);
		per.display();
		
		//回滚 还原
		per.setName(backup.getName());
		per.setSex(backup.getSex());
		per.setAge(backup.getAge());
		
		per.display();
		
	}
}
