import java.util.Scanner;
import java.text.DecimalFormatSymbols;
import java.text.MessageFormat;
import java.text.DecimalFormat;

public class Solucao6
{
    public static void main(String[] args)
    {
        final double pi = 3.14;
        DecimalFormat dt = new DecimalFormat("#.##");

        System.out.print("Digite o raio do círculo: ");
        double r = new Scanner(System.in).nextDouble();

        String res = MessageFormat.format("A área do círculo é {0}m²",dt.format(pi * (r*r)));

        System.out.println(res);
    }
}