class p34
{
	public static void main(String [] args)
	{
		for(int i = 1;i<=4;i++)
		{
			for(int k = 5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i;j++)
			{
				if(j==2||j==3)
				{
					System.out.print(" ");continue;
				}				
				System.out.print("*");
			}
			System.out.print("*");
			System.out.println();
		}
		System.out.print(" *****");
	}
}
/*
Output:
E:\CDAC - JUHU\Assignment3>java p34
     *
    **
   * *
  *  *
 *****
*/