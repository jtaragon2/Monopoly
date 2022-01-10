import java.util.*;
public class Monopoly
	{

		public static void main(String[] args)
			{
				System.out.println(roleDice());
			}
		
		public static int roleDice()
		{
			int dice1 = (int) (Math.random()*6+1);	
			int dice2 = (int) (Math.random()*6+1);	
			return dice1+dice2;
		}
		

	}
