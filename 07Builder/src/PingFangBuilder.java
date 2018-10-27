/*
 * 平房工程队
 */

public class PingFangBuilder implements HouseBuilder {
	House house = new House();
	
	public void makeFloor() {
		house.setFloor("平房-->地板");
	}

	public void makeHousetop() {
		house.setHousetop("平房-->房顶");
	}

	public void makeWall() {
		house.setWall("平房-->墙");
	}

	public House getHouse() {
		return house;
	}

}
