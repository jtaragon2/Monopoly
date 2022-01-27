public class Property extends BoardSpace
	{
		private int price;
		private int housePrice;
		private int rent;
		private int rentOne;
		private int rentTwo;
		private int rentThree;
		private int rentFour;
		private int rentHotel;
		private int mortgage;
		private String color;
		private int houseNum;

		public Property(String n, int l, int p, int hp, int r, int r1, int r2, int r3, int r4, int rh, int m, String c)
			{

				setName(n);
				setLocation(l);
				price = p;
				housePrice = hp;
				rent = r;
				rentOne = r1;
				rentTwo = r2;
				rentThree = r3;
				rentFour = r4;
				rentHotel = rh;
				mortgage = m;
				color = c;

			}

		public void payRent(Player P)
			{
				switch (houseNum)
					{
					case 0:
						{
							P.subtractFromBalance(rent);
						}
					case 1:
						{
							P.subtractFromBalance(rentOne);
						}
					case 2:
						{
							P.subtractFromBalance(rentTwo);
						}
					case 3:
						{
							P.subtractFromBalance(rentThree);
						}
					case 4:
						{
							P.subtractFromBalance(rentFour);
						}
					case 5:
						{
							P.subtractFromBalance(rentHotel);
						}
					}

			}

		public int getRentOne()
			{
				return rentOne;
			}

		public int getPrice()
			{
				return price;
			}

		public void setPrice(int price)
			{
				this.price = price;
			}

		public int getHousePrice()
			{
				return housePrice;
			}

		public void setHouseprice(int houseprice)
			{
				this.housePrice = houseprice;
			}

		public int getRent()
			{
				return rent;
			}

		public void setRent(int rent)
			{
				this.rent = rent;
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

		public void buyHouse(Player p)
			{
				if (p.getBalance() < housePrice)
					{
						p.subtractFromBalance(housePrice);
						houseNum++;

					}
				else
					{
						System.out.println("Transaction not completed");
					}
			}
		

	}