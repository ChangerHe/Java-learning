class  WapperDemo
{
	public static void main(String[] args) 
	{ 
		Integer i1 = new Integer(123);    //��װ��ķ���֮һ
		Integer i2 = new Integer(123);  
		System.out.println(i1 == i2);

		Integer i3 = Integer.valueOf(200);  //��װ�����һ�ַ������Ƽ��˷���
		Integer i4 = Integer.valueOf(200);
		System.out.println(i3 == i4);

		Integer i5 = 123;  //��װ��ļ򻯷������﷨�ǣ�ʵ�ʻ���valueOf�ķ�����
		Integer i6 = 123;
		System.out.println(i5 == i6);

		System.out.println(i3.equals(i4));  //���ǱȽ����ֵַ�����ǱȽ�������ֵ
		
	}
}
//��װ�����У����л�����ƣ���˻�����[-128 - 127]���м����ֵ��Byte��Short,Integer��Long
//����Character���⣬ֻ����[0 - 127]֮�������