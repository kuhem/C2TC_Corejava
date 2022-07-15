package Interface;
interface Runnable
{
	public void run(int speed);

}

public class InterfaceRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int speed=150;
Runnable r=(carSpeed)->
{
	System.out.println("Running at the speed of:"+carSpeed);	
};
r.run(speed);
Runnable r1=(int carSpeed)->{
	System.out.println("Running at the speed of:"+carSpeed);
}; 
r1.run(speed);
	}

}
