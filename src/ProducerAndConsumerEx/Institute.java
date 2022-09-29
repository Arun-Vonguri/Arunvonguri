package ProducerAndConsumerEx;

public class Institute 
{
	private int courses;
	private boolean available = false;
	
	public synchronized int get()
	{
		while(available == false) 
		{
			try {
				wait();
			}
			catch(Exception e) {
			}
		}
		available = false;
		notifyAll();
		return courses;
	}
	public synchronized void put(int value) 
	{
		while (available == true)
		{
			try {
				wait();	
			}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
 courses = value;
 available = true;
	}



	}


