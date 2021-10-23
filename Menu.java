import java.util.*;

public class Menu {
	public static void displaymenu()
	{	
		Scanner sc=new Scanner(System.in);
		//Display Main Menu
		System.out.println("*Welcome To Capgemin Shop*");
		System.out.println("Select Category");
		System.out.println("1.Groceries");
		System.out.println("2.Cloth");
		System.out.println("3.Exit");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			{	
				Grocery gmenu=new Grocery();
				gmenu.displaygroceries();
				break;
			}
		case 2:
			{
				Otherproduct o=new Otherproduct();
				o.displayOtherproduct();
				break;
			}
		case 3:
			break;
			
		default :
			System.out.println("Enter Valid Input And Enjoy Shopping");
		
		}
		
		
	}
}
