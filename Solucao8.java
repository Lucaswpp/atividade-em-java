import java.util.Scanner;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class Solucao8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("digite o quanto ganha por hora: ");
        double numero = input.nextDouble();

        System.out.print("digite o numero de horas trabalhadas: ");
        double horas = input.nextDouble();

        String calc = new DecimalFormat("#.##").format((numero * horas));

        String res = MessageFormat.format("O valor total: {0}R$", calc);

        System.out.println(res);

    }
}