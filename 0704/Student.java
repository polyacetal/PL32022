class Student
{
    private int gakunen;    //学年 1~5の整数
    private String bunnya;  //分野 "情報", "機械", "電気", "電子", "建築"のいずれかの文字列
    private String namae;   //名前 文字列
    private String jukyo;   //住居 "自宅", "学寮", "下宿"
    private Item item;

    Student()
    {
        this.gakunen = 0;
        this.bunnya = "未定";
        this.namae = "未定";
        this.jukyo = "未定";
    }

    void setGakunen(int gakunen)
    {
        if(gakunen < 6 && gakunen > 0)
        {
            this.gakunen = gakunen;
        }
    }

    int getGakunen()
    {
        return this.gakunen;
    }

    void setBunnya(String bunnya)
    {
        if(bunnya.equals("情報")) this.bunnya = bunnya;
        if(bunnya.equals("機械")) this.bunnya = bunnya;
        if(bunnya.equals("電気")) this.bunnya = bunnya;
        if(bunnya.equals("電子")) this.bunnya = bunnya;
        if(bunnya.equals("建築")) this.bunnya = bunnya;
    }

    String getBunnya()
    {
        return this.bunnya;
    }

    void setNamae(String namae)
    {
        this.namae = namae;
    }

    String getNamae()
    {
        return this.namae;
    }

    void setJukyo(String jukyo)
    {
        this.jukyo = jukyo;
    }

    String getJukyo()
    {
        return this.jukyo;
    }

    void shokai()   //通常版
    {
        // gakunen, bunnya, namaeはthis(主たるインスタンス)のフィールドを使う
        System.out.print("私は「" + this.gakunen + "年" + this.bunnya + "」の「" + this.namae + "」です.");
        System.out.println("私の住居は「" + this.jukyo + "」です.");
        if(this.item != null) System.out.println("私は" + this.item.getNamae() + "を持っています.");
    }

    void setItem(Item a)
    {
        this.item = new Item();
        this.item.setNamae(a.getNamae());
        this.item.setKakaku(a.getKakaku());
        this.item.setRarity(a.getRarity());
    }

    Item getItem()
    {
        return this.item;
    }
}