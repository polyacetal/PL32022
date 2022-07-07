class StudentApp
{
    public static void main(String[] args)
    {
        Student a = new Student();
        a.setGakunen(6); a.shokai();
        a.setGakunen(4); a.shokai();
        a.setBunnya("化学"); a.shokai();
        a.setBunnya("情報"); a.shokai();
        a.setNamae("情太郎"); a.shokai();
        a.setJukyo("学寮"); a.shokai();
        Item b = new Item();
        b.setNamae("FX-JP500");
        b.setKakaku(2500);
        b.setRarity("SR");
        a.setItem(b);
        a.shokai();
    }
}