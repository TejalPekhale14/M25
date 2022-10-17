package org.tnsindia.lambda;

public class MaxFinderExecutor {

	public static void main(String[] args) {
		
		/* MaxFinderChildDemo d=new  MaxFinderChildDemo();
		 d.max(45, 17);*/
		
		/*MaxFinderDemo obj=(int a,int b)->
		{
			int result=(a>b)?a:b;
			System.out.println("The max no. is:"+result);
		};
		obj.max(13, 98);*/
		
		MaxFinderDemo obj=(a,b)->a>b?a:b;
		System.out.println("The max no. is:"+obj.max(43, 4));
	}

}
