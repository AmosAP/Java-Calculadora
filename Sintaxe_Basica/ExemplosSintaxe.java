package Sintaxe_Basica;

public class ExemplosSintaxe {

    public static void main(String[] args) {
        
        // 1- imprensao de texto 
        System.out.println("podemos imprimir isto aqui e juntamente o numero" + 100);


        // 2- Tipos primitivos  
        // Variaveis  = armazenar dados

        int  idade = 30;
        int anoAtual = 2025;

        System.out.println("sua idade " + idade + "anos." );
        System.out.println("o ano " + anoAtual);

        // numeros com virgula 

        double altura = 1.80;
        double pi = 3.14;

        System.out.println("altura " + altura + " pi " + pi);

        // Operadores Basicos 
        // Aritmrticos 

        int a = 10;
        int b = 3;

        // () resolver sempr eo que esta entre parenteses 
        // Subtracao  -> exibicao

        System.out.println("A - B = " + (a - b));
        System.out.println("A + B " + (a + b));
        System.out.println("A * B " + (a * b));
        System.out.println("A / B " + (a / b));

        // sobre incrementos em Java  Operadores de incremento e decremento

        int contador = 0;

        contador++;
        System.out.println("VALOR DO contador:" + contador);

        contador--;
        contador--;
        contador--;

        System.out.println("VALOR DO CONTADOR:" + contador);

        //Sobre Operadores Compostos 
        //
    }
    
}
