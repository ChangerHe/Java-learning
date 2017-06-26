//求三角形、矩形、圆形的面积
abstract class Graph
{
	public Double getArea()
	{
		return 2.0;
	}
}
class Circle extends Graph
{
	private Integer r;
	Circle (Integer r)
	{
		this.r = r;
	}
	public Double getArea()
	{
		return 3.14 * r * r;
	}
}
//矩形
class Rectangle extends Graph
{
	private Double w;
	private Double h;
	Rectangle(Double w,Double h)
	{
		this.w = w;
		this.h = h;
	}
	public Double getArea()
	{
		return w * h;
	}
}
//三角形
class Triangle extends Graph
{
	private Integer a;
	private Integer b;
	private Integer c;
	Triangle(Integer a , Integer b , Integer c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Double getArea()
	{
		Double q = (a + b + c )/2.0;
		return Math.sqrt(q * (q-a)*(q-b)*(q-c));
	}
}
class  getSquare
{
	public static void main(String[] args) 
	{
		System.out.println(new Circle(10).getArea());
		System.out.println(new Rectangle(10.0,10.0).getArea());
		System.out.println(new Triangle(10,10,10).getArea());
	}
}
