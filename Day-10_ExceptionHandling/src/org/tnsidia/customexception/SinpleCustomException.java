package org.tnsidia.customexception;

class SinpleCustomExceptionDemo extends Exception
{
	public String str;
	public SinpleCustomExceptionDemo(String str)
	{
		super();
		this.str=str;
	}
	
	@Override
	public String toString() {
		return "SinpleCustomExceptionDemo [str=" + str + "]";
	}
	
}

public class SinpleCustomException {

	public static void main(String[] args) {
		
		try
		{
			throw new SinpleCustomExceptionDemo("User-Defined Exception Demo");
		}
         catch(SinpleCustomExceptionDemo e )
		{
        	 System.out.println(e);
		}
	}

}
