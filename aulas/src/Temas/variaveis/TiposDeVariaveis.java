package Temas.variaveis;

public class TiposDeVariaveis {
    public static void main(String[] args){
        //Tipos primitivos
        String meuNome = "Leandro";
        int idade = 37;
        double salario = 4000.00;
        Boolean casado = true;

        System.out.println("nome: " + meuNome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Salario R$ " + salario);
        System.out.println("Casado: " + casado);

        //Constantes
        final Double NUMERO_PI = 3.14;
        System.out.println("Constante: " + NUMERO_PI);

    }

}
