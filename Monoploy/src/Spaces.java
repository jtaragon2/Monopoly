import java.util.*;

public class Spaces
	{
		
		static ArrayList<BoardSpace> board = new ArrayList<BoardSpace>();
		
		
		
		public static void fillboard()
			{			
				board.add(new BoardSpace("Go", 1));
				board.add(new Property("prop", 2, 24, 60, "Brown", 0));
			}
	}
