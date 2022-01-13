import java.util.ArrayList;
public class Chance 
	{
static ArrayList<Card> chance = new ArrayList<Card>();
public static void ccards()
{
chance.add(new Card( "Go directly to jail, dont pass go "));	
chance.add(new Card("Income tax, pay 100$"));
chance.add(new Card("You won the lottery, collect $250"));	
	
	
}
public static void landChance()
{
int chanceNum = (int)(Math.random()*3);
switch(3)
{
	case 1:
			{
				System.out.println("Go to directly to jail, dont pass go");
				Monopoly.player1.incrementLocation(3);
			}
	case 2:
			{
				System.out.println("You have income tax!, pay up!");
			
				//Player.getBalance()-=100;
			}
	case 3:
			{
				System.out.println("Go to directly to jail, dont pass go");
				Monopoly.player1.incrementLocation(3);
			}
	
}

		
		
	}
