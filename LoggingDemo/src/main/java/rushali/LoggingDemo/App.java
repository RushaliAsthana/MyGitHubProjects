package rushali.LoggingDemo;

import org.apache.logging.log4j.Logger ;

import org.apache.logging.log4j.LogManager;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
	private static Logger LOGGER =LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        LOGGER.fatal("Enter 1. for Simple compound intrest program 2. for house construcion program");
        int choice=sc.nextInt();
        switch(choice)
        {
        case 1: 
        {
        	 SimpleCompoundIntrest obj=new  SimpleCompoundIntrest();
             obj.calculateIntrest();
             break;
        }
        case 2:
        {
        	 HouseConstruction obj1=new HouseConstruction();
             obj1.dataCollection();	
        }
        }
    }
}
