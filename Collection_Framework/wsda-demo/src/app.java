
public class app 
{
	int x=10;

}
class B extends app
{
int x=20;
}
class Test
{
	public static void main(String[] args)
	{
		app a=new B();
		System.out.println(a.x);
	}
}
