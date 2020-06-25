interface A{
    default void show()
    {
             System.out.println("A");
    }
}
interface B{
    default void show()
    {
             System.out.println("B");
    }
}
public class InterfacePrac implements A,B  {
    public static void main(String[] args) {
        InterfacePrac b=new InterfacePrac();
        b.show();
    }
}