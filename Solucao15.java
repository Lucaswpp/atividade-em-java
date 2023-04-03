import java.util.Scanner;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class Solucao15
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat dt = new DecimalFormat("#.##");

        System.out.print("digite o quanto ganha por hora: ");
        double numero = input.nextDouble();

        System.out.print("digite o numero de horas trabalhadas: ");
        double horas = input.nextDouble();

        double salario_bruto = (numero * horas);

        String res1 = MessageFormat.format("+ Salário Bruto : R${0}",dt.format(salario_bruto));
        String res2 = MessageFormat.format("- IR (11%) : R${0}",dt.format(salario_bruto * 11/100));
        String res3 = MessageFormat.format("- INSS (8%) : R${0}",dt.format(salario_bruto * 8/100));
        String res4 = MessageFormat.format("- Sindicato ( 5%) : R${0}",dt.format(salario_bruto * 5/100));
        String res5 = MessageFormat.format("= Salário Liquido : R${0}",dt.format(salario_bruto - salario_bruto * 24/100));  

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);

    }
}