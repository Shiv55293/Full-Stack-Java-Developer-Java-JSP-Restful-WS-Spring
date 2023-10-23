package practice;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myFirstArray= {1,2,3,4,5};
		
		myFirstArray[2]=10;   //update array
		System.out.println(myFirstArray[2]);
		
		System.out.println(myFirstArray.length);
		
		for(int i=0; i<myFirstArray.length;i++)
		{
			System.out.println(myFirstArray[i]);
		}
	}

}
