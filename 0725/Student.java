public class Student
{
    private int gakunen;    //学年 1~5の整数
    private String bunnya;  //分野 "情報", "機械", "電気", "電子", "建築"のいずれかの文字列
    private String namae;   //名前 文字列

    public Student(int gakunen, String bunnya, String namae)
    {
        this.gakunen = gakunen;
        this.bunnya = bunnya;
        this.namae = namae;
    }

    public int getGakunen()
    {
        return this.gakunen;
    }

    public String getBunnya()
    {
        return this.bunnya;
    }

    public String getNamae()
    {
        return this.namae;
    }

    public void shokai()
    {
        System.out.println("私は「" + this.gakunen + "年" + this.bunnya + "」の「" + this.namae + "」です.");
    }
}