package rushali.Interests;
import java.util.*;
public class construction {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total area of the house:");
		double area=sc.nextDouble();
		System.out.println("Automated or Not Automated(A/N)");
		String automationStatus=sc.next();
		
		material matObject=new material(area,automationStatus);
        ArrayList<itenaryOfMaterial> al=matObject.getMaterial();
		Iterator<itenaryOfMaterial> i=al.iterator();
		while(i.hasNext())
		{
			itenaryOfMaterial imaterial=(itenaryOfMaterial) i.next();
			System.out.println(imaterial.id+"."+imaterial.cost+" "+imaterial.materialStandard);
		}
		System.out.println("Enter choice(no):");
		int cost=0;
		int choice=sc.nextInt();
		
		for(itenaryOfMaterial itenary:al)
		{
			if(itenary.id==choice)
			{
				cost=itenary.cost;
				break;
			}
		}
		
		System.out.println("Your Estimated Cost is:"+Math.round(matObject.calculateCostArea(area,cost)*100.0)/100.0);
		
	}
}
