class SuperClass
{
	public int name = 18;
	//public static void ooxx(){}
}
class SubClass extends SuperClass
{
	public String name = "Guess What";
	public void doWork()
	{
		boolean name = true;
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
	//public static void ooxx(){}
}
/**class MinClass extends SubClass
{
	
	public void doWork()
	{
		boolean name = true;
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
}*/

class HideDemo 
{
	public static void main(String[] args) 
	{
		new SubClass().doWork();
		System.out.println("1");
	}
}
