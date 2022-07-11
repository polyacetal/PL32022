public class DormStudentApp
{
    public static void main(String[] args)
    {
        DormStudent a = new DormStudent(4, "情報", "情太郎");
        DormStudent b = new DormStudent(4, "機械", "機械太郎");

        a.setDousitu(b);
        a.shokai();
    }
}