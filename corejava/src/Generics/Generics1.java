package Generics;



public class Generics1 {
	public<T> void methodgen(T var1)
	{
		System.out.println("The value passed is of the type:"+var1.getClass().getSimpleName());
	}

	public static void main(String[] args) {
		Generics1 ob=new Generics1();
		ob.methodgen("is the best");
		ob.methodgen("learning Java");
		ob.methodgen(154);
		ob.methodgen(3.14);
		ob. methodgen(995656521);
	    ob.methodgen('a');
	
	}
}
