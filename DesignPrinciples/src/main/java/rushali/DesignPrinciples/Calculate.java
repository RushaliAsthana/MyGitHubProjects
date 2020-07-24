package rushali.DesignPrinciples;
class Calculate{
	public void calculator(double n1,double n2,int operand)
	{
	
		switch(operand)
		{
		case 1:{
			Addition a=new Addition();
			System.out.println("Addition of your numbers is:"+a.addition(n1, n2)); 
			break;
		}
		case 2:{
			Subtraction s=new Subtraction();
			System.out.println("Subtraction of your numbers is:"+s.subtract(n1, n2));
			break;
		}
		case 3:{
			Multiplication m=new Multiplication();
			System.out.println("Multiplication of your numbers is:"+m.multiply(n1, n2));
			break;
		}
		case 4:
		{
			Divison d=new Divison();
			System.out.println("Division of your numbers is:"+ d.divide(n1,n2));
			break;
		}
		case 5:{
			Modulo r=new Modulo();
			System.out.println("Division of your numbers is:"+ r.remainder(n1, n2));
			break;
		}
		
		}
	}
}