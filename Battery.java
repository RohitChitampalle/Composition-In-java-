class Battery 
{
	private int capacity;
	double thickness;
	Battery(int num,double thickness)
	{
		this.capacity=num;
		this.thickness=thickness;
	}
	public int getcapacity()
	{
		return capacity;
	}
	public double getthickness()
	{
		return thickness;
	}
	public void getBatteryDetails()
	{
		System.out.println("Battery capacity is ="+capacity);
		System.out.println("Battery thickness  is ="+thickness);
	}

}
