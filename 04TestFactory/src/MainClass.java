import java.util.Scanner;


public class MainClass {
	public static void main(String[] args) {
		//1.接受控制台输入
		System.out.println("---计算器程序---");
		System.out.println("输入第一个操作数");
		Scanner scanner = new Scanner(System.in);
		String strNum1 = scanner.nextLine();
		
		System.out.println("输入运算符");
		String oper = scanner.nextLine();
		
		System.out.println("输入第二个操作数");
		String strNum2 = scanner.nextLine();
		double result = 0;
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		
		//2.进行运算
		if("+".equals(oper)) {
			OperationFactory factory = new AddOperationFactory();
			Operation operation = factory.getOperation();
			operation.setNum1(num1);
			operation.setNum2(num2);
			result = operation.getResult();
		}
		
		//3.返回结果
		System.out.println(strNum1 + oper + strNum2 + "=" + result);
	}
}
