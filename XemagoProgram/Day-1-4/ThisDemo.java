class Person
{
	private String name;
	private int age;
	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int a){
		age = a;
	}
}
class ThisDemo
{
	public static void main(String[] args){
		Person n1 = new Person();
		n1.setName("xiaohong");
		String N = n1.getName();
		n1.setAge(18);
		int A = n1.getAge();
		System.out.println(N + ", " +A);
	}
}