package rushali.LoggingDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
class SimpleCompoundIntrest{
	private static Logger LOGGER =LogManager.getLogger(SimpleCompoundIntrest.class);
	static double principle,rate,years;
	public void calculateIntrest()
	{
		Scanner sc=new Scanner(System.in);
		LOGGER.debug("Enter the amount,number of years,rate of intrest:");
		principle=sc.nextDouble();
		years=sc.nextDouble();
		rate=sc.nextDouble();
		LOGGER.debug("Enter the type of intrest 1.Simple Intrest 2.Compound Intrest 3.Both");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:{
			LOGGER.debug("Simple Intrest is: Rss"+simpleIntrest());
			break;
		}
		case 2:{
			LOGGER.debug("Compound Intrest is: Rs"+compoundIntrest());
			break;
		}
		case 3:{
			LOGGER.debug("Simple Intrest is: Rs"+simpleIntrest());
			LOGGER.debug("Compound Intrest is: Rs"+compoundIntrest());
			break;
		}
		}
	}
	static double simpleIntrest()
	{
		return (principle*rate*years)/100;
	}
	static double compoundIntrest()
	{
		return principle * Math.pow(1.0+rate/100.0,years) - principle;
	}
}