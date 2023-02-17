package ejercicio;

import java.util.Stack;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 pop metodo = new pop(5);
		 
		 metodo.Push('8');
		 metodo.Push('6');
		 metodo.Push('4');
		 metodo.Push('2');
		 metodo.Push('1');
		 
		 for(int i=0; i<metodo.stack.length;i++) {
			 System.out.println(metodo.stack[i]);
		 }
		 
		 metodo.pop();
		 metodo.pop();
		 
		 String entrada = "pollo";
		    String alreves = invertir.invertirstring(entrada);
		    System.out.println(alreves);
		    
		    String palabra= "oso";
		    String palabra_2 = "arbol";
		    boolean esPalindromo1 = palindromo.esPalindromo(palabra);
		    boolean esPalindromo2 = palindromo.esPalindromo(palabra_2);
		    System.out.println(esPalindromo1);
		    System.out.println(esPalindromo2);
		 	 
	}
	
}
