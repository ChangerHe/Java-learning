//������ǵ�JAVAʵ��
class  YangHuiSanJiao
{
	static void putIn(int m){
		int n  = m*2-1;     //��������������ԣ��������������˶���һ
		int[][] arr = new int[m][n];  //�½�����
		arr[0][m-1] = 1;
		for ( int i = 0; i < m-2 ; i++ )
		{
			for ( int j = 0; j < n-2 ; j++ )
			{
				arr[i+1][j+1] = arr[i][j] + arr[i][j+2]; //�����еĵ�J�����͵�J+2��������ֵ����һ�е�J+1��������Ϊi��j��ʼΪ0��
			}
		}
		for (int i = 0; i < m-1 ; i++ )
		{
			for (int j = 0; j < n ; j++ )
			{
				System.out.print(arr[i][j]+ "\t");  //�������飬��ֵ��һ��ӡ
			}
			System.out.println();  //��ӡ����
		}

	}

	
	public static void main(String[] args) 
	{
		putIn(10);  //������Ҫ�õ���������ǲ���
	}
}
