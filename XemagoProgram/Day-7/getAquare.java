//�������Ρ����Ρ�Բ�ε����
class circle
{
	private Integer r;
	circle (Integer r)
	{
		this.r = r;
	}
	public double gerArea()
	{
		return 3.14 * r * r;
	}
}
class  getSquare
{
	public static void main(String[] args) 
	{
		circle s1 = new circle(10);
		System.out.println(s1);
	}
}