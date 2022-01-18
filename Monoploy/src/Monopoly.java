import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class Monopoly
	{

		static Player player1 = new Player();
		static Scanner stringGetter = new Scanner(System.in);
		private static String choice;
		public static void main(String[] args)
			{
				Spaces.fillboard();
				System.out.println("Welcome to Monopoly your staring balance is " + player1.getBalance() + ".\nPress Enter to Role the dice!" );
				pause();
				
				boolean h = true;
				
				while(h)
					{
						movePlayer();
						checkLocation();
						pause();
					}

				
			}
		
		
		
		public static int rollDice()
		{
			int dice1 = (int) (Math.random()*6+1);	
			int dice2 = (int) (Math.random()*6+1);	
			return dice1+dice2;
		}
		public static int ranNum() {
			return (int) (Math.random()*6+1);
		}
		
	public static void movePlayer()
		{
			if (player1.isJailStatus())
				{
					int turnsInJail = 0;
					if (turnsInJail == 0)
						{
							System.out.println("You're in jail");
						}
					else
						{
							System.out.println("You're still in jail");
						}
					System.out.println("\n Would you like to \ta) Roll the dice to get out \tb) Pay the fine of $200");
					System.out.println("Your balance is $" + player1.getBalance());
					choice = stringGetter.nextLine();
					if (choice.equalsIgnoreCase("a"))
						{
							int die1 = ranNum();
							int die2 = ranNum();
							System.out.println("You rolled a " + die1 + " a " + die2);
							if (die1 == die2)
								{
									System.out.println("Those are doubles! You're free to go");
									player1.setJailStatus(false);
								}
							else
								{
									System.out.println("Those are not doubles");
									turnsInJail ++;
								}
						}
					else
						{
							player1.subtractFromBalance(200);
							System.out.println("Your balance is now $" + player1.getBalance());
							player1.setJailStatus(false);
							
						}
				}
			else
				{
					int b = rollDice();
					player1.incrementLocation(b);
				}
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
							player1.subtractFromBalance(100);
							System.out.println("Income Tax: Pay $100 to the bank!\nYour balance is now "+player1.getBalance()+"!");
							break;
						}
				case 6:
						{
							System.out.println("You have landed at the " + Spaces.board.get(5).getName() + "!");
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
				case 11:
						{
							System.out.println("You have landed at the " + Spaces.board.get(10).getName() + "! You are just visiting!");
							break;
						}
				case 12:
						{
							System.out.println("You have landed at " + Spaces.board.get(11).getName() + "!");
							break;
						}
				case 13:
						{
							System.out.println("You have landed at the " + Spaces.board.get(12).getName() + "!");
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
				case 16:
						{
							System.out.println("You have landed at the " + Spaces.board.get(15).getName() + "!");
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
				case 21:
						{
							player1.addToBalance(500);
							System.out.println("Free Parking!!!!! You gained $500!\nYour balance is now " +player1.getBalance()+"!");
							
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
				case 26:
						{
							System.out.println("You have landed at the " + Spaces.board.get(25).getName() + "!");
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
				case 29:
						{
							System.out.println("You have landed at the " + Spaces.board.get(28).getName() + "!");
							break;
						}
				case 30:
						{
							System.out.println("You have landed at " + Spaces.board.get(29).getName() + "!");
							break;
						}
				case 31:
						{
							System.out.println("You have done something illegal and now must go to Jail....");
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
				case 36:
						{
							System.out.println("You have landed at the " + Spaces.board.get(35).getName() + "!");
							break;
						}
				case 37:
						{
							System.out.println("You landed on a chance card!");
							break;
						}
				case 38:
						{
							System.out.println("You have landed at " + Spaces.board.get(37).getName() + "!");
							break;
						}
				case 39:
						{
							player1.subtractFromBalance(75);
							System.out.println("You have landed on " + Spaces.board.get(37).getName() + " and must pay $75 to the bank!\nYour balance is now " +player1.getBalance()+"!");
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
