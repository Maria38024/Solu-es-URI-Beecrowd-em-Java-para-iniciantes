/*
 * Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

 */

import java.util.Scanner;

public class URI1019_ConversãoDeTempo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int segundosInseridos = sc.nextInt();

        int horas = segundosInseridos/3600;
        segundosInseridos -= horas * 3600;

        int minutos = segundosInseridos/60;
        segundosInseridos -= minutos*60;

        int segundos = segundosInseridos;

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
