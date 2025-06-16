package Test;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
		
		Scanner inputs=new Scanner(System.in);
		System.out.println("Please enter the num1");
		int num1=inputs.nextInt();
		System.out.println("Please enter the num2");
		int num2=inputs.nextInt();
		System.out.println("Please enter the num3");
		int num3=inputs.nextInt();
		if(num1>num2&&num1>num3)
		System.out.println("Num1 is greater"+num1);
		else if(num2>num1&&num2>num3)
		System.out.println("Num2 is greater"+num2);
		else
		System.out.println("Num3 is greater"+num3);

	}

}
