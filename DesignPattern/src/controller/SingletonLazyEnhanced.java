package controller;

public class SingletonLazyEnhanced {

	private static SingletonLazyEnhanced inst;
	
	private static int lazycounter=0;
	
	private SingletonLazyEnhanced()
	{
		lazycounter++;
		System.out.println("Enhancedlazycounter:"+lazycounter);
	}
	
	//synchronized method to control simultaneous access
	//but as synchronized is moved inside and is not on method 
	//so only first instance check will be sync other will not wait
	//and will continue in parallel 
	public static SingletonLazyEnhanced getInst()
	{
		if(inst==null)
		{
			synchronized(SingletonLazyEnhanced.class)
			{
				if(inst==null)
				{
					inst= new SingletonLazyEnhanced();
			
				}
			}
		}
		return (inst);
	}
	
	
	
	public void display(String x)
	{
		System.out.println(x);
	}
	
}
