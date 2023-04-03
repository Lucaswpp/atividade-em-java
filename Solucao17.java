import java.util.Scanner;
import java.text.MessageFormat;
import java.lang.Math;
public class Solucao17
{

    static int calc_latas_tintas(double area,double tinta)
    {
        double calc = 0;
        int quantidade_tinta = 0;

        calc = (area/6)/tinta;

        quantidade_tinta = (int) calc;
        
        if ((area/6) % 18 != 0)
        {
            quantidade_tinta = (int) quantidade_tinta + 1;
        }

        return quantidade_tinta;
    }

    public static void main(String[] args)
    {
        System.out.print("Tamanho da área: ");
        double area = new Scanner(System.in).nextDouble();

        int tot_tinta_18 = calc_latas_tintas(area,18);
        int tot_tinta_36 = calc_latas_tintas(area,3.6);

        double folga = area * 10/100;

        double calc_tintas_18 = ((((folga+area)/6)/18));

        double calc_tintas_36 = (((folga+area)/6)%18)/3.6;

        double tot_tintas = calc_tintas_18 + calc_tintas_36;

        if (((folga+area/6)%18)/3.6 != 0)
        {
            calc_tintas_36 += 1;
        }

        System.out.println(tot_tinta_18);
        System.out.println(tot_tinta_36);
        System.out.println();
        System.out.println((int) calc_tintas_18);
        System.out.println((int) calc_tintas_36);
    }
}