//ͨ��JAVA��ȡ����������Ԫ�ص�����λ��
class  indexOf
{
	static void  indexOf(String[] args, String N){
		for ( int i = 0; i < args.length ; i++ )
		{
			if ( args[i] == N )
			{
				System.out.println(i);
				break;
			}
		}
	}
	public static void main(String[] args) 
	{
		String[] arr = {"a","b","c"};
		String Valu = "c";
		indexOf(arr,Valu);
	}
}
