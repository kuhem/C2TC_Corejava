package corejava_package;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		
		List<String>animals=new ArrayList<String>();
		animals.add("DOG");
		animals.add("ELEPHANT");
		animals.add("DONKEY");
		Stream<String>stream=animals.stream();
				Stream<String>Stream=stream.map((value)->
{return value.toLowerCase();
});
stringStream.forEach(System.out::println);
}
		
	}


