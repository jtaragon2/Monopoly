import java.util.*;
public class Monopoly
	{

		static Player player1 = new Player();
		
		public static void main(String[] args)
			{
				System.out.println("Welcome to Monopoly your staring balance is " + player1.getBalance() + "." );
				pause();
			}
		
		
		
		public static int roleDice()
		{
			int dice1 = (int) (Math.random()*6+1);	
			int dice2 = (int) (Math.random()*6+1);	
			return dice1+dice2;
		}
		
		
		public static void pause()
		{
			Scanner userFakeInput = new Scanner(System.in);
			String pause;
			pause = userFakeInput.nextLine();
		}
		

	}
