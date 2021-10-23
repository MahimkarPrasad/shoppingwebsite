public class Grocerydisc {
	public static void discprice(int sum)
	{	
		int Sum=(sum/100);
		int newprice=sum-Sum*5;
		System.out.println("Your Cart Value After Discount is :"+newprice);
		System.out.println("Proceed To Payment");
	}

}
