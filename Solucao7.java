import java.util.Scanner;
import java.text.MessageFormat;
public class Solucao7

{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a base do quadrado: ");
        double b = input.nextDouble();
        System.out.print("Digite a altura do quadrado: ");
        double h = input.nextDouble();

        String res = MessageFormat.format("A área do quadrado é {0}m² e o dobro da área é {1}m²",b*h,(b*h)*2);

        System.out.println(res);
    }
}
