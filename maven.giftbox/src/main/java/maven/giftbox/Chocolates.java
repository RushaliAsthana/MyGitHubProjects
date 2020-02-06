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
//	public Chocolates(String type,int quantity,String chocname,double cost,double weight)
//	{
//		this.type=type;
//		this.quantity=quantity;
//		this.chocname=chocname;
//		this.cost=cost;
//		this.weight=weight;
//	}
	public Chocolates(String chocname,double cost,double weight)
	{
		
		this.chocname=chocname;
		this.cost=cost;
		this.weight=weight;
	}
	
//	public void setType(String type){
//	this.type=type;
//	}
//	public void setQuan(int quantity){
//		this.quantity=quantity;
//		}
//	public void setChocname(String chocname){
//		this.chocname=chocname;
//		}
//	public void setCost(double cost){
//		this.cost=cost;
//		}
//	public void setWeight(double weight){
//		this.weight=weight;
//		}
//	public String getType(){
//	return type;
//	}
//	public int getQuan(){
//	return quantity;
//	}
//	public double getCost(){
//	return cost;
//	}
//	public String getChocname(){
//	return chocname;
//	}
//	public double getWight(){
//	return weight;
//	}
}
