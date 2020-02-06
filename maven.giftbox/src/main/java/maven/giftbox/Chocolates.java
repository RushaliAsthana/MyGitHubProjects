package maven.giftbox;

public class Chocolates {
	String type;
	//int quantity;
	String chocname;
	double cost;
	double weight;
	
	
	public Chocolates(String type,String chocname,double cost,double weight)
	{
		this.type=type;
		this.chocname=chocname;
		this.cost=cost;
		this.weight=weight;
	}

	public Chocolates(String chocname,double cost,double weight)
	{
		
		this.chocname=chocname;
		this.cost=cost;
		this.weight=weight;
	}
	

}
