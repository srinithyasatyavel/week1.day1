package week2.day2;

import java.util.Arrays;

public class SecondLargestNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray= {100,49,398,34,1,267};
		int lenArray=intArray.length;
		for(int i=0;i<intArray.length;i++)
		{
			System.out.println("print the array" +intArray[i]);
		}
		Arrays.sort(intArray);
		for(int i=0;i<intArray.length;i++)
		{
			//Arrays.sort(intArray[i-2]);
			System.out.println("sort ascending" + intArray[i] );
		}
	System.out.println("second largest" + intArray[lenArray-2] );
	System.out.println("second smallest" + intArray[1] );
	
	}
		
	}


