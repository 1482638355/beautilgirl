
import java.util.*;

public class Listlinked {
	int minx(int y){
		int x = (int)Math.random()*y;
		return x;
	}
	public static void main (String[] args){
		Scanner c=new Scanner(System.in);
		int y=c.nextInt();
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		new Listlinked().minx(y);
		System.out.println("123");
		for(int j=0;j<list.size();j++){
			System.out.println(list.get(j));
		}
	}
}