package thread;

public class RunnableExample implements Runnable {

	public static void main(String[] args) {
		RunnableExample re=new RunnableExample();
		Thread t=new Thread(re);
		Thread t2=new Thread(re);
		t.start();
		t2.start();
	
	}

	@Override
	public void run() {
		for(int i=0;i<50;i++)
		{
			System.out.println(i+" ");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
		
	}

}
