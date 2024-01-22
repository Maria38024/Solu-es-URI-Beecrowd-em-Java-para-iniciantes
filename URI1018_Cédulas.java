/*
 * Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
 */

import java.util.Scanner;

public class URI1018_Cédulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorColocado = sc.nextInt();
        int valorAtual = valorColocado;

        int notasDe100 = valorAtual/100;
        valorAtual -= notasDe100* 100;

        int notasDe50 = valorAtual/50;
        valorAtual-= notasDe50 * 50;

        int notasDe20 = valorAtual/20;
        valorAtual -= notasDe20 * 20;

        int notasDe10 = valorAtual/10;
        valorAtual -= notasDe10 * 10;

        int notasDe5 = valorAtual/5;
        valorAtual -= notasDe5 * 5;

        int notasDe2 = valorAtual/2;
        valorAtual -= notasDe2 * 2;

        int notasDe1 = valorAtual;

        System.out.println(valorColocado);
        System.out.println(notasDe100 + " nota(s) de R$ 100,00");
        System.out.println(notasDe50 + " nota(s) de R$ 50,00");
        System.out.println(notasDe20 + " nota(s) de R$ 20,00");
        System.out.println(notasDe10 + " nota(s) de R$ 10,00");
        System.out.println(notasDe5 + " nota(s) de R$ 5,00");
        System.out.println(notasDe2 + " nota(s) de R$ 2,00");
        System.out.println(notasDe1 + " nota(s) de R$ 1,00");
    }
}