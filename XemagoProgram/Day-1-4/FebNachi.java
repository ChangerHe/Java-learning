//求斐波那契数列的第n项值
public class FebNachi
{
	
	static int FebNachi(int i){
		switch ( i )
		{
		case 1 : return 0;
		case 2 : return 1;
		default : return FebNachi(i -1) + FebNachi(i - 2);
		
		}
	}
	public static void main(String[] args){
		System.out.println(FebNachi(4));
	}
}