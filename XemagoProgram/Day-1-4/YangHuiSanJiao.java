//杨辉三角的JAVA实现
class  YangHuiSanJiao
{
	static void putIn(int m){
		int n  = m*2-1;     //根据杨辉三角特性，行数等于列数乘二加一
		int[][] arr = new int[m][n];  //新建数组
		arr[0][m-1] = 1;
		for ( int i = 0; i < m-2 ; i++ )
		{
			for ( int j = 0; j < n-2 ; j++ )
			{
				arr[i+1][j+1] = arr[i][j] + arr[i][j+2]; //将当列的第J个数和第J+2个数，赋值给下一列的J+1个数（因为i和j初始为0）
			}
		}
		for (int i = 0; i < m-1 ; i++ )
		{
			for (int j = 0; j < n ; j++ )
			{
				System.out.print(arr[i][j]+ "\t");  //遍历数组，将值逐一打印
			}
			System.out.println();  //打印换行
		}

	}

	
	public static void main(String[] args) 
	{
		putIn(10);  //输入想要得到的杨辉三角层数
	}
}
