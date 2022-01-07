public class Property extends BoardSpace
	{

		private int rent;
		private int price;
		private String color;
		private int numOfHouse;

		
		public Property(String n, int l, int r, int p, String c, int h)
		{
			
			setName(n);
			setLocation(l);
			rent = r;
			price = p;
			color = c;
			numOfHouse = h;
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


		public void setNumOfHouse(int numOfHouse)
			{
				this.numOfHouse = numOfHouse;
			}
		
	}