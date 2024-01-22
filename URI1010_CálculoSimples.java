/**
 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
 */

import java.util.Scanner;

public class URI1010_CálculoSimples {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int codigo1, quantidade1, codigo2, quantidade2;
        double valor1, valor2,total;

        codigo1 = sc.nextInt();
        quantidade1 = sc.nextInt();
        valor1 = sc.nextDouble();

        codigo2 = sc.nextInt();
        quantidade2 = sc.nextInt();
        valor2 = sc.nextDouble();

        total = (quantidade1*valor1) + (quantidade2*valor2);

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
    }
}
