class test extends Thread 	
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				System.out.println("Thread Id::"+Thread.currentThread().getId());
				Thread.sleep(1000);
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}
class test1
{
	public static void main(String args[])
	{
		test ob1=new test();
		test ob2=new test();
		ob1.start();
		ob2.start();
		//ob1.run();
		//ob2.run();
		System.out.println("obj one::"+ob1.getName());
		System.out.println("obj two::"+ob2.getName());
	}
}