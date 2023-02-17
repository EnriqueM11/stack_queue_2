package ejercicio;

import java.util.Stack;

public class palindromo {
	public static boolean esPalindromo(String entrada) {
        Stack<Character> stack = new Stack<>();
        for (char c : entrada.toCharArray()) {
            stack.push(c);
        }
        StringBuilder c = new StringBuilder();
        while (!stack.isEmpty()) {
            c.append(stack.pop());
        }
        return entrada.equals(c.toString());
    }

}
