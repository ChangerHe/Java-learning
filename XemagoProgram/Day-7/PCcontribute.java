//在父类中，定义一个总体算法骨架，而将某一些步骤延迟到子类中
abstract class TotalOperate   //子类中有abstract方法，则父类必须为abstract抽象的
{
	public long getTotalTime()  //使用一个方法，综合子类中的重复调用问题
	{
		long begin = System.currentTimeMillis();
		doWork();
		long end = System.currentTimeMillis();
		long time = end - begin;
		return time;
	}
	public abstract void doWork();
}
class StringOperate extends TotalOperate
{
	public void doWork()
	{
		String str = "";
		for (int i = 0; i < 10000 ; i++ )
		{
			str += 1;
		}
	}
}
class IntOperate extends TotalOperate
{
	public void doWork()
	{
		int str = 0;
		for (int i = 0; i < 10000 ; i++ )
		{
			str += 1;
		}
	}
}
//连接方法
class  PCcontribute
{
	public static void main(String[] args) 
	{
		System.out.println(new StringOperate().getTotalTime());
		System.out.println(new IntOperate().getTotalTime());
	}
}
