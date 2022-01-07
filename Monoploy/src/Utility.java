
public class Utility extends BoardSpace
	{
		private int rent;
		private int price;
		private int numOfUtilities;
		
		public Utility(String n, int l, int r, int p,  int u)
		{
			setName(n);
			setLocation(l);
			rent = r;
			price = p;
			numOfUtilities = u;
		}

		public int getRent()
			{
				return rent;
			}

		public void setRent(int rent)
			{
				this.rent = rent;
			}

		public int getPrice()
			{
				return price;
			}

		public void setPrice(int price)
			{
				this.price = price;
			}

		public int getNumOfUtilities()
			{
				return numOfUtilities;
			}

		public void setNumOfUtilities(int numOfUtilities)
			{
				this.numOfUtilities = numOfUtilities;
			}
		
		
	}
