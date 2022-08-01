public class ArrayTest
{
    public static void main(String[] args)
    {
        String[] texts = new String[3];
        setHello(texts, 3);
    }

    private static void setHello(String[] texts, int index)
    {
        texts[index] = "こんにちは";
    }
}