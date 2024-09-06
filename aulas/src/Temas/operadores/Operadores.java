package Temas.operadores;

public class Operadores {

    public static void main(String [] args){

        //operador de atribuição =
        System.out.println("Operador de atribuicao");
        String nome = "Leandro";

        System.out.println();

        //operador aritimetico +-/*
        System.out.println("Operador aritimetico");
        double soma = 10.5 + 15.7;
        int subtracao = 113 -25;
        int multiplicacao = 20 * 7;
        int modulo = 18 % 3;
        double resultado = (10*7) + (20/4);

        System.out.println("Soma = " + soma);
        System.out.println("Subtracao = " + subtracao);
        System.out.println("Multiplicacao = " + multiplicacao);
        System.out.println("Modulo = " + modulo);
        System.out.println("resultado = " + resultado);

        System.out.println();

        //operador de concatenacao +
        System.out.println("Operador de concatenacao");

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println("Concatenacao = " concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println("Concatenacao = " concatenacao);
        
        concatenacao = 1+"1"+1+"1";
        System.out.println("Concatenacao = " concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println("Concatenacao = " concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println("Concatenacao = " concatenacao);

        System.out.println();

        //operador unario + - ++ -- !
        System.out.println("Operador unario");
        int numero = 5;
        System.out.println(- numero);
        numero = - numero;
        System.out.println(numero);

        System.out.println();

        System.out.println(numero ++);
        System.out.println(++ numero);

        System.out.println();

        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);
        variavel = !variavel;
        System.out.println(variavel);

        System.out.println();

        //Operador ternario <expressao condicional> ? <caso condicao seja true> : <caso condicao seja false>
        System.out.println("Operador ternario");
        int a, b;
        a = 6;
        b = 5;

        String resultadoTernario = a==b ? "verdadeiro" : "falso";

        System.out.println(resultadoTernario);

        System.out.println();

        //Operador relacional == !=  < > <= >= equals
        System.out.println("Operador relacional");
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        boolean simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        boolean simNao = numero1 > numero2;

        System.out.println("numeroUm é maior a numeroDois? " + simNao);

        String nome1 = "Leandro";
        String nome2 = "Leandro";
        System.out.println("nome1 é igual a nome2: "nome1 == nome2);

        String nome3 = new String("Leandro");
        //maneira errada
        System.out.println("nome1 é igual a nome3: "nome1 == nome3);
        //maneira certa
        System.out.println("nome1 é igual a nome3: "nome1.equals(nome3));

        System.out.println();

        //Operadores logicos && ||
        System.out.println("Operadores logicos");

        boolean condicao1 = true;
        boolean condicao2 = false;

        //if so imprimi se condicao verdadeira
        
        if(condicao1 && condicao2){
            System.out.println("as condicoes sao verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Umas das condicoes é verdadeira");
        }






    }

}
