package corejava_package;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Std {
	public static void main(String[]args)
			{
		List<Integer>numbers=new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(110);
		numbers.add(120);
		numbers.add(130);
		numbers.add(150);
		System.out.println(numbers);
		Stream<Integer>stream=numbers.stream();
		Optional<Integer>sum=stream.reduce(Integer::sum);
		System.out.println("ans="+sum.get());
			}
}


