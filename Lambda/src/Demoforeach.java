import java.util.Arrays;
import java.util.List;

//External Loops
//Internal Loops
public class Demoforeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = Arrays.asList(4,5,6,7,8);
		
		for(int i=0;i<values.size(); i++)
		{
			System.out.println(values.get(i));
		}
		for(int i : values)
		{
			System.out.println(i);
		}
	}

}
