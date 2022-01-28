import java.util.Scanner;

public class BoardSpace
	{
		private String name;
		private int location;
		protected boolean owned = false;
		private static Scanner userIntInput = new Scanner(System.in);

		public BoardSpace(String n, int l)
			{
				name = n;
				location = l;
			}

		public BoardSpace()
			{

			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getLocation()
			{
				return location;
			}

		public void setLocation(int location)
			{
				this.location = location;
			}

		public boolean isOwned()
			{
				return owned;
			}

		public void setOwned(boolean owned)
			{
				this.owned = owned;
			}

		public int getPrice()
			{
				return 1;
			}

		public void buyBoardSpace(Player p)
			{

				// ( (Property) Spaces.board.get(Monopoly.player1.getLocation())).getPrice()

				System.out.println("This Property is unowned. Do you want to buy it?");
				System.out.println("1 - Yes");
				System.out.println("2 - No");
				int playerChoice = userIntInput.nextInt();

				if (playerChoice == 1)
					{
						System.out.println("This Property's Cost Is: "
								+ ((Property) Spaces.board.get(p.getLocation() )).getPrice());
						int price = ((Property) Spaces.board.get(p.getLocation() )).getPrice();
						System.out.println("This Cost will now be subtracted from your balance");
						p.subtractFromBalance(price);
						System.out.println("Your balance is now: " + p.getBalance());

						p.ownedProperties.add(p.getLocation());
						owned = true;
					}

			}

		public void payRent(Player P)
			{

			}

	}
