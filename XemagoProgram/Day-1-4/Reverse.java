class Reverse
{
	//对数组进行反转操作
	static void Reverse(String[] args){
		String[] contain = new String[args.length];
		for ( int i = 0; i < args.length ; i++ )
		{
			contain[i] = args[args.length - i -1];
			System.out.println(contain[i]);
		}
		String Back = "[";
		for ( int i =0; i< args.length ; i++ )
		{
			Back = Back + contain[i];
			if ( i == args.length-1 )
			{
				break;
			}
			Back = Back + ",";
		}
		Back = Back + "]";
		System.out.println(Back);
	}
	public static void main(String[] args){
		String[] arr = new String[]{"1","a","c"};
		Reverse(arr);
	}
}