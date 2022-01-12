import java.util.ArrayList;

public class Player
	{
		private int balance;
		private int location = 1;
		ArrayList<Integer> ownedProperties = new ArrayList<Integer>();
		
		public Player()
			{
				balance = 1500;
			}

		public void buyProperty(int index, int price)
			{
				if (price <= balance)
					{
						subtractFromBalance(price);
					ownedProperties.add(index);
					} else
					{
						System.out.println("You can't afford that");
					}
				
			}
		public void buyHouse(int location) {
			Spaces.board.get(location);
			
		}

		public int getBalance()
			{
				return balance;
			}

		public void addToBalance(int b)
			{
				balance += b;
			}

		public void subtractFromBalance(int b)
			{
				balance -= b;
			}

		public int getLocation()
			{
				return location;
			}

		public void setLocation(int location)
			{
				this.location = location;
			}
		public void incrementLocation(int il) {
			location += il;
		}
	}
