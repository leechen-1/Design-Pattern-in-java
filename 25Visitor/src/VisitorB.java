/*
 * 清洁工B，负责公园B部分的卫生
 */
public class VisitorB implements Visitor {

	public void visit(Park park) {

	}

	public void visit(ParkA parkA) {

	}

	public void visit(ParkB parkB) {
		System.out.println("清洁工B:完成公园" + parkB.getName()+"的卫生");
	}

}
