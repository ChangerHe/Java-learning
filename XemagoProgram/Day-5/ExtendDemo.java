class person
{
	protected String name;
	protected int age;
	public void sleep(){};
}
class teacher extends person
{
	String Gread;
}
class student extends person
{
	String ID;
}
class employee extends person
{
	String employYear;
}
class ExtendDemo 
{
	public static void main(String[] args) 
	{
		teacher t1 = new teacher();
		System.out.println(t1.name);
	}
}
