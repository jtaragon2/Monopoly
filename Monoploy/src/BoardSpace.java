
public class BoardSpace
	{
		private String name;
		private int location;
		protected boolean owned;
		public BoardSpace(String n,int l)
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


	}
