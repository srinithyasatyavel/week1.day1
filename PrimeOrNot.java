package week1.day1;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13; 
		boolean isPrime=false;
		for(int i=2;i<=n/2;i++)
		{
			
			if(n%i==0)
			{
				
				System.out.println("its not prime" +n);
				break;
		}
			isPrime=true;
			
		if(n%i!=0)
			{
				System.out.println("its prime" +n);
			}
			isPrime=false;
		
		//while(n%2==0)
		//{
		//	isPrime=true;
		//	System.out.println("not a prime" +n);
		//	break;
			
		//}
		//System.out.println("its a prime" +n);

	}
	}

}
