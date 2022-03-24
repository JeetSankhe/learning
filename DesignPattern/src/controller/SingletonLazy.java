package controller;

public class SingletonLazy {

	private static SingletonLazy inst;
	
	private static int lazycounter=0;
	
	private SingletonLazy()
	{
		System.out.println("BBlazycounter:"+lazycounter);
		lazycounter++;
		System.out.println("lazycounter:"+lazycounter);
	}
	
	//synchronized method to control simultaneous access
	//if we remove synchronized race condition will occur 
	synchronized public static SingletonLazy getInst()
	{
		if(inst==null)
		{
			inst= new SingletonLazy();
		}
		return (inst);
	}
	
	
	
	public void display(String x)
	{
		System.out.println(x);
	}
	
}
