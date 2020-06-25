import java.util.*;

interface Average{
    void average(ArrayList<Integer> al);
}
public class AvgOfList 
{
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no of elements you want to enter into a list ");
     int n=sc.nextInt();
     System.out.println("Enter "+n+" elements:");
     ArrayList<Integer>al=new ArrayList<>();
     for(int i=0;i<n;i++)
     al.add(sc.nextInt());
     
    Average avg=(ArrayList<Integer>al1)->{
        System.out.println("*******************************************");
        System.out.print("Average:");
        al1.stream().mapToInt(x->x).average().ifPresent(System.out::print);
  
    };
    avg.average(al);
    
 }
}