import java.util.Scanner;
import java.text.MessageFormat;
public class Solucao3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        
        String res = MessageFormat.format("A soma dos dois numeros informado é {0}", num1+num2);

        System.out.println(res);
    }
}
