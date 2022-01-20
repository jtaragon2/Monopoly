import java.util.Comparator;
public class PropertySorter implements Comparator<Integer>
	{
				public int compare (Integer s1, Integer s2)
				{
					if(s1 < s2)
						return 1;
					else
						return -1;
				}
			}

	
