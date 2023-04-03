import java.util.Scanner;
import java.text.MessageFormat;

public class Solucao10
{
    public static void main(String[] args)
    {
        System.out.print("Digite uma valor em graus celsius: ");
        double c = new Scanner(System.in).nextDouble();
        double calc = 1.8 * c + 32;

        String res = MessageFormat.format("O valor convertido em Fahrenheit é {0}°", calc);

        System.out.println(res);
    }  
}