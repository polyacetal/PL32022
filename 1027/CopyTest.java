import java.io.*;

public class CopyTest
{
    public static void main(String[] args)
    {
        try
        {
            FileReader fr = new FileReader(args[0]);
            BufferedReader br = new BufferedReader(fr);
            String buf;
            String all = "";
            while ((buf = br.readLine()) != null)
            {
                all += buf;
                all += System.getProperty("line.separator");
            }
            br.close();
            fr.close();

            FileWriter fw = new FileWriter(args[1]);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(all);
            bw.close();
            fw.close();  
        }
        catch (IOException e)
        {
            System.out.println("ファイル読み込みエラー");
            System.exit(1);
        }
    }
}