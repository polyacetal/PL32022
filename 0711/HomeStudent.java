public class HomeStudent extends Student
{
    private String tuugaku; //通学手段:"バス","鉄道","自転車"など

    public HomeStudent(int gakunen, String bunnya, String namae, String tuugaku)
    {
        super(gakunen, bunnya, namae);
        this.tuugaku = tuugaku;
    }

    public String getTuugaku()
    {
        return this.tuugaku;
    } 

    public void shokai()
    {
        System.out.println("私は「" + this.getGakunen() + "年" + this.getBunnya() + "」の「" + this.getNamae() + "」です.");
        System.out.println("通学手段は「"+ this.tuugaku +"」です.");
    }
}