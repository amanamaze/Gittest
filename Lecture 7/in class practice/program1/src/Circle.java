class Circle
{
	private double radius;
	private String color;

	Circle()
	{
         this.radius = 1.0;
         this.color = "red";
	}
	Circle(double radius){
		this.radius = 1.0;
		this.color = "Red";
	}
	Circle(double radius , String color)
	{
		this.radius = 1.0;
		this.color = "red";
	}
	void setradius(double radius)
	{
		this.radius = 1.0;
	}
	String setcolor(String color)
	{
		this.color = "red";
	}
	void getcolor(String color)
	{
		return color;
	}
	double getradius()
	{
		return radius;
	}
	double getArea(double radius)
	{
		Circle c = new Circle();
		c.setradius(34);
		area = 3.14*radius*radius;
	}
}