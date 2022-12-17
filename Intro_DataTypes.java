public class Intro_DataTypes{
	
	int x=10;
	static int y=20;
	 //int sushmitavedpath=10;// variable name should be less than 15 characters 
	 {
		 System.out.println("Hello im instance block");
	}

	 static {
		 System.out.println("Hello im static block");
			 }
	 
	public void m1() {
		
		System.out.println("Hello i am local block of m1");		
		int r=50;
		
	}
	
	public static void main(String[] args) {
		
		Intro_DataTypes d=new Intro_DataTypes();
		System.out.println("print value of instance x= "+d.x);
		System.out.println("print value of  static y= "+y);
		//System.out.println("print value of  sushmitavedpath= "+d.sushmitavedpath);
		
		
	}

}