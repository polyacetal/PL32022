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

    Dorakue(String name)
    {
        this.name = name;
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
        int mat = rand.nextInt(3) + 4;
        int mdf = rand.nextInt(3) + 4;
        int str = rand.nextInt(3) + 4;
        int vit = rand.nextInt(3) + 4;
        int agi = rand.nextInt(3) + 4;
        int dex = rand.nextInt(3) + 4;
        int bet = rand.nextInt(3) + 1;
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
        System.out.println("atk: +" + atk + " -> " + this.atk);
        System.out.println("def: +" + def + " -> " + this.def);
        System.out.println("mat: +" + mat + " -> " + this.mat);
        System.out.println("mdf: +" + mdf + " -> " + this.mdf);
        System.out.println("str: +" + str + " -> " + this.str);
        System.out.println("vit: +" + vit + " -> " + this.vit);
        System.out.println("agi: +" + agi + " -> " + this.agi);
        System.out.println("dex: +" + dex + " -> " + this.dex);
        System.out.println("bet: +" + bet + " -> " + this.bet);
    }
    
    void status()
    {
        System.out.println("name: " + this.name);
        System.out.println("lv  : " + this.lv);
        System.out.println("hp  : " + this.hp);
        System.out.println("mp  : " + this.mp);
        System.out.println("atk : " + this.atk);
        System.out.println("def : " + this.def);
        System.out.println("mat : " + this.mat);
        System.out.println("mdf : " + this.mdf);
        System.out.println("str : " + this.str);
        System.out.println("vit : " + this.vit);
        System.out.println("agi : " + this.agi);
        System.out.println("dex : " + this.dex);
        System.out.println("bet : " + this.bet);
    }

    void death()
    {
        this.goald = this.goald / 2;
        System.out.println(this.name + "は死んでしまった。");
        System.out.println("所持金が半分になった。");
        System.out.println(this.goald + "G");
    }

    void win()
    {
        Random rand = new Random();
        this.goald += rand.nextInt(4) + 10;
        System.out.println("戦闘に勝利した。" + this.name + "は" + this.goald + "G手に入れた。");
    }
}