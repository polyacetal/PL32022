import java.util.Random;
public class Monster extends Character
{
    private String type;
    private int gold;

    public Monster(String name, String type)
    {
        super(name);
        Random rand = new Random();
        this.type = type;
        this.gold = rand.nextInt(50) + 100;
    }

    public void shokai()
    {
        super.shokai();
        System.out.println("種族 : " + this.type);
        System.out.println("落とすゴールド: " + this.gold);
    }
}