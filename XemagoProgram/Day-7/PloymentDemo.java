interface IUSB    //����һ���ӿڣ���Ӧ���ͼ�����Ҫ����Ĳ��
{ 
	void SwapUSB();

}
class Mouse implements IUSB  //ָ��һ�����
{
	public void SwapUSB()
	{
		System.out.println("I can Move.");
	}
}
class Kboard implements IUSB //ָ��һ������
{
	public void SwapUSB()
	{
		System.out.println("I can Write.");
	}
}
class motherBoard //ָ��һ������
{
	private IUSB() usbs = new IUSB(6);
	public static void Write(IUSB n)
	{
		n.SwapUSB();
	}
}
class  PloymentDemo
{
	public static void main(String[] args) 
	{
		//����������
		IUSB m1 = new Mouse();
		motherBoard.Write(m1);
	}
}
