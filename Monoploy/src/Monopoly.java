import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
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
		
		public static void checkLocation()
		{
			if(player1.getLocation() == 1);
				{
					player1.addToBalance(200);
				}
				
				
			//checks for properties	
			switch(player1.getLocation())
			{
				case 2:
						{
							System.out.println("You have landed at " + Space.board.get(2).get);
						}
				case 4:
						{
							
						}
				case 7:
						{
							
						}
				case 9:
						{
							
						}
				case 10:
						{
							
						}
				case 12:
						{
							
						}
				case 14:
						{
							
						}
				case 15:
						{
							
						}
				case 17:
						{
							
						}
				case 19:
						{
							
						}
				case 20:
						{
							
						}
				case 22:
						{
							
						}
				case 24:
						{
							
						}
				case 25:
						{
							
						}
				case 27:
						{
							
						}
				case 28:
						{
							
						}
				case 30:
						{
							
						}
				case 32:
						{
					
						}
				case 33:
						{
							
						}
				case 35:
						{
							
						}
				case 38:
						{
							
						}
				case 40:
						{
							
						}
			}
			
		}
		
		
		public static void pause()
		{
			Scanner userFakeInput = new Scanner(System.in);
			String pause;
			pause = userFakeInput.nextLine();
		}
		

	}
