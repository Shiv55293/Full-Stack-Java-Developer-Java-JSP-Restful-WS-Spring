package practice;

public class ExceprionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {1,4,23,5,6};
		
		System.out.println("Start of program");
		try {
		System.out.println(array[23]);
		int result =array[3]/0;
		System.out.println(result);
		} catch(ArrayIndexOutOfBoundsException  exception)     //ArrayIndexOutOfBoundsException
		{
			System.out.println(exception);
		} finally
		{
			System.out.println("Finally block will always executed"); // optional
		}
		
		System.out.println("End of program");
	



		//public class Main {

		   // public static void main(String[] args) 
		       
				/*String str = null;
				String str1="abc";
				
				String s = str.concat("str1");
				
				System.out.println(str1);*/
	
		}
		       
		      
	}

