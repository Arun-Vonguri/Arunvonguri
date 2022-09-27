package Java_frstmonth;

import java.util.*;

public class Probability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random color= new Random();
		int ran=color.nextInt(4);
		int red=color.nextInt(10);
		int blue=color.nextInt(10);
		int green=color.nextInt(10);
		System.out.println("Probability of winning of red is : " +red+ " green is : " +green+ " blue is : " +blue+ "");

	}

}
