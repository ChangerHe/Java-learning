//����ڷ�װ����̬˼���JAVA�����ع�
//��Ҫ�ǽ���������private�����൱�ڻҺУ�������������
class Person
{
	private String name;
	private int age;
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
		System.out.print(name + "," + age);
	}
	public String getName()
	{
		return name;
	}
}
class Teacher extends Person
{
	private String hobby;
	Teacher(String name, int age, String hobby)
	{
		super(name , age);
		this.hobby = hobby;
		System.out.println(hobby);
		System.out.println(super.getName());
	}
}
class SuperDemo
{
	public static void main(String[] args)
	{
		Teacher t1 = new Teacher("Changer", 23 , "Sport"); //Ϊt1ֵ����name��age��hobbyֵ
		System.out.println(t1);
		String n = t1.getName();
		System.out.println(n);
	}
}