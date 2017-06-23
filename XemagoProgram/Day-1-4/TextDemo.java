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