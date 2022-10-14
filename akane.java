//Autor: João Vitor Campos Ribeiro
package akane;
import java.util.Scanner;
public class akane {
    public static void main(String[] args) {
        int questao;
        Scanner ler = new Scanner(System.in);
        System.out.println("Selecione a questão: ");
        questao = ler.nextInt();
        if(questao==1) {
            questao1();//chama o procedimento para a questão 1
        }
        else if (questao==2) {
            questao2();
        }
    }
    public static void questao1 () {
    Scanner ler = new Scanner(System.in);
    int questao;
    System.out.println("Selecione a questão: ");
    questao = ler.nextInt();
    if(questao==1) {
        int resp, num;
        System.out.println("Digite um numero: ");
        num = ler.nextInt();
        resp = solucao1(num);//chama o procedimento para a questão 1
        System.out.printf("O dobro é: %d", resp);
    }
    else if (questao==2) {
        int resp, num, num2;
        System.out.println("Digite um numero: ");
        num = ler.nextInt();
        System.out.println("Digite um numero: ");
        num2 = ler.nextInt();
        resp = solucao2(num, num2);
        System.out.printf("O maior é: %d", resp);
    }
    else if (questao==3) {
        double resp, num, num2, num3;
        System.out.println("Digite um numero: ");
        num = ler.nextDouble();
        System.out.println("Digite um numero: ");
        num2 = ler.nextDouble();
        System.out.println("Digite um numero: ");
        num3 = ler.nextDouble();
        resp = solucao3(num, num2, num3);
        System.out.printf("A media é: %f", resp);
    }
    else if (questao==4) {
        int resp, num;
        System.out.println("Digite um numero: ");
        num = ler.nextInt();
        resp = solucao4(num);
        System.out.printf("O fatorial é: %d", resp);
    }
    else if (questao==5) {
        int resp, num;
        System.out.println("Digite um numero: ");
        num = ler.nextInt();
        resp = solucao5(num);
        System.out.printf("A soma de todos os inteiros até %d é: %d", num, resp);
    }
    }

    public static void questao2() {
        Scanner ler = new Scanner(System.in);
        int a, b;
        System.out.println("Digite o primeiro número: ");
        a = ler.nextInt();
        System.out.println("Digite o segundo número: ");
        b = ler.nextInt();
        int resp;
        resp = soma(a, b);
        System.out.printf("Soma: %d\n", resp);
        resp = subtracao(a, b);
        System.out.printf("Subtração: %d\n", resp);
        resp = multiplicacao(a, b);
        System.out.printf("Multiplicação: %d\n", resp);
        
    }

    public static int solucao1(int a) {
        a= a*2;
        return a;
    }
    public static int solucao2(int a, int b) {
        if (a>b) {
            return a;
        }
        else {
            return b;
        }
    }
    public static double solucao3(double a, double b, double c) {
        return (a+b+c)/3;
    }
    public static int solucao4(int x) {
        int fat=1;
        for(int cont=1; cont<=x; cont++) {
            fat = fat*cont;
        }
        return fat;
    }
    public static int solucao5(int a) {
        int num=0;
        for (int cont=0; cont<=a; cont++) {
            num=num+cont;
        }
        return num;
    }
    public static int soma(int a, int b) {
        return a+b;
    }
    public static int subtracao(int a, int b) {
        return a-b;
    }
    public static int multiplicacao(int a, int b) {
        int temp=0;
        for(int cont=0; cont<b; cont++) {
            temp=temp+a;
        }
        return temp;
    }

    
}
   