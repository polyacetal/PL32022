public class ClassRoom
{
    private int maxSize;
    private Student[] list;
    private int size;

    public ClassRoom()
    {
        this.maxSize = 5;
        this.list = new Student[this.maxSize];
        this.size = 0;
    }

    public void add(Student element)
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

    public Student getList(int n)
    {
        return this.list[n];
    }

    public void shokai()
    {
        for (int i = 0; i < this.size; i++)
        {
            this.list[i].shokai();
        }
    }
}