// Java program to illustrate final keyword
final class G {

	// by default it is final.
	void h() {}

	// by default it is not final. //but this instance variable and static in nature hence it will share
	//memory through the whole class.
	static int j = 30;

public static void main(String[] args)
	{
		// See modified contents of variable j.
		j = 36;
		System.out.println(j);
	}
}
