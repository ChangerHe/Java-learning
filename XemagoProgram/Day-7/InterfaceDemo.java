//����½������������ߣ��˽ӿڶԽ�½�����
interface IWalkable extends IWalkSwim
{
	void walk();
}
//����ˮ�����������Ӿ���˽ӿڶԽ�ˮ������
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
		IWalkable c = new cat();  //����ӿڱ�̣����ڶ�̬
		c.walk();  //���ֶ�̬������ִ��CAT���walk����
	}
}
