class MobileDriver 
{
	public static void main(String[] args) 
	{
		Mobile m= new Mobile("Samsung Ultra",12000,new Battery(1200,7.2));//we have to create a new object  dependency inside a object like [---new Battery---]
		m.b.getBatteryDetails();
		m.getMobileDetails();
	}
}
