package org.tnsindia.exception;

import java.io.IOException;

public class ThrowsKeyword {

	public static void print(int x)throws IOException,ClassNotFoundException
	{
		if(x==1)
		{
			throw new IOException("IOException occured");
		}
		else
		{
			throw new ClassNotFoundException("ClassNotFoundException occured");
		}
	}
	
	public static void main(String[] args) {
		
        try
        {
        	print(5);
        }
	    catch(Exception e)
	    {
		    System.out.println(e);
	    }
	}
}
