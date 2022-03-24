package controller;

public class SingletonEagerBlock {

	// public instance
	public static SingletonEagerBlock inst;
	
	private static int blockcounter=0;
	
	// private constructor
	private SingletonEagerBlock() 
	{
		blockcounter++;
		System.out.println("blockcounter: "+blockcounter);
	}
	
	// static block to initialize instance
	static 
	{
		inst=new SingletonEagerBlock();
	}
	
	public void display(String x)
	{
		System.out.println(x);
	}
}
