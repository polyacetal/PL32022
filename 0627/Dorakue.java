import java.util.Random;
class Dorakue
{
    String name;    //名前
    int goald;      //所持金
    int lv;         //レベル
    int exp;        //経験値
    int hp;         //ヒットポイント
    int mp;         //マジックポイント
    int atk;        //攻撃力
    int def;        //防御力
    int mat;        //魔法攻撃力
    int mdf;        //魔法防御力
    int str;        //ちから
    int vit;        //みのまもり
    int agi;        //すばやさ
    int dex;        //きようさ
    int bet;        //みりょく

    Dorakue()
    {
        this.goald = 0;
        this.lv = 1;
        this.exp = 0;
        this.hp = 10;
        this.mp = 5;
        this.atk = 10;
        this.def = 10;
        this.mat = 10;
        this.mdf = 10;
        this.str = 10;
        this.vit = 10;
        this.agi = 10;
        this.dex = 10;
        this.bet = 10;
    }

    void lvUp()
    {
        Random rand = new Random();
        int hp = rand.nextInt(11) + 20;
        int mp = rand.nextInt(11) + 10;
        int atk = rand.nextInt(3) + 4;
        int def = rand.nextInt(3) + 4;
        int mat;
        int mdf;
        int str;
        int vit;
        int agi;
        int dex;
        int bet;
        this.lv += 1;
        this.hp += hp;
        this.mp += mp;
        this.atk += atk;
        this.def += def;
        this.mat += mat;
        this.mdf += mdf;
        this.str += str;
        this.vit += vit;
        this.agi += agi;
        this.dex += dex;
        this.bet += bet;
        System.out.println(this.name + "はレベルアップした");
        System.out.println("lv:  +1 -> " + this.lv);
        System.out.println("hp:  +" + hp + " -> " + this.hp);
        System.out.println("mp:  +" + mp + " -> " + this.mp);
    }

    void death()
    {
        this.goald = this.goald / 2;
        System.out.println(tish.name + "は死んでしまった。")
        System.out.println("所持金が半分になった。")
    }

}