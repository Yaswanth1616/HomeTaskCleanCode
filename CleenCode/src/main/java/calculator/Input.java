package calculator;
import java.util.Scanner;
public class Input {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number : ");
		int num1=sc.nextInt();
		System.out.println("Enter Second number : ");
		int num2=sc.nextInt();
		System.out.println("Enter operator : ");
		String s=sc.next();
		Calculate object=new Calculate();
		if(s.equals("+"))
		{
			System.out.println("The sum of two numbers is "+object.add(num1,num2));
		}
		else if(s.equals("-"))
		{
			System.out.println("The diffrence of two numbers is "+object.sub(num1,num2));
		}
		else if(s.equals("*"))
		{
			System.out.println("The product of two numbers is "+object.multiply(num1,num2));
		}
		else if(s.equals("/"))
		{
			System.out.println("The division of two numbers is "+object.divide(num1,num2));
		}
		else
		{
			System.out.println("Invalid operator please enter any of +,-,*,/ operators");
		}
	}
}