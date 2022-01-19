import java.util.*;

public class Spaces
	{
		
		static ArrayList<BoardSpace> board = new ArrayList<BoardSpace>();
		
		
		
		public static void fillboard()
			{			
				board.add(new BoardSpace("Go", 1));
				board.add(new Property("Mediterranean Avenue", 2, 60, 50, 2, 10, 30, 90, 160, 250, 30, "Brown"));
				board.add(new BoardSpace("Community Chest Card", 3));
				board.add(new Property("Baltic Avenue", 4, 60, 50, 4, 20, 60, 180, 320, 450, 30,  "Brown"));
				board.add(new BoardSpace("Income Tax", 5));
				board.add(new Railroad("Reading Railroad", 6, 25, 50, 100, 200, 100, 200));
				board.add(new Property("Oriental Avenue", 7, 100, 50, 6, 30, 90, 270, 400, 550, 50, "Light Blue"));
				board.add(new BoardSpace("Chance Card", 8));
				board.add(new Property("Vermont Avenue", 9, 100, 50, 6, 30, 90, 270, 400, 550, 50, "Light Blue"));
				board.add(new Property("Connecticut Avenue", 10, 120, 50, 8, 40, 100, 300, 450, 600, 60, "Light Blue"));
				board.add(new BoardSpace("Jail", 11));
				board.add(new Property("St. Charles Place", 12, 140, 100, 10, 50, 150, 450, 625, 750, 70, "Pink"));
				board.add(new Utility("Electric Company", 13, 150, 0));
				board.add(new Property("States Avenue", 14, 140, 100, 10, 50, 150, 450, 625, 750, 70, "Pink"));
				board.add(new Property("Virginia Avenue", 15, 160, 100, 12, 60, 180, 500, 700, 900, 80, "Pink"));
				board.add(new Railroad("Pennsylvania Railroad", 16, 25, 50, 100, 200, 100, 200));
				board.add(new Property("St. James Place", 17, 180, 100, 14, 70, 200, 550, 750, 950, 90, "Orange"));
				board.add(new BoardSpace("Community Chest", 18));
				board.add(new Property("Tennessee Avenue", 19, 180, 100, 14, 70, 200, 550, 750, 950, 90, "Orange"));
				board.add(new Property("New York Avenue", 20, 200, 100, 16, 80, 220, 600, 800, 1000, 100, "Orange"));
				board.add(new BoardSpace("Free Parking", 21));
				board.add(new Property("Kentucky Avenue", 22, 220, 150, 18, 90, 250, 700, 875, 1050, 110, "Red"));
				board.add(new BoardSpace("Chance Card", 23));
				board.add(new Property("Indiana Avenue", 24, 220, 150, 18, 90, 250, 700, 875, 1050, 110, "Red"));
				board.add(new Property("Illinois Avenue", 25, 240, 150, 20, 100, 300, 750, 925, 1100, 120, "Red"));
				board.add(new Railroad("B. & O. Railroad", 26, 25, 50, 100, 200, 100, 200));
				board.add(new Property("Atlantic Avenue", 27, 260, 150, 22, 110, 330, 800, 975, 1150, 130, "Yellow"));
				board.add(new Property("Ventnor Avenue", 28, 260, 150, 22, 110, 330, 800, 975, 1150, 130, "Yellow"));
				board.add(new Utility("Water Works", 29, 150, 0));
				board.add(new Property("Marvin Gardens", 30, 280, 150, 24, 120, 360, 850, 1025, 1200, 140, "Yellow"));
				board.add(new BoardSpace("Go To Jail", 31));
				board.add(new Property("Pacific Avenue", 32, 300, 200, 26, 130, 390, 900, 1100, 1275, 150, "Green"));
				board.add(new Property("North Carolina Avenue", 33, 300, 200, 26, 130, 390, 900, 1100, 1275, 150, "Green"));
				board.add(new BoardSpace("Community Chest", 34));
				board.add(new Property("Pennsylvania Avenue", 35, 320, 200, 28, 150, 450, 1000, 1200, 1400, 160, "Green"));
				board.add(new Railroad("Short Line", 36, 25, 50, 100, 200, 100, 200));
				board.add(new BoardSpace("Chance Card", 37));
				board.add(new Property("Park Place", 38, 350, 200, 35, 175, 500, 1100, 1300, 1500, 175, "Dark Blue"));
				board.add(new BoardSpace("Luxury Tax", 39));
				board.add(new Property("Boardwalk", 40, 400, 200, 50, 200, 600, 1400, 1700, 2000, 200, "Dark Blue"));
				
				

			}
	}
