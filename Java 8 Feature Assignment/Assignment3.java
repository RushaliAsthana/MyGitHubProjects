import java.util.*;

import java.util.stream.Collectors;
interface PalindromicFilter{
    static List<String> filterOut(List<String>list)
    {
             return list.stream().map(x->x).filter(s->isPalindrome(s)).collect(Collectors.toList());

    }
    static boolean isPalindrome(String s)
    {
        StringBuffer sb=new StringBuffer(s);
        if(sb.reverse().toString().equals(s))
        return true;

        return false;
    }
}
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string with palindromes and non-palindromes:");
        String s=sc.nextLine();
        String sarr[]=s.trim().split(" ");
        List<String>list=Arrays.asList(sarr);
        List<String>result=PalindromicFilter.filterOut(list);
        System.out.println("Palindromes in your String are:");
        System.out.println("************************************");
        result.forEach((System.out::println));
    }
}