import java.util.Scanner;

class KozaApp3
{
    public static void main(String[] args)
    {
        Koza my_koza;
        my_koza = new Koza();

        my_koza.gankin = Integer.parseInt(args[0]);
        double kotae;
        for(int i = 1; i <= 36; i++){
            kotae = my_koza.risoku(i);
            System.out.println(i+"ヶ月目の利息は"+ kotae);
        }
        my_koza.gankin = 1;
        input(Integer.parseInt(args[0]), my_koza.risoku(12));
        System.exit(0);
    }

    static void input(int gankin, double riritsu){
        double kekka;
        Scanner scan = new Scanner(System.in);
        System.out.println("目標金額を入力してください: ");
        int goal = scan.nextInt();
        if(goal > gankin){
            kekka = (double)goal * 12.0 / (double)gankin /riritsu;
            System.out.println(goal+"円になるには"+(int)Math.ceil(kekka)+"ヶ月かかります");
        }else if(goal <= gankin){
            System.out.println("元金が目標金額を超えています ");
        }
    }
}