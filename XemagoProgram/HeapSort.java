//选择排序的算法
class SelectionSort
{
	public static void main(String[] args) 
	{
		int[] arr = {2 ,6 ,9 ,1 ,4 ,7};
		




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
