
public class Test {
	public static void main(String[] args) {
		Object obj=new Object();
		EvenOdd eo1=new EvenOdd(obj);
		EvenOdd eo2=new EvenOdd(obj);
		
	Thread t1=new Thread(eo1);
	Thread t2=new Thread(eo2);	
	t1.setName("Even");
	t2.setName("Odd");
		
	t1.start();
	t2.start();
		//new Thread(eo1,"Even").start();
		//new Thread(eo2,"Odd").start();
	}

}
