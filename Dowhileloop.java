package myjava;

public class Dowhileloop {

	public static void main(String[] args) {
		int x=1,y=4;
		do {
			x*=y;
			y=y-1;
			
		}while(y>1);
		
		System.out.println("Factorial of 4 is "+x);

	}

}
