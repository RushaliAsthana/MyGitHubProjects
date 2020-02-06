package maven.giftbox;
import java.util.*;
public class Sort implements Comparator<Chocolates> {

	
             @Override
			 public int compare(Chocolates a,Chocolates b)
			{
				
				
				int name=a.type.compareTo(b.type);
				
				return name;
				
			}
			
		
	
	
}
