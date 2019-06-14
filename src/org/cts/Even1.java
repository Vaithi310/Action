package org.cts;

public class Even1 {
	
		public static void main(String[] args) 
		{
			int Count=0;
			for(int i=1; i<=100; i++)
			{
				if(i%2==0)
				{
				    ++Count;
				}
			}
			System.out.println("The Count of Even numbers are:\t"+Count);
		}


}
