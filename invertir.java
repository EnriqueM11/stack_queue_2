package ejercicio;

import java.util.Stack;

public class invertir {

	public static String invertirstring(String entrada) {
        Stack<Character> stack = new Stack<>();
        for (char c : entrada.toCharArray()) {
            stack.push(c);
        }
        StringBuilder construye = new StringBuilder();
        while (!stack.isEmpty()) {
            construye.append(stack.pop());
        }
        return construye.toString();
    }
}
