class DorakueApp
{
    public static void main(String[] args)
    {
        Dorakue yuusya = new Dorakue("アレル");
        Dorakue sensi = new Dorakue("ステラ");
        Dorakue kenja = new Dorakue("ライド");
        Dorakue mahoutukai = new Dorakue("マリス");

        yuusya.status();
        yuusya.lvUp();
        yuusya.status();
        sensi.status();
        yuusya.win();
        yuusya.death();
    }
}