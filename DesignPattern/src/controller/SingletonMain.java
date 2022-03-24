package controller;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		firstmethod();
		secondmethod();
		thirdmethod();
		*/
		
		//Below methods are Parallel call to methods 
		ExecutorService executor = Executors.newCachedThreadPool();
        Runnable callMultiply = () -> thirdmethod();  //Create Runnable reference using lambda
		executor.execute(callMultiply);
		executor.execute(() -> secondmethod()); //inline
        executor.execute(() -> firstmethod());

        
        
        executor.shutdown();
		 
	}

	public static void firstmethod() {
		
		SingletonInnerClass firstinner= SingletonInnerClass.getInst();
		firstinner.display("I am first inner class call");
		
		SingletonLazyEnhanced firstLZ=SingletonLazyEnhanced.getInst();
		firstLZ.display("I am First LZ ENahanced call");
		
		SingletonLazy firstlazy=SingletonLazy.getInst();
		firstlazy.display("I am First Lazy caller");
		
		SingletonEager firstcaller= SingletonEager.getInst();
		
		SingletonEagerBlock firstblockcall=SingletonEagerBlock.inst;
		/*
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		firstcaller.display("I am First caller");
		
		firstblockcall.display("I am First Block call");

	}
	public static void secondmethod() {

		SingletonInnerClass firstinner= SingletonInnerClass.getInst();
		firstinner.display("I am Second inner class call");
		
		SingletonLazyEnhanced firstLZ=SingletonLazyEnhanced.getInst();
		firstLZ.display("I am Second LZ ENahanced call");
		
		SingletonLazy firstlazy=SingletonLazy.getInst();
		firstlazy.display("I am Second Lazy caller");
		
		SingletonEager secondcaller=SingletonEager.getInst();
		secondcaller.display("I am Second caller");
		
		SingletonEagerBlock secondblockcall=SingletonEagerBlock.inst;
		secondblockcall.display("I am Second Block call");

	}
	
	public static void thirdmethod() {

		SingletonInnerClass firstinner= SingletonInnerClass.getInst();
		firstinner.display("I am third inner class call");
		
		SingletonLazyEnhanced firstLZ=SingletonLazyEnhanced.getInst();
		firstLZ.display("I am Third LZ ENahanced call");
		
		SingletonLazy firstlazy=SingletonLazy.getInst();
		firstlazy.display("I am Third Lazy caller");
		
		SingletonEager thirdcaller=SingletonEager.getInst();
		thirdcaller.display("I am Third caller");
		
		SingletonEagerBlock firstblockcall=SingletonEagerBlock.inst;
		firstblockcall.display("I am Third Block call");

	}
}
