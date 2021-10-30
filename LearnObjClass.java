package week1.day1;

public class LearnObjClass{
	
		// TODO Auto-generated method stub
		String objcategory="mobile";
		float size;
		String shape;
		String IMEI;
		char brandName;
		int resolution;
		byte weight;
		boolean isTouchScreen;
		short costMobile;
		private void makeCalls() {
			// TODO Auto-generated method stub
			System.out.println("making calls");
		}
	public void payMoney() {
		
		System.out.println("paying money");
	}
	public void viewGallery() {
		System.out.println("viewing gallery");
	}	
public static void main(String[] args)
{
	LearnObjClass samsung=new LearnObjClass();
	samsung.brandName='S';
	samsung.costMobile=4000;
	samsung.IMEI="1234567896325417";
	samsung.makeCalls();
	samsung.viewGallery();
	System.out.println("brandName" +samsung.brandName);
	System.out.println("costMobile" +samsung.costMobile);
	LearnObjClass apple=new LearnObjClass();
	apple.brandName='S';
	apple.costMobile=4000;
	 apple.IMEI="1234567896325417";
	apple.viewGallery();
	apple.makeCalls();
	System.out.println("brandname" +apple.brandName);
	System.out.println("costMobile" +apple.costMobile);
	

	}
}

