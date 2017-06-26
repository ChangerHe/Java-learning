class  WapperDemo
{
	public static void main(String[] args) 
	{ 
		Integer i1 = new Integer(123);    //包装类的方法之一
		Integer i2 = new Integer(123);  
		System.out.println(i1 == i2);

		Integer i3 = Integer.valueOf(200);  //包装类的另一种方法，推荐此方法
		Integer i4 = Integer.valueOf(200);
		System.out.println(i3 == i4);

		Integer i5 = 123;  //包装类的简化方法（语法糖，实际还是valueOf的方法）
		Integer i6 = 123;
		System.out.println(i5 == i6);

		System.out.println(i3.equals(i4));  //并非比较其地址值，而是比较其字面值
		
	}
}
//包装对象中，因有缓存机制，因此缓存在[-128 - 127]的中间的数值有Byte，Short,Integer，Long
//但是Character例外，只缓存[0 - 127]之间的数据