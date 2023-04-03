import java.util.Scanner;
import java.text.MessageFormat;

public class Solucao5
{
    public static void main(String[] args)
    {
        System.out.print("Digite um numero : ");
        double num = new Scanner(System.in).nextDouble() * 100;

        String res = MessageFormat.format("O numero convertido em cm é {0}",num);

        System.out.println(res);
    }  
}
