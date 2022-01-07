import java.util.ArrayList;

public class Player
	{
		private int balance;
		private int location;
		ArrayList<Property> ownedProperties = new ArrayList<Property>();

		public Player()
			{
				balance = 1500;
			}

		public ArrayList<Property> getOwnedProperties()
			{
				return ownedProperties;
			}

		public void setOwnedProperties(ArrayList<Property> ownedProperties)
			{
				this.ownedProperties = ownedProperties;
			}

		public int getBalance()
			{
				return balance;
			}
		public void addToBalance(int b) {
			balance += b;
		}
		public void subtractFromBalance(int b) {
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
		
	}
