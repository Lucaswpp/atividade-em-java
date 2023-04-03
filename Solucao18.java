import java.util.Scanner;
import java.text.MessageFormat;

public class Solucao18
{
    public static void main(String[] args)
    {
        System.out.println("Digite o tamanho de um arquivo: ");
        Scanner input = new Scanner(System.in);

        double arq_size = input.nextDouble();

        double link_internet = input.nextDouble();

        double calc = arq_size * 8/link_internet;

        double minutos = calc/60;

       String res = MessageFormat.format("Vai demorar {0} min ",(int) minutos);

    }  
}
