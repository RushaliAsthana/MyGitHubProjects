import java.util.*;
import java.util.stream.Collectors;
interface Filter{
    void filterWords(List<String>al);
}
public class Assignement2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String a[]=sc.nextLine().split(" ");
        List<String>al=Arrays.asList(a);
        List<String>p=al.stream().map(String::toLowerCase).filter(x->x.startsWith("a")).collect(Collectors.toList());
       Filter obj=(List<String>s)->
        {
            System.out.println("Three Letter words starting with 'a' are:");
            System.out.println("*******************************************");
            s.stream().map(x->x).filter(x->x.length()==3).forEach(System.out::println);
        };
        obj.filterWords(p);
    }
}