class ItemApp
{
    public static void main(String[] args)
    {
        Item a = new Item();
        a.setNamae("FX-JP500");System.out.println(a.getNamae());
        a.setKakaku(2500);System.out.println(a.getKakaku());
        a.setRarity("SR");System.out.println(a.getRarity());
    }
}