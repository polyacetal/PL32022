class Item
{
    private String namae;
    private int kakaku;
    private String rarity;

    void setNamae(String namae)
    {
        this.namae = namae;
    }

    String getNamae()
    {
        return this.namae;
    }

    void setKakaku(int kakaku)
    {
        this.kakaku = kakaku;
    }

    int getKakaku()
    {
        return this.kakaku;
    }

    void setRarity(String rarity)
    {
        if(rarity.equals("R")) this.rarity = rarity;
        if(rarity.equals("SR")) this.rarity = rarity;
        if(rarity.equals("SSR")) this.rarity = rarity;
        if(rarity.equals("UR")) this.rarity = rarity;
    }

    String getRarity()
    {
        return this.rarity;
    }
}