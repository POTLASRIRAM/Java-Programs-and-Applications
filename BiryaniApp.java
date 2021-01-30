import java.lang.*;
import java.util.*;
public class BiryaniApp
{
	int total_Bill=0;
	static int chicken_Biryani_Cost=140;
	static int total_Chicken_Biryani_Price=0;
	static int mutton_Biryani_Cost=180;
	static int total_Mutton_Biryani_Price=0;
	static int veg_Biryani_Cost=130;
	static int total_Veg_Biryani_Price=0;
	static int handi_Biryani_Cost=280;
	static int total_Handi_Biryani_Price=0;
	public static void chickenBiryani()
	{
		
		System.out.println("Welcome to Chicken biryani\n1 Plate=rs140\nHow many plates you want? ");
		Scanner sc=new Scanner(System.in);
		int number_Plates=sc.nextInt();
		total_Chicken_Biryani_Price=number_Plates*chicken_Biryani_Cost;
		System.out.println("Total Chicken Biryani Price = "+total_Chicken_Biryani_Price);
		
		
		
	}
	public static void  muttonBiryani()
	{
		System.out.println("Welcome to Mutton Biryani\n1 Plate=rs180\nHow many plates you want? ");
		Scanner sc=new Scanner(System.in);
		int number_Mutton_Plates=sc.nextInt();
		total_Mutton_Biryani_Price=number_Mutton_Plates*mutton_Biryani_Cost;
		System.out.println("Total Mutton Biryani Price = "+total_Mutton_Biryani_Price);
	}
	public static void vegBiryani()
	{
		System.out.println("Welcome to Veg Biryani\n1 Plate=rs130\nHow many plates you want? ");
		Scanner sc=new Scanner(System.in);
		int number_Veg_Plates=sc.nextInt();
		total_Veg_Biryani_Price=number_Veg_Plates*veg_Biryani_Cost;
		System.out.println("Total Veg Biryani Price = "+total_Veg_Biryani_Price);
		
	}
	public static void handiBiryani()
	{
		System.out.println("Welcome to Handi Biryani\n1 Plate=rs280\nHow many plates you want? ");
		Scanner sc=new Scanner(System.in);
		int number_Handi_Plates=sc.nextInt();
		total_Handi_Biryani_Price=number_Handi_Plates*handi_Biryani_Cost;
		System.out.println("Total Veg Biryani Price = "+total_Handi_Biryani_Price);
		
	}
	public static void exit()
	{
		System.out.println("You are exiting");
	}
	
	public static void main(String[] args)
	{
		System.out.println("-----------Welcome to Biryani App----------");
		System.out.println("------Our Menu------");
		System.out.println(" 1.Chicken Biryani");
		System.out.println(" 2.Mutton Biryani");
		System.out.println(" 3.Veg Biryani");
		System.out.println(" 4.Handi Biryani");
		System.out.println(" 5.Exit");
		System.out.println(" Enter your choice : ");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		case(1): chickenBiryani();
		         break;
		case(2): muttonBiryani();
		         break;
		case(3): vegBiryani();
		         break;
		case(4): handiBiryani();
		         break;
		case(5): exit();
		         break;
		default: System.out.println("Please enter correct choice");
		}
	}

}
