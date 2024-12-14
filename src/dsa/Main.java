package dsa;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("cpu");
		stack.push("board");
		stack.push("signal");
		stack.push("drive");
		stack.push("storage");
		
//		stack.pop();
//		stack.peek();
//		stack.search("storage");
		System.out.println(stack);
		
//		Uses of Stack
//		1. Redo/Undo features
//		2. Moving back and forward through browser history
//		3. backtracking algorithms (maze, directories)
//		4. Calling functions (Call stack)
		
	}

}
