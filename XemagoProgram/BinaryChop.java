class BinaryChop
{
	static int BinaryChop(int[] arr,int a ){
		int min = arr[0];
		int mid = arr[arr.length/2];
		int max = arr[arr.length-1];
		if ( a == mid )
		{
			return arr.length/2;
		}else if ( a > mid )
		{
			min = mid;
			mid = (int)(arr.length*1.5-1)/2;
			continue;
		}else if ( a < mid )
		{
			max = mid;
			mid = (int)arr.legth/4;
			continue;
		}
	}
	public static void main(String[] args) 
	{
		int[] arr = { 1, 3, 5, 7, 9};
		a = 7;
		BinaryChop(arr ,a);
	}
}
