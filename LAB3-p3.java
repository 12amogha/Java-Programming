class ThreadA extends Thread
{
	char c;
	ThreadA(char ch)
	{
		c=ch;
	}
	public void run()
	{
		for(int i = 1;i<10;i++)
		System.out.println("First thread "+c);
		try
		{
			sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread A interrupted");
		}
	}
}

class ThreadB extends Thread
{
	char b;
	ThreadB(char ch1)
	{
		b=ch1;
	}
	public void run()
	{
		for(int i=1;i<5;i++)
			System.out.println("ThreadB prints "+b);
		try
		{
			sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread A interrupted");
		}
	}
}
public class Main
{
	public static void main(String args[])
	{
		ThreadA obj1=new ThreadA('A');
		ThreadB obj2=new ThreadB('B');
		obj1.start();
		obj2.start();
		try
		{
			obj2.join();
			System.out.println("Main Thread Exits");
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread A interrupted");
		}
	}
}
