package ejercicio;

public class pop {
	int max;
	int top;
	public char [] stack;
	
	public pop(int stackSize) {
		this.stack=new char[stackSize];
		this.max=this.stack.length;
		this.top=0;
	}

	public void Push(char value){

	     if(top==max){

	       System.out.println("FUERA !!!");

	       return;

	     }

	     stack[top]= value;

	     top++;

	}
	
	public void pop() {
		if(top == 0) {
			System.out.println("El stack esta vacio");

			} 
		else {
				System.out.println("El valor borrado fue: "+stack[(top-1)]);
				stack[(top-1)] = 0;
				top--;
		}
	}
}
	
