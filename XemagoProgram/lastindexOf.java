//获取数组中最后一个索引
class lastindexOf 
{
	static int lastindexOf(String[] args,String key){
		for ( int i = args.length - 1 ; i > 0 ; i-- )
		{
			if ( args[i] == key )
			{
				
				return i;
			}

		}
		return -1;
	}
	public static void main(String[] args) 
	{
		
	}
}
