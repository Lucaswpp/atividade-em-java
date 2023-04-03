import java.util.Scanner;
import java.text.MessageFormat;
import java.text.DecimalFormat;

public class Solucao4
{
    public static void main(String[] args)
    {
        double nota = 0;
        DecimalFormat dt = new DecimalFormat("#.#");

        for (int i=1;i < 5;i++)
        {
            String text = MessageFormat.format("{0}° nota do aluno: ", i);
            System.out.print(text);
            nota += new Scanner(System.in).nextDouble();
        }

        String res = MessageFormat.format("media geral do aluno: {0}",dt.format(nota/4));

        System.out.println(res);
    }
}