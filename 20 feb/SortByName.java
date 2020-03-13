package cognizant;

import java.util.Comparator;

public class SortByName implements Comparator<Empp> 
{
	
	

	@Override
	public int compare(Empp e1, Empp e2) {
		return e1.getName().compareTo(e2.getName());
	}


}
