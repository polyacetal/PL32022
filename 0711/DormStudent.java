public class DormStudent extends Student
{
    private DormStudent dousitu;

    public DormStudent(int gakunen, String bunnya, String namae)
    {
        super(gakunen, bunnya, namae);
        this.dousitu = null;
    }

    public DormStudent getDousitu()
    {
        return this.dousitu;
    }

    public void setDousitu(DormStudent dousitu)
    {
        this.dousitu = dousitu;
    }
    
    public void shokai()
    {
        System.out.println("私は「" + this.getGakunen() + "年" + this.getBunnya() + "」の「" + this.getNamae() + "」です.");
        if(this.dousitu != null)
        {
            System.out.println("寮の同室者は「" + this.dousitu.getNamae() + "」です.");
        } else {
            System.out.println("同室者はいません.");
        }
    }
}