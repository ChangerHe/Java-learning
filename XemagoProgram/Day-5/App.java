public class App
{
	private static App d = new App();
	private SubClass t = new SubClass();
	static
	{
		System.out.println(3);
	}
	public App()
	{
		System.out.println(4);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}

}
class SuperClass
{
	SuperClass()
	{
		System.out.println("SuperClass ¹¹ÔìÆ÷");
	}
}
class SubClass extends SuperClass
{
	static
	{
		System.out.println(1);
	}
	public SubClass()
	{
		System.out.println(2);
	}
}
