private class discount{
	public static void main(String args[])
	{

	float  discount;
	float price;
	float b;
	float total;
	price=1000;
	dis=25;

	System.out.println("Price "+price);

	System.out.println("discount "+discount);

        b=100-discount;

	total= (b*price)/100;

	System.out.println("Total with discount="+total);

	}
}
