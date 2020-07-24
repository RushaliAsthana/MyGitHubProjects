package rushali.DesignPrinciples;
import java.util.*;
class InputReader{
	
	public void takeInput()
	{
		int choice;
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		double n1=sc.nextInt();
		double n2=sc.nextInt();
		System.out.println("Enter the operation 1. Addition 2. Subtract 3.Multiplication 4.Division 5. Reminder ");
		int operand=sc.nextInt();
		Calculate c=new Calculate();
		c.calculator(n1, n2, operand);
		System.out.println("Input 1. To continue 2. Exit the program");
    	choice=sc.nextInt();
    	if(choice==2)
    	break;
		}
	}
}