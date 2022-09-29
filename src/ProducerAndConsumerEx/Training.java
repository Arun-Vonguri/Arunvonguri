package ProducerAndConsumerEx;

public class Training 
{
   public static void main(String[] args)
   {
	   Institute in = new Institute();
	   Lecturer l = new Lecturer(in, 1);
	   Student s = new Student(in, 1);
	   l.start();
	   s.start();
   }
}
