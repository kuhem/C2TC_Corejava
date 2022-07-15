package StreamApi;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi1 {
 public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				List<String>animals=new ArrayList<String>();
				animals.add("DOG");
				animals.add("ELEPHANT");
				animals.add("DONKEY");
				Stream<String>Stream=animals.stream();
						Stream<String>stringStream=Stream.map((value)->
		{return value.toLowerCase();
		});
		stringStream.forEach(System.out::println);
		}
				
}	



	


