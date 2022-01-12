public class Property extends BoardSpace
	{
		private int price;
		private int houseprice;
		private int rent;
		private int rentOne;
		private int rentTwo;
		private int rentThree;
		private int rentFour;
		private int rentHotel;
		private int mortgage;
		private String color;
	
		
		
		public Property(String n, int l, int p, int hp, int r, int r1, int r2, int r3, int r4, int rh, int m, String c)
		{
			
			setName(n);
			setLocation(l);
			price = p;
			houseprice = hp;
			rent = r;
			rentOne = r1;
			rentTwo = r2;
			rentThree = r3;
			rentFour = r4;
			rentHotel = rh;
			mortgage = m;
			color = c;
			
			
		}
		

		public int getRentOne()
			{
				return rentOne;
			}



		public void setRentOne(int rentOne)
			{
				this.rentOne = rentOne;
			}



		public int getRentTwo()
			{
				return rentTwo;
			}



		public void setRentTwo(int rentTwo)
			{
				this.rentTwo = rentTwo;
			}



		public int getRentThree()
			{
				return rentThree;
			}



		public void setRentThree(int rentThree)
			{
				this.rentThree = rentThree;
			}



		public int getRentFour()
			{
				return rentFour;
			}



		public void setRentFour(int rentFour)
			{
				this.rentFour = rentFour;
			}



		public int getRentHotel()
			{
				return rentHotel;
			}



		public void setRentHotel(int rentHotel)
			{
				this.rentHotel = rentHotel;
			}



		public int getMortgage()
			{
				return mortgage;
			}



		public void setMortgage(int mortgage)
			{
				this.mortgage = mortgage;
			}



		public String getColor()
			{
				return color;
			}



		public void setColor(String color)
			{
				this.color = color;
			}
		
		
	}