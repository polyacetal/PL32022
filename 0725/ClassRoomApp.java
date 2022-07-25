public class ClassRoomApp
{
    public static void main(String[] args)
    {
        HomeStudent jotaro = new HomeStudent(4, "情報", "情太郎", "自転車");
        DormStudent dora = new DormStudent(4, "情報", "ドラえもん");
        DormStudent nobi = new DormStudent(4, "情報", "のび太");
        ClassRoom j4 = new ClassRoom();
        j4.add(jotaro); j4.add(dora); j4.add(nobi); dora.setDousitu(nobi);
        j4.shokai();
    }
}