/*
 * Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:



Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

Exemplos de Entrada	Exemplos de Saída
7 14 106

106 eh o maior

217 14 6

217 eh o maior
 */

import java.util.Scanner;

public class URI1013_OMaior {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a > b && a > c){
            System.out.println(a + " eh o maior");
        }
        else if(b > c){
            System.out.println(b + " eh o maior");
        }
        else{
            System.out.println(c + " eh o maior");
        }
    } 
}
