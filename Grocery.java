import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Grocery {
	public static void checkprice(List grocerycoll) {
		
		Iterator <Integer> count=grocerycoll.iterator();
		if(grocerycoll.isEmpty())
		{
		System.out.println("Please Select Products And shop With us");
		}
		else {
		int sum=0;
		while(count.hasNext())
		{
			sum=sum+count.next();
		}
		
		Grocerydisc c=new Grocerydisc();
		c.discprice(sum);
		}
	}

	public static void displaygroceries()
	{
		ArrayList grocerycoll =new ArrayList<Integer>();
		
		Scanner obj=new Scanner(System.in);
		boolean z=true;
		while(z){
		System.out.println("Select No to add item in cart");
		System.out.println("1.Sugar:40$/per Kg");
		System.out.println("2.salt:20$/per Kg");
		System.out.println("3.wheat:100$/per Kg");
		System.out.println("4.rice:200$/per Kg");
		System.out.println("After Selecting Product Press 0 To View Cart And Proceed For Payment.");
		int choice=obj.nextInt();
		switch(choice)
		{
		case 1:
			{	
				grocerycoll.add(40);
				break;
			}
		case 2:
			{
				grocerycoll.add(20);
				break;
			}
		case 3:
			{
				grocerycoll.add(100);
			break;
			}
		case 4:
			{
				grocerycoll.add(200);
			break;
			}
			
		case 0:
			checkprice(grocerycoll);
			z=false;
			break;
		default:
			System.out.println("Enter Valid Input And Enjoy Shopping");
		
		}
	}
	}
	

}

