package oops;

public class GetterSetter {

	private String breed;
	private int size;
    private	String color;
    
    public void bark()
    {
    	System.out.println("Wooh ! Wooh !");
    	
    }
    public  void run()
    {
    	System.out.println("My breed is : " + breed + " I am running");
    }
    
    public String getBreed()
    {
    	return breed;
    }
    public void setBreed(String breed)
    {
    	this.breed=breed;
    }
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
}
