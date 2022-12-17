
	public class Test{

		int x=10;
	static int y=20;

	

	 //int sushmitavedpath=10;// variable name should be less than 15 characters 
	 {


		  System.out.println("Hello im instance block");
		   {
		 	System.out.println("Hello im local block of instance block");
		 }
				
	}

	 static {
		 System.out.println("Hello im static block");
		 {
		 	System.out.println("Hello im local block of static block");
		 }
	
			 }
	 
	public void m1() {
		int r=50;
		System.out.println("Print value of m1() r= "+r);
		
		{
			System.out.println("Hello i am local block of m1");		
		}
			
		
	}
	
	public static void main(String[] args) {
		
		Test d=new Test();
		System.out.println("print value of instance x= "+d.x);
		System.out.println("print value of  static y= "+y);
		System.out.println("print value of  sushmitavedpath= "+d.sushmitavedpath);
		
		System.out.println("Hello i am main method");

		{
		 	System.out.println("Hello im local block of main method");
		 }	
	}


}
