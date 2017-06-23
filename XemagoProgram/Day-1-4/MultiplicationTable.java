//使用Java输出九九乘法表
public class  MultiplicationTable
{

	public static void main(String[] args) 
	{
		int i;
		int j;
		for ( i = 1; i <= 9 ; i++ )
		{
			
			for ( j = 1; j <= 9 ; j++)
			{
				if ( i == j)
			{
				break;
			}
				System. out. print(i+" + "+j+" = "+(i + j)+"\t");
			}
			
			System. out. println();
		}
	}
}
