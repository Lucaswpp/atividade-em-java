import java.util.Scanner;
import java.text.MessageFormat;

public class Solucao9
{
    public static void main(String[] args)
    {
        System.out.print("Digite uma valor em graus Fahrenheit: ");
        double f = new Scanner(System.in).nextDouble();
        double calc = 5 * ((f - 32.0)/9);

        String res = MessageFormat.format("O valor convertido em celsius é {0}°", calc);

        System.out.println(res);
    }  
}