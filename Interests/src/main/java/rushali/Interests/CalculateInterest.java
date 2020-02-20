package rushali.Interests;
public class CalculateInterest {
	
	public double calculateSimpleInterest(double principle,double rate,int time)
	{
		
		return (principle*rate*time)/100;
	}
	public double calculateCompoundInterest(double principle,double rate,int time,int n)
	{
		 double amount = principle * Math.pow(1 + (rate / n), n * time);
	        return( amount - principle);
	        
	}

}
