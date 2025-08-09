package myjava;
import java.util.Scanner;
public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
		
		Scanner input = new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		int d=a+b+c;
		int per=d/3;
		if(per>80) {
			System.out.println("Distinction");
		}else if(per<80 && per>=70) {
			System.out.println("good marks");

		}else if(per<70 && per>=50) {
			System.out.println("Avg marks");

		}else if(per<50) {
			System.out.println("Fail");

		}
           input.close();


	}

}
