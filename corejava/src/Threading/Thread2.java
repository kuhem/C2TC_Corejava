package Threading;


public class Thread2 extends Thread
{
	public void run()
	{
	System.out.println("hey there");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t=new Thread2();
t.start();
t.run();
	}

}
