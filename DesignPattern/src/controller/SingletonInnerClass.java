package controller;

public class SingletonInnerClass {

	private static int innercounter=0;
	
	private SingletonInnerClass()
	{
		innercounter++;
		System.out.println("innercounter:" + innercounter);
	}
	
	private static class BillPughSingleton {
		private static final SingletonInnerClass inst=new SingletonInnerClass();
	}
	
	public static SingletonInnerClass getInst()
	{
		return BillPughSingleton.inst;
	}
	
	public void display(String x)
	{
		System.out.println(x);
	}
}
