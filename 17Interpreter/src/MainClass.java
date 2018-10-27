import java.util.ArrayList;
import java.util.List;

/*
 * client
 */
public class MainClass {
	public static void main(String[] args) {
		String number = "20";
		Context context = new Context(number);
		
//		Expression expression1 = new MinusExpression();
//		expression1.interpret(context);
//		System.out.println(context.getOutput());
//		
//		Expression expression2 = new PlusExpression();
//		expression2.interpret(context);
//		System.out.println(context.getOutput());
//		
//		Expression expression3 = new PlusExpression();
//		expression3.interpret(context);
//		System.out.println(context.getOutput());
//		
//		Expression expression4 = new PlusExpression();
//		expression4.interpret(context);
//		System.out.println(context.getOutput());
		
		List<Expression> list = new ArrayList<Expression>();
		list.add(new PlusExpression());
		list.add(new PlusExpression());
		list.add(new MinusExpression());
		list.add(new MinusExpression());
		list.add(new MinusExpression());
		list.add(new MinusExpression());
		
		for(Expression ex : list) {
			ex.interpret(context);
			System.out.println(context.getOutput());
		}
	}
}
