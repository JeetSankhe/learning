package controller;

//Eager initialization
public class SingletonEager {
	
	
	//counter to count instance count
	private static int counter=0;
	
	// public instance initialize while loading class
	private static final SingletonEager inst = new SingletonEager();
	
	// private constructor 
	private SingletonEager()
	{
		counter++;
		System.out.println("counter: "+ counter );
	}
	
	//Function to get Instance
	public static SingletonEager getInst(){
		return (inst);
	}
	
	public void display(String x)
	{
		System.out.println(x);
	}

}
