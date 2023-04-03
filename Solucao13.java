import java.util.Scanner;
import java.text.MessageFormat;
import java.text.DecimalFormat;

public class Solucao13
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat dt = new DecimalFormat("#.##");
        double calc = 0;
        

        System.out.print("Digite sua altura: ");
        double h = input.nextDouble();

        System.out.print("Digite seu sexo (M/F): ");
        String sexo = input.next();

        calc = sexo.toUpperCase().equals("F") ? (62.1*h) - 44.7 : (72.7*h) - 58;

        String res = MessageFormat.format("Seu peso ideal é {0}Kg",dt.format(calc));

        System.out.println(res);
    }
}