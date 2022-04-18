class Koza
{
    double riritsu;
    int gankin;

    Koza()
    {
        riritsu = 0.002;
    }

    double risoku(int month)
    {
        double kekka;
        kekka = (double)gankin * riritsu * (double)month / 12.0;
        return kekka;
    }
}