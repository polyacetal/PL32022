class StudentApp
{
    public static void main(String[] args)
    {
        Student nobita = new Student(4, "情報", "のび太", "自宅");
        Student doraemon = new Student(4, "機械", "ドラえもん", "下宿");
        Student jaian = new Student(4, "電気", "ジャイアン", "学寮");
        Student suneo = new Student(4, "電子", "スネ夫", "自宅");
        Student sizuka = new Student(4, "建築", "しずか", "自宅");
        nobita.shokai();    //通常版メソッドを呼び出す
        doraemon.shokai();    //通常版メソッドを呼び出す
        Student.shokai(nobita); //static版のメソッドを呼び出す
        Student.shokai(doraemon); //static版のメソッドを呼び出す
        nobita.hantei(doraemon);
        Student.hantei(nobita, doraemon);
        sizuka.shokai();
        sizuka.hantei(nobita);
        Student.hantei(sizuka, nobita);
        jaian.shinkyu();
        Student.shinkyu(suneo);
        Student.shokai(jaian);
        suneo.shokai();
    }
}