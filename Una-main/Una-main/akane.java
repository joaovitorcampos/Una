//Autor: João Vitor Campos Ribeiro
package akane;
import java.util.Scanner;
public class akane {
    public static void main(String[] args) {
        int questao;
        Scanner ler = new Scanner(System.in);
        System.out.println("Selecione a questão: ");
        questao = ler.nextInt();
        if(questao==9) {
            questao9();//chama o procedimento para a questão 1
        }
        else if (questao==10) {
            questao10();
        }
        else if (questao==11) {
            questao11();
        }
        else if (questao==12) {
            questao12();
        }
        else if (questao==13) {
            questao13();
        }
        else if (questao==14) {
            questao14();
        }
        else if (questao==15) {
            questao15();
        }
        else if (questao==16) {
            questao16();
        }
        else if (questao==17) {
            questao17();
        }
        else if (questao==18) {
            questao18();
        }
        else if (questao==19) {
            questao19();
        }
    }
    public static void questao9 () {
    Scanner ler = new Scanner(System.in);
    int a, maior=0, menor;
    System.out.println("Digite o 1º numero");
    menor = ler.nextInt();
    maior = menor;
    for (int i=2; i<=10; i++) {
        System.out.printf("Digite o %dº numero\n", i);
        a = ler.nextInt();
        if (a>maior) {
            maior=a;
        }
        else if (a<menor) {
            a=menor;
        }
    }
    System.out.printf("O maior é: %d, e o menor é: %d", maior, menor);
}
    public static void questao10() {
        Scanner ler = new Scanner(System.in);
        int x;
        System.out.println("Digite o numero: ");
        x = ler.nextInt();
        int fat=1;
        for(int cont=1; cont<=x; cont++) {
            fat = fat*cont;
        }
        System.out.printf("A fatorial é: %d", fat);
        
    }
    public static void questao11() {
        Scanner ler = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite o primeiro numero: ");
        num1 = ler.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = ler.nextInt();
        int cont=1, temp=num1;
        while (num2>cont) {
            temp=temp*num1;
            cont++;
        }
        System.out.printf("Potencia: %d", temp);
    }
    public static void questao12() {
        Scanner ler = new Scanner(System.in);
        int x;
        System.out.println("Digite o numero: ");
        x =  ler.nextInt();
        for (int cont=1; cont<=x; cont=cont+2) {
            System.out.println(cont);
        }
    }
    public static void questao13() {
        Scanner ler = new Scanner(System.in);
        int idade, mulheres=0;
        String sexo;
        for (int cont=0; cont<10; cont++) {
            System.out.println("Digite seu sexo (M ou F): ");
            sexo = ler.next();
            System.out.println("Digite sua idade: ");
            idade = ler.nextInt();
            if (sexo.equals("F") && idade>=20 && idade<=40) {
                mulheres++;
            }
        }
        System.out.printf("A quantidade é: %d", mulheres);
    }
    public static void questao14() {
        Scanner ler = new Scanner(System.in);
        int mulheres=0, homens=0;
        double peso;
        String sexo;
        for (int cont=0; cont<10; cont++) {
            System.out.println("Digite seu sexo (M ou F): ");
            sexo = ler.next();
            System.out.println("Digite seu peso: ");
            peso = ler.nextDouble();
            if(sexo.equals("F") && peso>=50 && peso<=70) {
                mulheres++;
            }
            else if (sexo.equals("M") && peso>=60 && peso<=80) {
                homens++;
            }
        }
        System.out.printf("Mulheres: %d\n Homens: %d", mulheres, homens);
    }
    public static void questao15() {
        Scanner ler = new Scanner(System.in);
        double x[][] = new double[3][2];
        for (int cont1=0; cont1<3; cont1++) {
            for (int cont=0; cont<2; cont++) {
                System.out.printf("Digite a %dª nota do %dº aluno: \n", cont+1, cont1+1);
                x[cont1][cont] = ler.nextDouble();
            }
        }
        for(int cont=0; cont<3; cont++) {
            System.out.printf("Media do %dº aluno: %f", cont+1, (x[cont][0]+x[cont][1])/2);
        }   
    }
    public static void questao16() {
        Scanner ler = new Scanner(System.in);
        double maior[] = new double[5];
        double menor[] = new double[5];
        double x[][] = new double[5][3];
        for (int cont1=0; cont1<5; cont1++) {
            for (int cont=0; cont<3; cont++) {
                System.out.printf("Digite a %dª nota do %dº aluno: \n", cont+1, cont1+1);
                x[cont1][cont] = ler.nextDouble();
            }
            maior[cont1]=x[cont1][0];
            menor[cont1]=x[cont1][0];
            for (int cont=1; cont<3; cont++) {
                if (x[cont1][cont]>maior[cont1]) {
                    maior[cont1]=x[cont1][cont];
                    

                }
                else if (x[cont1][cont]<menor[cont1]) {
                    menor[cont1]=x[cont1][cont];
                }
            }
        }
        for (int cont=0; cont<5; cont++) {
            System.out.printf("\nAluno: %d\n Maior nota: %f\n Menor nota: %f", cont+1, maior[cont], menor[cont]);
        }

    }
    public static void questao17() {
        Scanner ler = new Scanner(System.in);
        int idade, noventa=0;
        double peso, media=0;
        for (int cont=0; cont<7; cont++) {
            System.out.println("Digite a sua idade: ");
            idade = ler.nextInt();
            System.out.println("Digite seu peso: ");
            peso = ler.nextDouble();
            if(peso>90) {
                noventa++;
            }
            media= media+idade;
        }
        System.out.printf("A idade média é: %f\n A quantidade de pessoas com mais de 90kg é: %d", media/7, noventa);

    }
    public static void questao18() {
        double temp[] = new double[48];
        double media=0, maior, menor;
        int acima=0, abaixo=0;
        for (int cont=0; cont<48; cont++) {
            temp[cont] = 19.06 + 0.211*Math.cos(0.08721*cont) + (-5.51*Math.sin(0.08721*cont));
            System.out.printf("Temperatura na %dª hora: %f\n", cont+1, temp[cont]);
        }
        maior=temp[0];
        menor=temp[0];
        for (int cont=0; cont<48; cont++) {
            media=media+temp[cont];
            if (temp[cont]>maior) {
                maior=temp[cont];
            }
            else if (temp[cont]<menor) {
                menor=temp[cont];
            }
            if (temp[cont]>19) {
                acima++;
            }
            else if (temp[cont]<16){
                abaixo++;
            }
        }
        System.out.printf("Media de temperatura: %f\nMaior temperatura: %f\nMenor temperatura: %f\nHoras com a temperatura acima de 19º: %d\nHoras com a temperatura abaixo de 16º: %d",media/48, maior, menor, acima, abaixo);

    }
    public static void questao19() {
        Scanner ler = new Scanner(System.in);
        int vel0;
        System.out.println("Digite a velocidade inicial do arremsso: ");
        vel0 = ler.nextInt();
        double cont=0;
        while(cont<=2) {
            System.out.printf("Velocidade no tempo %f: %f\n", cont, vel0 - 9.8*cont);
            System.out.printf("Altura no tempo %f: %f\n", cont, vel0*cont-(9.8*cont*cont)/2);
            cont=cont+0.10;
        }
    }

}


    