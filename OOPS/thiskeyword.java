package oops;

public class thiskeyword {

	String name;
	int age;
	String college;
	
	public thiskeyword() {
	}
	
	public thiskeyword(String name,int age,String college)
	{
	    this.name=name;     // simply we can say r1.name=name .. bt compiler doesnt know the r1 bcoz it is presnet in the main class
		this.age=age;
		this.college=college;
	}

}


// reference variable present in main class is referred by this key word; actually here in 
//the simple class compiler does not know the reference variable so in order to access the instance variable use this keyword 