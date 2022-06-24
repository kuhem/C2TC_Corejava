package corejava_package;

public class ThreadDemo extends Thread
{
	public void run()
	{
	System.out.println("hey there");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t=new ThreadDemo();
t.start();
t.run();
	}

}
