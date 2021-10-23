import java.util.*;

public class Otherproduct {
public static void checkprice(List productotherthangrocery) {
	Iterator <Integer> count=productotherthangrocery.iterator();
	if(productotherthangrocery.isEmpty())
	{
	System.out.println("Please Select Products And shop With us");
	}
	else{
		int sum=0;
		while(count.hasNext())
		{
		sum=sum+count.next();
		}
		System.out.println("Yor Cart value Is:"+sum+" For Discount Answer Some Question");
		Checkprice checkdiscount=new Checkprice();
		checkdiscount.discprice(sum);
	}
}
	public static void displayOtherproduct()
	{	
		ArrayList productotherthangrocery =new ArrayList<Integer>();
		Checkprice c=new Checkprice();
		Scanner obj=new Scanner(System.in);
		boolean z=true;
		while(z){
			
		System.out.println("Select No to add item in cart");
		System.out.println("1.Shirt:300$");
		System.out.println("2.tshirt:200$");
		System.out.println("3.mask:150$");
		System.out.println("4.Dress:200$");
		System.out.println("After Selecting Product Press 0 To View Cart And Proceed For Payment.");
		int choice=obj.nextInt();
		switch(choice)
		{
		case 1:
			{	
				productotherthangrocery.add(300);
				break;
			}
		case 2:
			{
				productotherthangrocery.add(200);
				break;
			}
		case 3:
			{
				productotherthangrocery.add(150);
				break;
			}
		case 4:
			{
				productotherthangrocery.add(200);
				break;
			}
			
		case 0:
				checkprice(productotherthangrocery);
				z=false;
				break;
		default:
			System.out.println("Enter Valid Input And Enjoy Shopping");
		}
	  }
}

}
