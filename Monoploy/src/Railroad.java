public class Railroad extends BoardSpace
	{
		private int rent;
		private int price;
		private int numOfRoads;
		
		public Railroad(String n, int l, int r, int p,  int num)
		{
			setName(n);
			setLocation(l);
			rent = r;
			price = p;
			numOfRoads = num;
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

		public int getNumOfRoads()
			{
				return numOfRoads;
			}

		public void setNumOfRoads(int numOfRoads)
			{
				this.numOfRoads = numOfRoads;
			}
		
	}
