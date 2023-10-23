package oops;

public class GetandSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GetternSeeter gns=new GetternSeeter ();
				
		//gns.length=10;
		//gns.breadth=20;
		
		gns.setLength(10);
		gns.setBreadth(20);
		
		System.out.println(gns.getLength());
		System.out.println(gns.getBreadth());
		
		/* here we are getting the error that length and breadth has private 
		 * access we cannot use it outside the gertternseeter class........then how can we initialize the instance variable ??
		 * this is the our problem statement
		 * "THIS IS HOW THE GETTER AND SETTER METHOD CAME INTO THE PICTURE
		 * GETTER AND SETTER ARE ACTUALLY METHOD IN JAVA*/  
	}

}
