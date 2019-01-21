class TestCylinder 
{
	public static void main(String [] args)
	{
		Cylinder c1 = new Cylinder();
		System.out.println(c1.getcolor());
		System.out.println(c1.getradius());
		System.out.println(c1.getArea());
		System.out.println(c1.getvolume());

		
       Cylinder c2 = new Cylinder();
		System.out.println(c2.getcolor("Black"));
		System.out.println(c2.getradius(34));
		System.out.println(c2.getArea());
		System.out.println(c2.getvolume());
	}
}