/*
 * 组装车
 */
public abstract class MakeCar {
	//组装车头
	public abstract void makeHead();
	
	//组装车身
	public abstract void makeBody();
	
	//组装车尾
	public abstract void makeTail();
	
	public void make() {
		this.makeHead();
		this.makeBody();
		this.makeTail();
	}
}
