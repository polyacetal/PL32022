public class Character
{
    private String name;
    private int hp;
    private int mp;
    private int atk;
    private int def;

    public Character(String name)
    {
        this.name = name;
        this.hp = 50;
        this.mp = 20;
        this.atk = 10;
        this.def = 10;
    }

    public void shokai()
    {
        System.out.println("私は" + this.name + "です。");
        System.out.println("hp  : " + this.hp);
        System.out.println("mp  : " + this.mp);
        System.out.println("atk : " + this.atk);
        System.out.println("def : " + this.def);
    }
}