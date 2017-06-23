/**
class getterSet
{
	private String name;
	private int age;
	public String getName(){
		return name;
	}
	public void setName(String n ){
		name = n;
	}
}
class  TextDemo
{
	public static void main(String[] args) 
	{
		getterSet u1 = new getterSet();
		u1.setName("Blue");
		String n = u1.getName();
		System.out.println(n);
		
	}
}*/
class User
{
	private String name;
	private int age;
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name = n;
	}
}
class ThisDemo
{
	public static void main(String[] args)
	{
		User u1 = new User();
		u1.setName("Lucy");
		String n = u1.getName();
		System.out.println(n);
	}
}