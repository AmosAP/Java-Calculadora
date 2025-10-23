package Sintaxe_Basica.ExtruturaControle;

public class ExemploControle {
    
    public static void main(String[] args)
    {
        // condicoes if - else
        // OPeradores de comparacao
        // a > b, a ==  b

        int idade = 15;

        if(idade >= 20)
        {
            System.out.println("Voce e maior de idade");
        }

        // if ->  serve para validar verdadeiro ou falso 
        // else -> serve  para executar se o if nao executa

        double nota = 6.3;

        if(nota > 7)
        {
            System.out.println("Voce transitou de classe");
        }else {
            System.out.println("Voce nao transitou");
        }

        // if else  -> intermediario do if else 
        // ele valida um bloco tambem 

        int hora = 19;
        
        if(hora < 12)
        {
            System.out.println("Bom dia");
        } else  if(hora < 18){

            System.out.println("Boa tarde");
            
        } else {
            System.out.println("Boa noite");
        }

        // 2 - Operadores de comparacao

        int x = 10;
        int y = 5;

        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));


        // OPeradores logicos 

        // && => AND => op1 && op2 => boolen =>  // Apenas se as OP forem verdadeiras
        // || => OR => op1 || op2 => boolen => // Apenas se uma OP for verdadeira
        // ! => NOT => !valor => // Altera o valor  para o contrario => Verdadeiro <> falso 

        boolean temDinheiro = true;
        boolean temTempo = false;

        // If condicional com operadores logicos
        if(temDinheiro &&  temTempo){
            System.out.println("Voce pode viajar ");
        } else {
            System.out.println("Voce nao pode viajar");
        }

        // Loop While e for
        // Foco em FOr 


        // Basicamente o While executa enquanto a condicao for verdadeira
        int contador = 1;
        while(contador <= 10){
            System.out.println(contador);
            contador++;  // Incrementa o Contador 
        }

        // Loop  For executa um bloco de codigo por um numero determinado de vezes
        // a sintaxe do for  e a seguinte:  
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        //  Exemplos Praticos de for 

        // Analise Numerica 
        int[] numeros = {3, 5, 7, 9, 11};

        int somaPar = 0;
        int somaImpar = 0;

        //  Chamar unidade da Lista 
        for(int num : numeros) {
            if(num % 2 == 0) {
                somaPar += num;
            } else {
                somaImpar += num;
            }
        }
        System.out.println("soma dos numeros pares:" + somaPar);
        System.out.println("soma dos numeros impares:" + somaImpar);
    }
    
}
