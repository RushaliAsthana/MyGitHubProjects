package rushali.Interests;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;

public class SimpleCompoundInterest {
public static void main(String arsgs[]) throws Exception
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The principle amount:");
	double principleAmount=sc.nextDouble();
	System.out.println("Enter The rate of Interest:");
	double rate=sc.nextDouble();
	System.out.println("Enter The duration to be paid:");
	int time=sc.nextInt();
	System.out.println("Choose Method of Interest to be paid:1.Simple Interest 2.Compound Interest");
	int choice=sc.nextInt();
	CalculateInterest c=new CalculateInterest();
	double interest=0;
	switch(choice)
	{
	case 1:
	{
		System.out.println("Your Simple Interest is:");
		 interest=c.calculateSimpleInterest(principleAmount,rate,time);
		System.out.println(interest);
		break;
	}
	case 2:
	{
		System.out.println("Enter the number of times you want to compnd it:");
		int n=sc.nextInt();
		
		System.out.println("Your Compound Interest is:");
		interest=c.calculateCompoundInterest(principleAmount, rate, time, n);
		System.out.println(interest);
		break;
	}
	}
	
}
}
