package wee1.day2;

public class Calculator {
	int sum;
	int diff;
	double mul;
	float div;
	
	public int add(int num1,int num2,int num3)
	{
		
		System.out.println("Addition of three numbers :" +num1 +" "  +num2 +" "  +num3);
		sum=num1+num2+num3;
		return sum;
		
	}
	
	public int sub(int num1,int num2) {
		System.out.println("Subtration of two numbers :" +num1 +" " +num2);
		diff=num1-num2;
		return diff;
	}
	public double mul(double num1,double num2) {
		System.out.println("Multiplication of two number:" +num1 +" " +num2);
		mul=num1*num2;
		return mul;
	}
	public float div(float num1,float num2) {
		System.out.println("Division of two number:" +num1 +" " +num2);
		div=num1/num2;
		return div;
	}

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		System.out.println("Answer : " + calc.add(44,55,66));
		System.out.println();
		System.out.println("Answer : " +calc.sub(100,50));
		System.out.println();
		System.out.println("Answer : " +calc.mul(129.90,12.08));
		System.out.println();
		System.out.println("Answer : " +calc.div(45600.222f,88888.8888f));
	
		
		
		// TODO Auto-generated method stub

	}

}
