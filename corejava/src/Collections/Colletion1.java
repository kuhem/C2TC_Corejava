package Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Collection {

	public static void main(String[] args) 
	{
		List<Integer>numbers=new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(110);
		numbers.add(120);
		numbers.add(130);
		numbers.add(150);
List<Integer>newList=numbers.stream().filter(n->n>100).collect(Collectors.toList());
System.out.println(newList);

	}

}
