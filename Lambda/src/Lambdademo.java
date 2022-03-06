interface A
{
	void show();
	}
public class Lambdademo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj;
		obj = () ->  System.out.println("Hello");
		obj.show();
	}

}
