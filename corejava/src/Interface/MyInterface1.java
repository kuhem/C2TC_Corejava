package Interface;
interface MyInterface
{
	/*compiler will treat them as:
	 * public void abstract void method1();
	 * public abstract void method2();
	 */
	public void method1();
	public void method2();
}
public class MyInterface1 implements MyInterface
{
	/*This class must have to implement both abstract methods
	 * else you will get compilation error
	 */
public void method1()
{
	System.out.println("implemention of method1");
}
public void method2()
{
	System.out.println("implemention of method2");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyInterface obj=new MyInterface1();
obj.method1();
obj.method2();
	}

}
