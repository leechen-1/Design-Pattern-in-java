/*
 * 公园的A部分
 */
public class ParkA implements ParkElement {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
