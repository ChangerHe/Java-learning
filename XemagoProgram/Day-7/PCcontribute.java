//�ڸ����У�����һ�������㷨�Ǽܣ�����ĳһЩ�����ӳٵ�������
abstract class TotalOperate   //��������abstract�������������Ϊabstract�����
{
	public long getTotalTime()  //ʹ��һ���������ۺ������е��ظ���������
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
//���ӷ���
class  PCcontribute
{
	public static void main(String[] args) 
	{
		System.out.println(new StringOperate().getTotalTime());
		System.out.println(new IntOperate().getTotalTime());
	}
}
