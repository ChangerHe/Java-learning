//ѡ��������㷨
class SelectionSort
{
	public static void main(String[] args) 
	{
		int[] arr = {2 ,6 ,9 ,1 ,4 ,7};
		




		String PrintArr = "[";    //������ַ����
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