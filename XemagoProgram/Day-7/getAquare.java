//求三角形、矩形、圆形的面积
class circle
{
	private Integer r;
	circle (Integer r)
	{
		this.r = r;
	}
	public double gerArea()
	{
		return 3.14 * r * r;
	}
}
class  getSquare
{
	public static void main(String[] args) 
	{
		circle s1 = new circle(10);
		System.out.println(s1);
	}
}
