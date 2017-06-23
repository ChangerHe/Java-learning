//冒泡排序的算法
class BubbleSort 
{
	public static void main(String[] args) 
	{
		int[] arr = {2 ,6 ,9 ,1 ,4 ,7};
		int a;
		for ( int i = 0; i < arr.length-1 ; i++ )
		{
			for ( int j = 0 ; j < arr.length-1-i ; j++ )
			{
				if ( arr[j] > arr[j+1])
				{
					a = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = a;
				}
			}
		}
		String PrintArr = "[";    //打包成字符输出
		for ( int i = 0; i < arr.length ; i++ )   
		{
			PrintArr = PrintArr + arr[i];
			if ( i == arr.length-1 )
			{
				break;
			}
			PrintArr = PrintArr + ",";
		}
		PrintArr = PrintArr + "]";
		System.out.println(PrintArr);
	}
}
