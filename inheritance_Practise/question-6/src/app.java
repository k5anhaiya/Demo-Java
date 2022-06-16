
public class app
{
	static int x=11;
	private int y=33;
	public void method1(int x)
	{
		app t=new app();
		this.x=22;
		y=44;
		System.out.println("app.x:"+app.x);
		System.out.println("t.x:"+t.x);
		System.out.println("t.y:"+t.y);
		System.out.println("y:"+y);
	}
	public static void main(String[] args) {
		app t=new app();
		t.method1(5);
	}
}

