import java.util.*;

public class Checkprice {
	//This method will check discount according to criteria
	public static void discprice(int sum)
	{	//To take Input in Project We used Scannner class variable
		Scanner input1=new Scanner(System.in);
		Scanner input2=new Scanner(System.in);
		Scanner input3=new Scanner(System.in);
		System.out.println("Are U Capgemini emp? say yes or no");
		String capgemp=input1.nextLine();
		if(capgemp.equals("yes"))
		{	System.out.println("Enter Your Capgemini Employee Id:");
			int number=input1.nextInt();
		
			String result=Checkcapgemp.nocheck(number);
			if(result=="yes")
				{
				int newprice=sum-(sum/100)*30;
				System.out.println("Amount After Discount is :"+newprice);
				System.out.println("Proceed To Payment");
				}
		else {
			System.out.println("You have entered Wrong Information, Please try once again");
		}
	
		}
		else if(capgemp.equals("no"))
		{
			System.out.println("Are U Capgemini Affiliate? say yes or no");
			String capgasso=input2.nextLine();
			if(capgasso.equals("yes"))
			{		System.out.println("Enter Your Capgemini Affiliate Id:");
					int number=input1.nextInt();
			
						String result=Checkcapgaffiliate.nocheck(number);
						if(result=="yes")
						{
							int newprice=sum-(sum/100)*10;
							System.out.println("Your Cart Value After Discount is :"+newprice);
							System.out.println("Proceed To Payment");
						}
						else {
							System.out.println("You have entered Wrong Information, Please try once again");
						}
			}
			else if(capgasso.equals("no"))
			{
				System.out.println("Are you customer from last two years or before? say yes or no");
				String capcust=input3.nextLine();
				if(capcust.equals("yes"))
				{	
					System.out.println("Enter Your Mobile Number:");
					int number=input1.nextInt();
					
					String result=Checkno.nocheck(number);
					if(result=="yes")
					{
						System.out.println("Welcome capg member & Congrats You got discount");
						int newprice=sum-(sum/100)*5;
						System.out.println("Your Cart Value After Discount is :"+newprice);
						System.out.println("Proceed To Payment");
					}
					else {
						System.out.println("You have entered Wrong Information or You are new to us and try once again");
					}
				}
				else if(capcust.equals("no")){
					
					int Sum=(sum/100);
					int newprice=sum-Sum*5;
					System.out.println("Your Cart Value After Discount is :"+newprice);
					System.out.println("Proceed To Payment");
				}
			}
		
		}
	 
		
		
	}
	

}
