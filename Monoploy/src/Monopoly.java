import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class Monopoly
	{

		static Player player1 = new Player();
		
		public static void main(String[] args)
			{
				Spaces.fillboard();
				System.out.println("Welcome to Monopoly your staring balance is " + player1.getBalance() + ".\nPress Enter to Role the dice!" );
				pause();
				
				
			}
		
		
		
		public static int rollDice()
		{
			int dice1 = (int) (Math.random()*6+1);	
			int dice2 = (int) (Math.random()*6+1);	
			return dice1+dice2;
		}
		
		public static void movePlayer()
		{
			int b = rollDice();
			player1.incrementLocation(b);
		}
		
		
		
		public static void checkLocation()
		{	
				
			//checks for properties	
			switch(player1.getLocation())
			{
				
				case 1:
						{
							player1.addToBalance(200);
							System.out.println("You are at GO");
							break;
						}
				case 2:
						{
							System.out.println("You have landed at " + Spaces.board.get(1).getName() + "!");
							break;
						}
				case 3:
						{
							System.out.println("You landed on a community chest!");
							break;
						}
				case 4:
						{
							System.out.println("You have landed at " + Spaces.board.get(3).getName() + "!");
							break;
						}
				case 5:
						{
							System.out.println("Income Tax: Pay $100 to the bank!");
							player1.subtractFromBalance(100);
							break;
						}
				case 7:
						{
							System.out.println("You have landed at " + Spaces.board.get(6).getName() + "!");
							break;
						}
				case 8:
						{
							System.out.println("You landed on a chance card!");
							break;
						}
				case 9:
						{
							System.out.println("You have landed at " + Spaces.board.get(8).getName() + "!");
							break;
						}
				case 10:
						{
							System.out.println("You have landed at " + Spaces.board.get(9).getName() + "!");
							break;
						}
				case 12:
						{
							System.out.println("You have landed at " + Spaces.board.get(11).getName() + "!");
							break;
						}
				case 14:
						{
							System.out.println("You have landed at " + Spaces.board.get(13).getName() + "!");
							break;
						}
				case 15:
						{
							System.out.println("You have landed at " + Spaces.board.get(14).getName() + "!");
							break;
						}
				case 17:
						{
							System.out.println("You have landed at " + Spaces.board.get(16).getName() + "!");
							break;
						}
				case 18:
						{
							System.out.println("You landed on a community chest!");
							break;
						}
				case 19:
						{
							System.out.println("You have landed at " + Spaces.board.get(18).getName() + "!");
							break;
						}
				case 20:
						{
							System.out.println("You have landed at " + Spaces.board.get(19).getName() + "!");
							break;
						}
				case 22:
						{
							System.out.println("You have landed at " + Spaces.board.get(21).getName() + "!");
							break;
						}
				case 23:
						{
							System.out.println("You landed on a chance card!");
							break;
						}
				case 24:
						{
							System.out.println("You have landed at " + Spaces.board.get(23).getName() + "!");
							break;
						}
				case 25:
						{
							System.out.println("You have landed at " + Spaces.board.get(24).getName() + "!");
							break;
						}
				case 27:
						{
							System.out.println("You have landed at " + Spaces.board.get(26).getName() + "!");
							break;
						}
				case 28:
						{
							System.out.println("You have landed at " + Spaces.board.get(27).getName() + "!");
							break;
						}
				case 30:
						{
							System.out.println("You have landed at " + Spaces.board.get(29).getName() + "!");
							break;
						}
				case 32:
						{
							System.out.println("You have landed at " + Spaces.board.get(31).getName() + "!");
							break;
						}
				case 33:
						{
							System.out.println("You have landed at " + Spaces.board.get(32).getName() + "!");
							break;
						}
				case 34:
						{
							System.out.println("You landed on a community chest!");
							break;
						}
				case 35:
						{
							System.out.println("You have landed at " + Spaces.board.get(34).getName() + "!");
							break;
						}
				case 38:
						{
							System.out.println("You have landed at " + Spaces.board.get(37).getName() + "!");
							break;
						}
				case 40:
						{
							System.out.println("You have landed at " + Spaces.board.get(39).getName() + "!");
							break;
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
