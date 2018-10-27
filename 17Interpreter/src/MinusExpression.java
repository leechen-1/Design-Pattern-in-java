
public class MinusExpression extends Expression {

	public void interpret(Context context) {
		System.out.println("×Ô¶¯µÝ¼õ");
		String input = context.getInput();
		int inInput = Integer.parseInt(input);
//		inInput--;
		--inInput;
		context.setInput(String.valueOf(inInput));
		context.setOutput(inInput);
	}

}
