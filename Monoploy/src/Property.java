public class Property extends BoardSpace
	{

		private int rent;
		private int price;
		private String color;
		private int numOfHouse = 0;
		private int housePrice;
		
		public Property(String n, int l, int r, int p, String c, int hp)
		{
			
			setName(n);
			setLocation(l);
			rent = r;
			price = p;
			color = c;
			
			housePrice = hp;
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


		public String getColor()
			{
				return color;
			}


		public void setColor(String color)
			{
				this.color = color;
			}


		public int getNumOfHouse()
			{
				return numOfHouse;
			}

		
		
		
	}