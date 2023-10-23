package practice;

public class myString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //                0   1   2   3   4   5   6
        char [] myArray= {'w','e','l','c','o','m','e'};
		
        //using literals to create the string
		String firstString= " Welcome";  // sequence of character
		
		String str="  ";
		System.out.println(myArray.length);
		System.out.println(firstString.length());
		
		System.out.println(firstString.charAt(4));
		
		System.out.println(firstString + " to India");

		System.out.println(firstString.concat(" to india "));
		
		System.out.println(firstString.toUpperCase());   //WELCOME
		System.out.println(firstString.toLowerCase());   //welcome
		
		System.out.println(firstString.contains("come"));
		
		System.out.println(firstString.indexOf('l'));  //index
		System.out.println(firstString.trim());         //remove white space
		
		System.out.println(str.isEmpty());
	}
	

}
