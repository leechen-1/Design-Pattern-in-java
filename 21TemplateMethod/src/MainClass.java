
public class MainClass {
	public static void main(String[] args) {
		MakeCar bus = new MakeBus();
//		bus.makeHead();
//		bus.makeBody();
//		bus.makeTail();
		bus.make();
		
		System.out.println("-------------------");
		
		MakeCar jeep = new MakeJeep();
//		jeep.makeHead();
//		jeep.makeBody();
//		jeep.makeTail();
		jeep.make();
		
		System.out.println("-------------------");
		
		MakeCar ka = new MakeKa();
		ka.make();
	}
}
