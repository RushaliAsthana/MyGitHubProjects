package maven.giftbox;
import java.util.*;
public class giftbox {
	static Scanner sc;
	public static void main(String args[])
	{
		 sc=new Scanner(System.in);
		System.out.println("Select your gift box:");
		System.out.println("1.Chocolate 2.Sweets");
		int choice=sc.nextInt();
		ArrayList<Chocolates> al=new ArrayList<Chocolates>();
		double totwt=0.0;
		switch(choice)
		{
		case 1://get choco giftbox and get the total weight; sort your gist box and find particular choco
		{
			ListOfSweetsandChocs l=new ListOfSweetsandChocs();
			al=l.addChocolates();
			System.out.println("Your Gift:");
			Iterator<Chocolates> itr=al.iterator();
			while(itr.hasNext())
			{
				Chocolates ch=(Chocolates)itr.next();
				System.out.println(ch.type+" "+ch.chocname+" "+ch.cost+" "+ch.weight);
				 totwt+=ch.weight;
			}
			
			System.out.println("Total Weight of Gift:"+totwt);
			Collections.sort(al,new Sort());
			System.out.println("Sorted Gift By Type");
			Iterator<Chocolates> itr1=al.iterator();
			while(itr1.hasNext())
			{
				Chocolates ch1=(Chocolates)itr1.next();
				String t=ch1.type;
				System.out.println(ch1.chocname);
				
			}
			
			ArrayList<String>tlist=new ArrayList<String>();
			System.out.println("Enter the type of Chocolate you want:");
			String t=sc.next();
			tlist=l.findChocolates(al, t);
			for(String a:tlist)
			{
				System.out.println(a);
			}
			break;
		}
		case 2:{
			ListOfSweetsandChocs l=new ListOfSweetsandChocs();
			al=l.addSweets();
			System.out.println("Your Gift:");
			Iterator<Chocolates> itr=al.iterator();
			while(itr.hasNext())
			{
				Chocolates ch=(Chocolates)itr.next();
				System.out.println(ch.chocname+" "+ch.cost+" "+ch.weight);
				 totwt+=ch.weight;
			}
			
			System.out.println(totwt);
			break;
		}
		}
		
		
	}
 
}

