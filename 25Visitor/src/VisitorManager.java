
public class VisitorManager implements Visitor {

	public void visit(Park park) {
		System.out.println("管理员：负责" + park.getName() + "卫生检查");
	}

	public void visit(ParkA parkA) {
		System.out.println("管理员：负责公园"+ parkA.getName() +"部分卫生检查");
	}

	public void visit(ParkB parkB) {
		System.out.println("管理员：负责公园"+ parkB.getName() +"分部卫生检查");
	}

}
