import java.io.*;
class test 
{
	int x=100;
	boolean y;	
	float z;
	char a;
	public void show()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	}
	public static void main(String a[])
	{
		test ob = new test();
		ob.show();
	}
}
