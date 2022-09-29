package ProducerAndConsumerEx;

public class Lecturer extends Thread 
{
    private Institute institute;
    private int number;
    
    public Lecturer(Institute c, int number)
    {
    	institute = c;
    	this.number = number;
    }
    
    
    public void run()
    {
    	for(int i=0; i<10;i++)
    	{
    		institute.put(i);
    		System.out.println("Course" + this.number + " = " + i);
    		try {
    			sleep((int)(Math.random()*100));
    		}
    		catch(Exception e)
    		{
    			e.printStackTrace();
    		
    		}
    	}
    }
    
}
