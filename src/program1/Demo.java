package program1;

class Tester
{
	static int x=10;
	
}
class Sample extends Tester
{
	 static void add()
	{
		System.out.println("heelo shradhha");
	}
	
}
public class Demo extends Sample
{

	public static void main(String[] args)
	{
		//Sample s= new Sample();
		System.out.println(x);
		
		add();
		
	}

}
