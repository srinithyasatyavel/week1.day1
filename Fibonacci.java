package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,c;
				int num2=1;
				System.out.println(num1);
				System.out.println(num2);
		for (int i = 0; i <=5; i++) {
			
			c=num1+num2;
			System.out.println(c);
			num1=num2;
			num2=c;
		}
	
		
			
		}

	}

