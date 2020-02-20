package rushali.Interests;
import java.util.*;
public class material {

 	double area;
 	String automationStatus;
 	public material(double area,String automationStatus)
 	{
 		this.area=area;
 		this.automationStatus=automationStatus;
 	}
 	
 	public ArrayList<itenaryOfMaterial> getMaterial()
 	{
 		ArrayList<itenaryOfMaterial> al=new ArrayList<itenaryOfMaterial>();
 		if(automationStatus.equals("N"))
 		{
 			al.add(new itenaryOfMaterial(1,1200,"Standard Material"));
 			al.add(new itenaryOfMaterial(2,1500,"Above Standard Material"));
 			al.add(new itenaryOfMaterial(3,1800,"High Standard Material"));
 		}
 		else
 		{
 			al.add(new itenaryOfMaterial(1,2500,"High Standard Material with Fully automated home"));
 		}
 		return al;
 	}
 	public double calculateCostArea(double area,int cost)
 	{
 		return area*cost;
 	}
}
