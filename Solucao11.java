import java.util.Scanner;
import java.text.MessageFormat;

public class Solucao11
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int a = input.nextInt();

        System.out.print("Digite outro numero: ");
        int b = input.nextInt();

        System.out.print("Digite mais um numero: ");
        double c = input.nextDouble();


        String res1 = MessageFormat.format("o produto do dobro do primeiro com metade do segundo é {0}",(2*a)+(b/2));

        String res2 = MessageFormat.format("a soma do triplo do primeiro com o terceiro é {0}",3*a+c);

        String res3 = MessageFormat.format("o terceiro elevado ao cubo é {0}",(c*c*c));

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}