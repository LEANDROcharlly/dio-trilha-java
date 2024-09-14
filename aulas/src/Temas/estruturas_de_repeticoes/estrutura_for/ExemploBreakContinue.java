package Temas.estruturas_de_repeticoes.estrutura_for;

public class ExemploBreakContinue{
    public static void main(String[] args){

        for(int numero = 1; numero <= 5; numero++){

            if(numero == 3){
                break;
            }

            System.out.println(numero);

        }

        System.out.println();

        for(int numero = 1; numero <= 5; numero++){

            if(numero == 3){
                continue;
            }

            System.out.println(numero);

        }

    }
}