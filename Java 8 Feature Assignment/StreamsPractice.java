import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.*;
public class StreamsPractice {
    public static void main(String[] args) {
        // IntStream.range(1,11).forEach(System.out::println);
        //IntStream.range(1,11).skip(3).forEach(i->System.out.println(x)); //skiped the first 3 nos
       //System.out.println( IntStream.range(1,11).sum());//to find sum bw a range
    //    Stream.of("Rushali","Surabhi","Rajitha").sorted().findFirst().ifPresent(System.out::println);
    // String arr[]={"Rushali","Surabhi","Rajitha","Vikas"};
    // int arr1[]={1,4,6,3,8};
    //Arrays.stream(arr).filter(x->x.startsWith("R")).sorted().forEach(System.out::println);
   // Arrays.stream(arr).filter(x->x.endsWith("i")).sorted().forEach(System.out::println);
    // System.out.println(Arrays.stream(arr1).sum());
    // List<String>names=Arrays.asList(arr);
    // names.stream().map(String::toLowerCase).filter(x->x.startsWith("r")).forEach(System.out::println);
    ArrayList<Integer>al=new ArrayList<>();
    for(int i=1;i<=5;i++)
    al.add(i);
    //to find avd of elements in list
    // al.stream().mapToInt(x->x).average().ifPresent(System.out::println);
    
    //to find sum of elements in list
//     Integer sum = al.stream()
//   .mapToInt(Integer::intValue)
//   .sum();
//   System.out.println(sum);

    }

    
}