package Sintaxe_Basica.ExtruturaControle.POO.Calculadora;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args ) {
        Scanner scanner = new Scanner (System.in);

        // Exibir opcoes para usuario e pedir para escolher as operacoes 

        int opcao;

        do {
            System.out.println("Calculadora Java");
            System.out.println("1. adicao");
            System.out.println("2. subtrair");
            System.out.println("3. multiplicar");
            System.out.println("4. dividir");
            System.out.println("0. sair");

            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                // pedir os numeros para o usuario 
                System.out.println("Digite o primeiro numero: ");
                double num1 = scanner.nextDouble();
                System.out.println("Digite o segundo numero: ");
                double num2 = scanner.nextDouble();

                double resultado = 0;

                boolean operacaoValida = true;

                System.out.println(num1 +  " " + num2);

                // Encontrar os resultados  
  
                switch (opcao) {
                    case 1:
                        resultado = adicionar(num1, num2);
                        break;

                    case 2:
                        resultado = subtrair(num1, num2);
                        break;

                     case 3:
                        resultado = multiplicar(num1, num2);
                     break;

                     case 4:
                        if(num2 != 0) {
                            resultado = dividir(num1, num2);
                        } else {
                             System.out.println("Divisao por zero nao permintida:");
                             operacaoValida = false;
                        }
                    break;
                    default:
                        operacaoValida = false;
                        break;
                }

                // Exibir os resultados 
                System.out.println("Resultado:");;

            } else if (opcao != 0) {
                System.out.println("Opcao invalida. Tente novamente.");
            }

        } while (opcao != 0);



    }

    // Operacoes da calculadora 

    public static double adicionar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }


    public static double multiplicar(double a, double b) {
        return a * b;
    }


    public static double dividir(double a, double b) {
        return a / b;
    }
    
}
