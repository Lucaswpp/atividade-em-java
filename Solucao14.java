import java.util.Scanner;
import java.text.MessageFormat;

public class Solucao14

{
    public static void main(String[] args)
    {
        int peso = new Scanner(System.in).nextInt();
        int calc_multa = 0;
        String res = "Vocé não excedeu o peso limite";

        if (peso > 50)
        {
            calc_multa = peso - 50;

            res = MessageFormat.format("Sua multa por exceder o limite é {0}R$",calc_multa * 4.00);
        }

        System.out.println(res);
    }
}
