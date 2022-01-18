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
System.out.println(chanceNum);
switch(chanceNum)
{
	
	case 0:
			{
				System.out.println("Go to directly to jail, dont pass go");
				Monopoly.player1.setLocation(10);
				break;
			}
		
	case 1:
			{
				System.out.println("You have income tax!, pay up $100! ");
				if(Monopoly.player1.getBalance()<100)
					{
						System.out.println("Go to directly to jail, dont pass go");
						Monopoly.player1.setLocation(10);
					}
			
				Monopoly.player1.subtractFromBalance(100);
				break;
			}
	case 2:
			{
				System.out.println("Advance to Boardwalk!");
				Monopoly.player1.setLocation(39);
				break;
			}
	

}
}
	}

		
		
	
