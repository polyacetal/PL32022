public class Rpg
{
    public static void main(String[] args)
    {
        PlayerCharacter yuusya = new PlayerCharacter("アレル", "勇者", "火炎斬り");
        Monster sura = new Monster("すらりん","スライム");

        yuusya.shokai();
        sura.shokai();
    }
}