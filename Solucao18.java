import java.util.Scanner;
import java.text.MessageFormat;

public class Solucao18
{
    public static void main(String[] args)
    {
        System.out.print("Digite o tamanho de um arquivo: ");
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a velocidade do link: ");
        double arq_size = input.nextDouble();

        double link_internet = input.nextDouble();

        double calc = arq_size * 8/link_internet;

        double minutos = calc/60;

       String res = MessageFormat.format("Vai demorar {0} min ",(int) minutos);

       System.out.println(res);

    }  
}
