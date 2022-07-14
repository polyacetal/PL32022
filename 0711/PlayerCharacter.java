public class PlayerCharacter extends Character
{
    private String job;
    private int gold;
    private String waza;

    public PlayerCharacter(String name, String job, String waza)
    {
        super(name);
        this.job = job;
        this.gold = 100;
        this.waza = waza;
    }

    public void shokai()
    {
        super.shokai();
        System.out.println("job : " + this.job);
        System.out.println("gold: " + this.gold);
        System.out.println("とくぎ: " + this.waza);
    }
}