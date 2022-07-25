public class ArrayListIntApp
{
    public static void main(String[] args)
    {
        ArrayListInt a = new ArrayListInt();
        a.add(314); a.add(217); a.add(173);
        System.out.println(a.getList(2));
        a.print();
        a.add(141); a.add(223);
        a.print();
        a.add(256);
        a.print();
    }
}