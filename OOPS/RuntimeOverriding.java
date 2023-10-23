package Polymorphism;

public class RuntimeOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RuntimeOverriding t=new RuntimeOverriding();
		Dog d=t. new Dog();
		d.run();
		
	}
	
class Animal
{
	public void run()
	{
		System.out.println("Animal is running");
	}
}
class Dog extends Animal
{
	public void run()     // method overriding 
	{
		super.run();             // super keyword used to call the super class method from child class
		System.out.println("Dog is running");
		// super.run();           can use it here also
	}
}

}
