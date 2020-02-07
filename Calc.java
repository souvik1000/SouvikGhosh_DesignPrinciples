package calculator;
import calculator.*;
import java.util.*;
import java.lang.*;
public class Calc
{
	public static void main(String[] args)
	{
		
		Scanner scancopy = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int first = scancopy.nextInt();
		int second = scancopy.nextInt();
		System.out.print("Enter an operator (+, -, *, /) : ");
        char operator = scancopy.next().charAt(0);
		Calculator obj = new Calculator(first,second,operator);
		obj.calculate();
	}
}