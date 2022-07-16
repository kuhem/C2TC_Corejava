package Stack;
//Java program to demonstrate the
//working of Stack
import java.util.*;
public class Stack2 {

//Main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<String>stack=new Stack<String>();
stack.push("I");
stack.push("dhould");
stack.push("get");
stack.push("placed");
//iterator for the stack
Iterator<String>itr=stack.iterator();
// printing the stack
while(itr.hasNext()) {
	System.out.println(itr.next()+"");
}
System.out.println();
stack.pop();
//Iterator for the stack
itr=stack.iterator();
//printing the stack
while(itr.hasNext()) {
	System.out.println(itr.next()+"");
     }		
   }
}
