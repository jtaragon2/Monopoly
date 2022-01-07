
public class BoardSpace
	{
		private String name;
		private int location;
		
		public BoardSpace(String n,int l)
		{
			name = n;

			location = l;
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



	}
