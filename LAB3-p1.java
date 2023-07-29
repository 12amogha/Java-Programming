class NewThread implements Runnable
{
	Thread t;
	
	NewThread()
	{
		t = new Thread(this,"Second Thread");
		System.out.println("Child Thread");
		t.start();
	}
	
	public void run()
	{
		try
		{
			for(int i= 1;i<5;i++)
			{
				System.out.println("Child Thread "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child Interrupted");
		}
		System.out.println("Child Exits");
	}
}
class Main
{
	public static void main(String args[])
	{
		NewThread ob = new NewThread();
		try
		{
			for(int i = 5;i>1;i--)
			{
				System.out.println("Main Thread "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
			
		}
		try
		{
			ob.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread waiting is interrupted");
		}
		System.out.println("Main thread exits");
	}
	
}

