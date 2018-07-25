import java.util.*;
class num
{
	int a;
	int b;
	int c;
	num(int f, int s)
		{
			a=f;
			b=s;
		}
		void compute()
		{
			c=a+b;
			System.out.println(c);
		}
}
class add
	{
		public static void main (String args[]);
		{
			int a,b;
			Scanner c=new Scanner (System.in);
			System.out.println("enter the number");
			a=c.nextInt();
			System.out.println("enter the number");
			b=c.nextInt();
			num add1 = new num(a,b);
			add1.compute();
			}
	}
