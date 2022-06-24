package corejava_package;

public class ImpliRun  implements Runnable
{
	public void run()
	{
		System.out.println("New thread Running");
;
		for(int i=1; i<=10; i++)
			{
			System.out.println(i);
			}
			System.out.println(Thread.currentThread());
			
			}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Main Thread Running");
		ImpliRun th=new ImpliRun();
		Thread t=new Thread(th);
		t.setName("mythread");
				t.start();
		

	}

}
