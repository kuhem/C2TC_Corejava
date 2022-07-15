package Stack;
import java.util.Iterator;
import java.util.Stack;
public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String>str=new Stack<String>();
		str.push("time");
		str.push("is");
		str.push("precious");
		str.push("dont");
		str.push("waste it");
		System.out.println("Total elements are"+str);
		System.out.println("Size of the string is:"+str.size());
		System.out.println("The popped element is:"+str.pop());
		System.out.println("Peeked element is:"+str.peek());
		System.out.println("Is the stack emty?"+str.empty());
		Iterator itr=str.iterator();
		System.out.println("Using iterator:");
		{
			System.out.println(itr.next()+"");
		}
		for(int i=0;i<2;i++)
		{
			System.out.println("Popped at"+ i +":"+str.pop()+".");
			
		}
		itr=str.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+"");
		}
	}

}
