package cognizant;

import java.util.Comparator;

public class SortById implements Comparator<Empp> {

	@Override
	public int compare(Empp e1, Empp e2) {
		
			if(e1.getId() > e2.getId())
			{
				return 1;
			}
			else if(e1.getId() == e2.getId())
			{
				return 0;
			}else
			{
				return -1;
			}
		

	} 
	public int SortByAge(Empp e1, Empp e2) {
		
			if(e1.getAge() > e2.getAge())
			{
				return 1;
			}
			else if(e1.getAge() == e2.getAge())
			{
				return 0;
			}else
			{
				return -1;
			}
		

	} 
	public int SortByPhone(Empp e1, Empp e2) {
		
		if(e1.getPhone() > e2.getPhone())
		{
			return 1;
		}
		else if(e1.getPhone() == e2.getPhone())
		{
			return 0;
		}else
		{
			return -1;
		}
}
}
