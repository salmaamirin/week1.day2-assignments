package wee1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input=153;
		int cal=0;
		int org=input;
		int rem;
		
		while(input>0) {
			rem=input%10;
			input=input/10;
			cal=cal+(rem*rem*rem);
		}
		if(cal==org) {
			System.out.println("It ia an armstrong number");
		}
		else {
			System.out.println("It is not armstrong number");
		}
		// TODO Auto-generated method stub

	}

}
