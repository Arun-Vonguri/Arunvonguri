package ProducerAndConsumerEx;

public class Student extends Thread
{
    private Institute institute;
    private int number;
    
    public Student(Institute c, int number)
    {
    	institute = c;
    	this.number = number;
    }
    
    public void run()
    {
    	int value = 0;
    	for(int i=0; i<10; i++)
    	{
    		value = institute.get();
    		System.out.println("Student" + this.number + "=" + value);
    	}
    }
}
