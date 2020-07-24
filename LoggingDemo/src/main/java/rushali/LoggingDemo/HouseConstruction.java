package rushali.LoggingDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
public class HouseConstruction{
	Scanner sc=new Scanner(System.in);
	private static Logger LOGGER =LogManager.getLogger(HouseConstruction.class);
	static int standard,totalarea,automationstatus;
	public void dataCollection()
	{
           LOGGER.error("Enter standard of material 1.Standard:Rs1200 2.Above Standard:Rs1500 3.High Standard:Rs1800 :");
           standard=sc.nextInt();
           LOGGER.error("Enter total area in square feet and enter 1.For automation (Rs 2500 extra) 2.Non automated");
           totalarea=sc.nextInt(); automationstatus=sc.nextInt();
           LOGGER.error("Total cost of construction:Rs"+totalCost());
	}
	public static int totalCost()
	{
		if(standard==1)
			standard=1200;
		else if(standard==2)
			standard=1500;
		else
			standard=1800;
		
		if(automationstatus==1)
		{
			return (standard*totalarea)+2500;
		}
		return standard*totalarea;
	}
}