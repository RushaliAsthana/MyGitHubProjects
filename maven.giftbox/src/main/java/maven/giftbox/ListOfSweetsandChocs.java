package maven.giftbox;
import java.util.*;
public class ListOfSweetsandChocs implements defGifts {

	ArrayList<Chocolates>c=new ArrayList<Chocolates>();
	ArrayList<Chocolates> d=new ArrayList<Chocolates>();
	public ArrayList<Chocolates> addChocolates()
	{
		
		Chocolates choc=new Chocolates("Milk","DairyMilk",25.50,100);
		Chocolates choc1=new Chocolates("Milk","Galaxy",30.75,150);
		Chocolates choc2=new Chocolates("Dark","Bourville",35,130);
		Chocolates choc3=new Chocolates("Dark","Lindt",50,200);
		Chocolates choc4=new Chocolates("Caramel","Mars",50,130);
		Chocolates choc5=new Chocolates("Caramel","5 star",20,50);
		Chocolates choc6=new Chocolates("Caramel","caremello",100,150);
		c.add(choc);
		c.add(choc1);
		c.add(choc2);
		c.add(choc3);
		c.add(choc4);
		c.add(choc5);
		c.add(choc6);
		return c;
	}
	
	public ArrayList<Chocolates> addSweets()
	{
		Chocolates sweet=new Chocolates("GulabJamun",500.45,300);
		Chocolates sweet1=new Chocolates("Ras Malai",600.75,200);
		Chocolates sweet2=new Chocolates("Khalakhan",300.45,100);
		Chocolates sweet3=new Chocolates("Barfi",300.45,150.76);
		Chocolates sweet4=new Chocolates("Jalebi",500.45,500);
		d.add(sweet);
		d.add(sweet1);
		d.add(sweet2);
		d.add(sweet3);
		d.add(sweet4);
		return d;
	}
	
	public ArrayList<String> findChocolates(ArrayList<Chocolates>al,String type)
	{
	  ArrayList<String> list=new ArrayList<String>();
	  Iterator<Chocolates>itr=al.iterator();
	  while(itr.hasNext())
	  {
		  Chocolates c=(Chocolates)itr.next();
		  if(type.equalsIgnoreCase(c.type))
		  {
			  list.add(c.chocname);
		  }
	  }
	  return list;
	}
}
