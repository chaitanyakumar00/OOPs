package myjava;
import java.util.*;
public class Userinput {

	public static void main(String[] args) {
		String Name;
		int Age;
		float Weight;
		Scanner input = new Scanner(System.in);
		System.out.println("Name: ");
		Name= input.next();
		System.out.println("Age: ");
		Age = input.nextInt();
		System.out.println("Weight: ");
		Weight= input.nextFloat();
		
		System.out.println("Name: " + Name +" \nAge: " + Age + "\nWeight: "+ Weight);
		
		input.close();
		

	}

}
