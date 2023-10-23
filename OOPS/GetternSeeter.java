package oops;

public class GetternSeeter {

	

		private int length;         //public int length                                //instance variable 
		 private int breadth;          // public int breadth                            // instance variable
		 
		 public int areaRact()
		 {
			 int area=length*breadth;   // area- local variable (which is only accessible within this method)
			 return area;
		 }
		 public int perimeter()
		 {
			 int peri=2*(length+breadth);    // local variable
			 return peri;
		 }
		 
		 // GETTER AND SETTER
		 public int getLength()    //getter for length
		 {
			 return length;
		 }
		 public void setLength(int length)   // setter for length
		 {
			this.length=length;
		 }
		/**
		 * @return the breadth
		 */
		public int getBreadth() {
			return breadth;
		}
		/**
		 * @param breadth the breadth to set
		 */
		public void setBreadth(int breadth) {
			this.breadth = breadth;
		}
	}


/*  "Note"= We should never try to make instance variable public we should always try to make it private 
 * After making instance variable private we cannot access it outside the class
 * if we will try to access the above both method then we can easily access it bcoz both are public
 * public method is okay but in case of instance variable it should always be private in nature */

/*here we are getting the error that length and breadth has private 
* access we cannot use it outside the gertternseeter class........then how can we initialize the instance variable ??
* this is the our problem statement
* "THIS IS HOW THE GETTER AND SETTER METHOD CAME INTO THE PICTURE
* GETTER AND SETTER ARE ACTUALLY METHOD IN JAVA*/  

 