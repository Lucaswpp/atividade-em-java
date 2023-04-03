import java.util.Scanner;
import java.text.MessageFormat;
import java.text.DecimalFormat;

public class Solucao12
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat dt = new DecimalFormat("#.##");

        System.out.print("Digite sua altura: ");
        double h = input.nextDouble();

        double calc = (72.7*h) - 58;

        String res = MessageFormat.format("Seu peso ideal é {0}Kg",dt.format(calc));

        System.out.println(res);
    }
}