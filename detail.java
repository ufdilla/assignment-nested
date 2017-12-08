/**
 * detail
 */

    class Awal
    {
        public double result(int satu, int dua) 
        {
        int  hasil = satu * dua;
        return hasil;
        }

        class Berikut
        {
            void proses(int x, int y) 
            {
            x = 3;
            y = 4;
            double data = result(x,y);
            System.out.println(data);
            }
        }
    }

public class detail 
{
    public static void main(String[] args) 
    {
        int a = 0;
        int b = 0;
        Awal classA = new Awal();
        Awal.Berikut classB = classA.new Berikut();
        classB.proses(a,b);
    }
}
