package corejava_package;

public class Threading{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t =Thread.currentThread();
System.out.println("Thread is "+t.getName());
t .setName("Hemanth");
System.out.println("new Thread is ="+t.getName());
 
	}

}
