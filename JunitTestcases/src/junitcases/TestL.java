package junitcases;

public class TestL {

		public static int greatestOfThree(int x1,int y1,int z1)
			
			{
				int max=0;
				if(x1>y1&& x1>z1)
				{
					max=x1;
				}
				else if(y1>x1 && y1>z1)
				{
					max=y1;
				}
				else
				{
					max=z1;
				}
				
				return max;
				
			}
	
}
