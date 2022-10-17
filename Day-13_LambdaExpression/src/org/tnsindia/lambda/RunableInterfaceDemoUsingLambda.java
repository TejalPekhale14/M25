package org.tnsindia.lambda;

public class RunableInterfaceDemoUsingLambda {

	public static void main(String[] args) {
		
         /* Runnable obj=new Runnable()
        		  {

					@Override
					public void run() {
						
						System.out.println("Implementing runnable interface");
					}
        	  
        		  };
        		  Thread t=new Thread(obj);
        		  t.start();
        		  //obj.run();*/
		
		Runnable obj=()->
		{
			System.out.println("Implementing runnable interface");

		};
		Thread t=new Thread(obj);
	    t.start();
	}

}
