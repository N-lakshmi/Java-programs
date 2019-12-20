class test extends Thread 	
{
	public void run()
	{
		
		System.out.println("hi");
	}
		
}
class test2
{
	public static void main(String args[])
	{
		test ob1=new test();
		test ob2=new test();
		test ob3=new test();
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		ob1.setName("kumari");
		System.out.println("obj one name::"+ob1.getName());
		System.out.println("obj one priority::"+ob1.getPriority());
		ob2.setName("lakshmi");
		System.out.println("obj two name::"+ob2.getName());
		System.out.println("obj two priority::"+ob2.getPriority());
		ob3.setName("nlk");
		System.out.println("obj three name::"+ob3.getName());
		System.out.println("obj three priority::"+ob3.getPriority());
		ob1.start();
		ob2.start();
		ob3.start();
	}
}