class Mobile
{
	String model;
	double price;
	Battery b;
	Mobile(String model,double price,Battery b)
	{
		this.model=model;
		this.price=price;
		this.b=b;
	}
	public String getModel()
	{
		return model;
	}
	public double getprice()
	{
		return price;
	}
	public void getMobileDetails()
	{
		System.out.println("Mobile Model is "+model);
		System.out.println("Mobile price is "+price);
                b.getBatteryDetails();
	}

}