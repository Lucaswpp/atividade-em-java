import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.MessageFormat;

public class Solucao16 {
    public static void main(String[] args)
    {
        double calc = 0;
        int quantidade_tinta = 0;
        System.out.println("Digite um valor em m²: ");
        double area = new Scanner(System.in).nextDouble();

        calc = (area/3)/18;

        quantidade_tinta = (int) calc;
        
        if ((area/3) % 18 != 0)
        {
            quantidade_tinta = (int) ((area/3)/18 + 1);
        }


        String tot_tinta = MessageFormat.format("Total de tintas compradas: {0}",quantidade_tinta);
        String tot_dinheiro = MessageFormat.format("Valor total é {0}R$",new DecimalFormat("#.##").format(quantidade_tinta * 80.00));

        System.out.println(tot_tinta);
        System.out.println(tot_dinheiro);
    }
}