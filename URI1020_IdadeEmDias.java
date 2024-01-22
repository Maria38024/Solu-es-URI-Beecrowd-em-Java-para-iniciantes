/*
 * Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.
 */

import java.util.Scanner;

public class URI1020_IdadeEmDias {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int diasInseridos = sc.nextInt();

        int anos = diasInseridos/365;
        diasInseridos -= anos*365;

        int meses =diasInseridos/30;
        diasInseridos -= meses* 30;

        int dias = diasInseridos;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}
