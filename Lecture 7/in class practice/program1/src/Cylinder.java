class Cylinder extends Circle
{
	private double height;

	Cylinder()
	{
		super();
		this.height = 1.0;
	}
	Cylinder(double radius , double height)
	{
       super(radius);
       this.height = 1.0;
	}
	Cylinder(double radius)
	{
		super(radius);
		this.height = 1.0;
	}
	Cylinder(double radius , double height , String color)
	{
		super(radius);
		super(color);
		this.height = 1.0;
	}
	void setheight(double height)
	{
	this.height = 1.0;
	}
	double getheight()
	{
		return this.height;
	} 
	double getvolume()
	{
		double vol;
		vol = getArea()*height;
	}

}