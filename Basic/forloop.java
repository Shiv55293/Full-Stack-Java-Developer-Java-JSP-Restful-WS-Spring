package practice;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // find all  odd no from 1 to 100 using for loop
		// let's take 1 to 4
		int number=1;
		if(number % 2==0)
		
			System.out.println(number);
			number ++;
		
		if(number % 2==0)
		
			System.out.println(number);
			number++;
		
		if(number % 2==0)
		
			System.out.println(number);
			number++;
		
		if(number % 2==0)
		
			System.out.println(number);
		
		// to reduce line of code use for loop
		
	
		for(int num=1; num<=100; num++)
		{
			if(num % 2==0)
			System.out.println(num);
		}
		
	}

}
// for odd use (number % 2!=0)
