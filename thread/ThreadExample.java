package thread;

public class ThreadExample extends Thread{
	static int i=1;
	public void run()   //run method is called by start function
	{
		i++;
	}

	public static void main(String[] args) {
		ThreadExample te=new ThreadExample();
		te.start();
	/*	while(te.isAlive())      //current object is alive print loading
		{
			System.out.println("loading...");
		} */
		System.out.println("1st:" +i);
		i++;
		System.out.println("1st:"+i);
	}

}
