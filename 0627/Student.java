class Student
{
    int gakunen;    //学年 1~5の整数
    String bunnya;  //分野 "情報", "機械", "電気", "電子", "建築"のいずれかの文字列
    String namae;   //名前 文字列
    String jukyo;   //住居 "自宅", "学寮", "下宿"

    Student(int gakunen, String bunnya,  String namae, String jukyo){
        this.gakunen = gakunen;
        this.bunnya = bunnya;
        this.namae = namae;
        this.jukyo = jukyo;
    }

    void shokai()   //通常版
    {
        // gakunen, bunnya, namaeはthis(主たるインスタンス)のフィールドを使う
        System.out.print("私は「" + this.gakunen + "年" + this.bunnya + "」の「" + this.namae + "」です.");
        System.out.println("私の住居は「" + this.jukyo + "」です.");
    }

    static void shokai(Student a)   //static版
    {
        // gakunen, bunnya, namaeは引数aのフィールドを使う.
        System.out.print("彼は「" + a.gakunen + "年" + a.bunnya + "」の「" + a.namae + "」さんです.");
        System.out.println("彼の住居は「" + a.jukyo + "」です.");
    }

    void hantei(Student a)
    {
        if (this.jukyo.equals(a.jukyo))
        {
            System.out.println("私「" + this.namae + "」と「" + a.namae + "」さんは仲間です.");
        } else {
            System.out.println("私「" + this.namae + "」と「" + a.namae + "」さんは仲間ではありません.");
        }
    }

    static void hantei(Student a, Student b)
    {
        if (a.jukyo.equals(b.jukyo))
        {
            System.out.println("「" + a.namae + "」さんと「" + b.namae + "」さんは仲間です.");
        } else {
            System.out.println("「" + b.namae + "」さんと「" + b.namae + "」さんは仲間ではありません.");
        }
    }

    void shinkyu()
    {
        this.gakunen += 1;
        System.out.println("私「" + this.namae + "」は" + this.gakunen + "年に進級しました!");
    }

    static void shinkyu(Student a)
    {
        a.gakunen += 1;
        System.out.println("彼「" + a.namae + "」は" + a.gakunen + "年に進級しました！");
    }

    void ryunen()
    {
        System.out.println("私「" + this.namae + "」は留年しました.");
    }

    void ryunen(Student a)
    {
        System.out.println("私「" + a.namae + "」は留年しました.");
    }
}