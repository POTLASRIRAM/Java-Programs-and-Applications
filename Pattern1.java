import java.util.Scanner;

public class Pattern1 
{
	public static void main(String []args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n=sc.nextInt();
		int b=2*(n)-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=b;j++)
			{
				if(j>=n-(i-1) && j<=n+(i-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}
	

}
