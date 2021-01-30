import java.util.Scanner;

public class Restaurent 
{
	int total_Bill=0;
	static int biryani_Cost=140;
	static int total_Biryani_Price=0;
	static int icecreams_Cost=50;
	static int total_Icecream_Price=0;
	static int drinks_Cost=30;
	static int total_Drinks_Price=0;
	public static void biryani()
	{
		
		System.out.println("Welcome to biryani\n1 Plate=rs140\nHow many plates you want? ");
		Scanner sc=new Scanner(System.in);
		int number_Plates=sc.nextInt();
		total_Biryani_Price=number_Plates*biryani_Cost;
		System.out.println("Total Biryani Price = "+total_Biryani_Price);
		
		
		
	}
	public static void  ice_creams()
	{
		System.out.println("Welcome to Ice Creams\n1 Ice Cream=rs50\nHow many Ice Creams you want? ");
		Scanner sc=new Scanner(System.in);
		int number_Icecreams=sc.nextInt();
		total_Icecream_Price=number_Icecreams*icecreams_Cost;
		System.out.println("Total Ice Creams Price = "+total_Icecream_Price);
	}
	public static void drinks()
	{
		System.out.println("Welcome to Drinks\n1 Drink=rs30\nHow many Drinks you want? ");
		Scanner sc=new Scanner(System.in);
		int number_Drinks=sc.nextInt();
		total_Drinks_Price=number_Drinks*drinks_Cost;
		System.out.println("Total Drinks Price = "+total_Drinks_Price);
		
	}
	public static void exit()
	{
		System.out.println("You are exiting");
	}
	public static void main(String[] args)
	{
		
		System.out.println("Welcome to our XYZ Restaurent");
		System.out.println("Our menu :\n1.Biryani\n2.Ice Creams\n3.Drinks");
		System.out.println("To exit press 4");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		case(1): biryani();
			        break;
	    case(2): ice_creams();
			        break;
		case(3): drinks();
			        break;
		case(4): exit();
			         break;
		default:
				    System.out.println("Please enter correct item");
			
			
		}
		
		
	}

}
