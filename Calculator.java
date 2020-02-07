package calculator;
class Calculator
{
	double a,b,result;
	char operator;
	Calculator(double a,double b, char operator)
	{
		this.a = a;
		this.b = b;
		this.operator = operator;
	}
	private double add(double a,double b)
	{
		return a+b;
	}
	private double sub(double a,double b)
	{
		return a-b;
	}
	private double mult(double a,double b)
	{
		return a*b;
	}
	private double div(double a,double b)
	{
		return a/b;
	}
	public double calculate()
	{
		switch(operator)
		{
			case '+':
				result = add(a,b);
				break;
			case '-':
				result = sub(a,b);
				break;
			case '*':
				result = mult(a,b);
				break;
			case '/':
				result = div(a,b);
				break;
				// operator doesn't match any case constant (+, -, *, /)
			default:
				System.out.printf("Error! operator is not correct");
				//return 0;
		}
		System.out.printf("%.1f %c %.1f = %.1f\n", a, operator, b, result);
		return 0;
	}
}
