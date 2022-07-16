package Packages_DefaultSpecifiers;
/* we are importing the otherpackage 
 * but still we will get error because the
 * class we are trying to use has default access
 * modifier.
 */


public class AdditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj=new Addition();
		/*it will throw error because we are trying to access
		 * the default method in another package
		 */
		obj.addTwoNumbers(20,20);

	}

}
