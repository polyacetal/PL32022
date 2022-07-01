class DorakueApp
{
    public static void main(String[] args)
    {
        Dorakue areru = new Dorakue("アレル", "勇者");
        Dorakue sutera = new Dorakue("ステラ", "戦士");
        Dorakue raido = new Dorakue("ライド", "僧侶");
        Dorakue marisu = new Dorakue("マリス", "魔法使い");

        areru.status();
        areru.lvUp();
        areru.status();
        areru.win();
        sutera.win();
        raido.win();
        marisu.win();
        areru.death();
        raido.jobChange("賢者");
        areru.status();
        sutera.status();
        raido.status();
        marisu.status();
    }
}