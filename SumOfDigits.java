package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		int q=0,r=0;
		int sum=0;
while(num!=0) {
			q=num/10;
			r=num%10;
			sum=sum+r;
			num=q;
			
			
			
			
		}

		System.out.println("sum of digits"  + sum);
	}

}
