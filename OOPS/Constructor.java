package oops;

public class Constructor {
	
	public int length;
	public int breadth;
	
	public Constructor()              // default constructor
	{
		System.out.println("Dafault constructor is triggered");
		
	}
	
	public Constructor(int l,int b)            // parameterized constructor
	
	{
		length=l;
		breadth=b;
		//System.out.println("Parameterized constructor is triggered");
	}
	
	

}

 