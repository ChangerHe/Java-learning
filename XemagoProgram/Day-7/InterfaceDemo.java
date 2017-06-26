//定义陆生动物，可以行走，此接口对接陆生动物。
interface IWalkable extends IWalkSwim
{
	void walk();
}
//定义水生动物，可以游泳，此接口对接水生动物
interface ISwim extends IWalkSwim
{
	void swim();
}
class cat implements IWalkable
{

	public void walk()
	{
		System.out.println("I can walk.");
	}
}
class  InterfaceDemo
{
	public static void main(String[] args) 
	{
		IWalkable c = new cat();  //面向接口编程，存在多态
		c.walk();  //体现多态特征，执行CAT类的walk方法
	}
}
