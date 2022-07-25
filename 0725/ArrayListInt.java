public class ArrayListInt
{
    private int maxSize;
    private int[] list;
    private int size;

    public ArrayListInt()
    {
        this.maxSize = 5;
        this.list = new int[this.maxSize];
        this.size = 0;
    }

    public void add(int element)
    {
        if (this.size < this.maxSize)
        {
            this.list[this.size] = element;
            this.size += 1;
        } else {
            System.out.println("ERROR : 最大5個の要素しか格納できません.");
        }
    }

    public int getSize()
    {
        return this.size;
    }

    public int getList(int n)
    {
        return this.list[n];
    }

    public void print()
    {
        for (int i = 0; i < this.size; i++)
        {
            System.out.println(this.list[i]);
        }
    }
}