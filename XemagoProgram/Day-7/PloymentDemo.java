interface IUSB    //定义一个接口，对应鼠标和键盘需要插入的插口
{ 
	void SwapUSB();

}
class Mouse implements IUSB  //指定一个鼠标
{
	public void SwapUSB()
	{
		System.out.println("I can Move.");
	}
}
class Kboard implements IUSB //指定一个键盘
{
	public void SwapUSB()
	{
		System.out.println("I can Write.");
	}
}
class motherBoard //指定一个主板
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
		//创建鼠标对象
		IUSB m1 = new Mouse();
		motherBoard.Write(m1);
	}
}
