/**
 * Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.
 */

import java.util.Scanner;

public class URI1012_Área{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double pi = 3.14159;

        double areaDoTriangulo = (a * c)/2;
        double areaDoCirculo = pi * (c * c);
        double areaDoTrapezio = ((a + b)*c)/2;
        double areaDoQuadrado = b * b;
        double areaDoRetangulo = a * b;

        System.out.println(String.format("TRIANGULO: %.3f", areaDoTriangulo));
        System.out.println(String.format("CIRCULO: %.3f", areaDoCirculo));
        System.out.println(String.format("TRAPEZIO: %.3f", areaDoTrapezio));
        System.out.println(String.format("QUADRADO: %.3f", areaDoQuadrado));
        System.out.println(String.format("RETANGULO: %.3f", areaDoRetangulo));
    }
}