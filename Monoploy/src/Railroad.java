public class Railroad extends BoardSpace
	{
		private int oneRoadRent;
		private int twoRoadRent;
		private int threeRoadRent;
		private int fourRoadRent;
		private int mortgage;
		private int price;
		private int numOfRoads;
		
		public Railroad(String n, int l, int r1,int r2, int r3, int r4, int m, int p)
		{
			setName(n);
			setLocation(l);
			oneRoadRent = r1;
			twoRoadRent = r2;
			threeRoadRent = r3;
			fourRoadRent = r4;
			mortgage = m;
			price = p;
			
		}

		public int getRent()
			{
				return oneRoadRent;
			}

		public void setRent(int rent)
			{
				this.oneRoadRent = rent;
			}

		public int getPrice()
			{
				return price;
			}

		public void setPrice(int price)
			{
				this.price = price;
			}


		
	}
